package com.example.farmsystem.controllers

import com.example.farmsystem.FarmSystemApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@ContextConfiguration(classes = FarmSystemApplication.class)
class FarmControllerTest extends Specification {

    @Autowired
    FarmController farmController;

    RestTemplate restTemplate


    @LocalServerPort
    int port

    def setup() {
        restTemplate = new RestTemplate()
    }

    def "integration test test"() {
        given:"url"

        def url = "http://localhost:" + port + "/farm"

        when: "test"
        def res = restTemplate.getForEntity(url, String.class)

        then: "assert"
        res.body == "implement getting farm for logged in user"
    }


}
