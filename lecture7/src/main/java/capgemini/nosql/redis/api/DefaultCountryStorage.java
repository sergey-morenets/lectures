package capgemini.nosql.redis.api;

import capgemini.nosql.redis.model.Country;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class DefaultCountryStorage implements CountryStorage {
    private final Map<Integer, Country> countries = new ConcurrentHashMap<>();

    @Override
    public Country findById(int id) {
        return countries.get(id);
    }

    @PostConstruct
    void init() {
        countries.put(1, new Country(1, "Ukraine"));
    }
}
