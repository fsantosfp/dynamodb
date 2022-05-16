package com.learn.aws.dynamodb.repository

import com.learn.aws.dynamodb.repository.entity.PersonEntity
import com.learn.aws.dynamodb.util.RequestDataBuilder.Companion.newCreateCompanyRequest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PersonRepositoryIT {

    @Autowired
    lateinit var personRepository: IPersonRepository
    lateinit var createCompanyRequest: PersonEntity
    @BeforeEach
    fun setup() {
        createCompanyRequest = newCreateCompanyRequest()
    }

    @Test
    fun `test save person`(){
        val newPerson = personRepository.save(createCompanyRequest)
        Assertions.assertNotNull(newPerson)
        Assertions.assertEquals(newPerson.tenantId, createCompanyRequest.tenantId)
    }
}