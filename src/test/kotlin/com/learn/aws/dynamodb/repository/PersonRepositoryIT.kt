package com.learn.aws.dynamodb.repository

import com.learn.aws.dynamodb.repository.entity.PersonEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class PersonRepositoryIT {

    @Autowired lateinit var personRepository: IPersonRepository

    @Test
    fun `test save person`(){

        val personEntity = newPerson()
        personRepository.save(personEntity)
        Assertions.assertEquals("d503a197-9da6-419e-9121-d28be6e4c0ae", "d503a197-9da6-419e-9121-d28be6e4c0ae")

    }

    fun newPerson(): PersonEntity {
        return PersonEntity(UUID.fromString("d503a197-9da6-419e-9121-d28be6e4c0ae"))
    }
}