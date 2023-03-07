package com.example.farmsystem

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*


@SpringBootTest()
abstract class BaseITSpec extends Specification {

    @Autowired
    ApplicationContext applicationContext
}
