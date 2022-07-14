package capgemini.security.config;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Date;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    private final String key = "pHaSCFyT68deJL10oNGgyfnKHDHKyTg8T9I6VKLmVX+FNWrwSMmX0soKoHFjKMbT2D7DCSPxfBg6iH0xu5mw5w==";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (StringUtils.hasText(authHeader)) {  //Bearer:
            return validate(authHeader);
        }
        return false;
    }

    private boolean validate(String authHeader) {
        JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(toSecretKey(key)).build();
        Jws<Claims> jws = jwtParser.parseClaimsJws(authHeader);
        String userName = jws.getBody().getSubject();
        return true;
    }

    private String generateToken(String userName) {
        Date expiration = Date.from(LocalDateTime.now().plusHours(1).atZone(ZoneId.systemDefault()).toInstant());

        return Jwts.builder().setExpiration(expiration).setSubject(userName).signWith(toSecretKey(key)).compact();
    }

    public static SecretKey toSecretKey(String text) {
        byte[] decodedKey = Base64.getDecoder().decode(text);
        return new SecretKeySpec(decodedKey, SignatureAlgorithm.HS512.getJcaName());
    }

    public static void main(String[] args) throws Exception {
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
        String key = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println(key);
    }
}
