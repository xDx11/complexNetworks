package cz.uhk.fim.complexnet.service;

import cz.uhk.fim.complexnet.dao.TestEntityDao;
import cz.uhk.fim.complexnet.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestEntityServiceImpl implements TestEntityService {

    @Autowired
    private TestEntityDao testEntityDao;

    @Override
    public void testEntityTest(){
        TestEntity testEntity = new TestEntity();
        testEntity.setName("testName");
        testEntityDao.saveTestEntity(testEntity);
    }
}
