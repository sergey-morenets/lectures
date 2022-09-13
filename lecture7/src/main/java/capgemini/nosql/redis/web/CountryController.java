package capgemini.nosql.redis.web;

import capgemini.nosql.redis.model.Country;
import capgemini.nosql.redis.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
