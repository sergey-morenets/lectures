package capgemini.nosql.redis.service;

import capgemini.nosql.redis.api.CountryStorage;
import capgemini.nosql.redis.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryStorage countryStorage;

    public Country findById(int id) {
        return countryStorage.findById(id);
    }

    public void save(Country country) {
    }
}
