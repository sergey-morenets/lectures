package capgemini.nosql.redis.api;

import capgemini.nosql.redis.model.Country;

public interface CountryStorage {

    Country findById(int id);
}
