package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    //@Query("UPDATE COUNTRY SET name=?1 and code=?2 WHERE id =?3")
    @Query("UPDATE COUNTRY SET name=:name and code=:code WHERE id =:id")
    @Modifying
    @Transactional
    void update(@Param("name") String name, @Param("code") String code, @Param("id") int id);
}
