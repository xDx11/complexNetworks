package cz.uhk.fim.complexnet.dao;

import cz.uhk.fim.complexnet.entity.TestEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class TestEntityJpaDao implements  TestEntityDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveTestEntity(TestEntity testEntity) {
        em.persist(testEntity);
    }
}
