package capgemini.security.web.interceptor;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String magicToken = request.getHeader(HttpHeaders.AUTHORIZATION);

        if ("Capgemini".equals(magicToken)) {
            return true;
        }
        response.sendError(HttpStatus.UNAUTHORIZED.value());

        return false;
    }
}
