package cz.uhk.fim.complexnet.controller;

import cz.uhk.fim.complexnet.service.TestEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestEntityService testEntityService;

    @PutMapping("article")
    public ResponseEntity updateArticle() {
        testEntityService.testEntityTest();
        return new ResponseEntity(HttpStatus.OK);
    }


}
