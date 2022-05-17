package com.learn.aws.dynamodb.repository

import com.fasterxml.jackson.databind.ObjectMapper
import com.learn.aws.dynamodb.repository.entity.PersonEntity
import com.learn.aws.dynamodb.util.RequestDataBuilder.Companion.newCreateCompanyRequest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

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
        personRepository.save(createCompanyRequest)

        val newPerson = personRepository.getById(UUID.fromString("fd025f94-27ed-4e26-a29d-ec20a78ef846"))
        Assertions.assertNotNull(newPerson)
        Assertions.assertEquals(newPerson.tenantId, createCompanyRequest.tenantId)
    }

    @Test
    fun `test get person by ID`(){
        val newPerson = personRepository.getById(UUID.fromString("fd025f94-27ed-4e26-a29d-ec20a78ef846"))

        Assertions.assertNotNull(newPerson)
        Assertions.assertEquals(newPerson.tenantId, UUID.fromString("fd025f94-27ed-4e26-a29d-ec20a78ef846"))
        Assertions.assertEquals(newPerson.originationDocumentEntity?.uniqueValue?.originationDocumentCountry, "BR")
    }
}