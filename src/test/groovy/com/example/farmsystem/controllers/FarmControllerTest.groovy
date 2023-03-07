package com.example.farmsystem.controllers


import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FarmControllerTest extends Specification {
    RestTemplate restTemplate = new RestTemplate()


    def "integration test test"() {
        when: "test"
        def res = restTemplate.getForEntity("http://localhost:8080/farm", String.class)

        then: "assert"
        res.body == "implement getting farm for logged in user"
    }


}
