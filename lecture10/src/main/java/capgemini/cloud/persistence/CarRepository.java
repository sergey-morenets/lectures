package capgemini.cloud.persistence;

import capgemini.cloud.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CarRepository extends MongoRepository<Car, String> {

    List<Car> findByModel(String model);
}
