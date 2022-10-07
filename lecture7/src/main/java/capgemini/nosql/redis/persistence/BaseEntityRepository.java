package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.model.BaseEntity;
import org.springframework.data.keyvalue.repository.KeyValueRepository;

public interface BaseEntityRepository<T extends BaseEntity, V> extends KeyValueRepository<T, V> {

//    @Override
//    default <S extends T> S save(S entity) {
//        return super.save(entity);
//    }
}
