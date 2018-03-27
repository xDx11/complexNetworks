package cz.uhk.fim.complexnet.dao;

import cz.uhk.fim.complexnet.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityDao {

    void saveTestEntity(TestEntity testEntity);

}
