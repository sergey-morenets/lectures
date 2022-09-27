package capgemini.nosql.redis.web;

import capgemini.nosql.redis.model.Country;
import capgemini.nosql.redis.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("{id}")
    //@Cacheable("countries")
    public Country findById(@PathVariable int id) {
        return countryService.findById(id);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Country country) throws URISyntaxException {
        countryService.save(country);

        //return ResponseEntity.ok(country.getId());
        // return ResponseEntity.ok("Country created successfully");
        return ResponseEntity.created(new URI("/countries/" + country.getId())).build();
    }
}
