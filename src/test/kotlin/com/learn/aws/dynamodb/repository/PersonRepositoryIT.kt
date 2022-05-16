package com.learn.aws.dynamodb.repository

import com.learn.aws.dynamodb.repository.entity.OriginationDocumentEntity
import com.learn.aws.dynamodb.repository.entity.PersonEntity
import com.learn.aws.dynamodb.repository.entity.UniqueDocumentOriginationValueEnttity
import com.learn.aws.dynamodb.repository.entity.ValidationEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Profile
import org.springframework.test.context.ActiveProfiles
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.List

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

        val validation = ValidationEntity(200, "confirmado")
        val validations: List<ValidationEntity> = listOf(validation)

        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        val formatted = current.format(formatter)

        return PersonEntity(
            UUID.fromString("d503a197-9da6-419e-9121-d28be6e4c0ae"),
            OriginationDocumentEntity(
                UniqueDocumentOriginationValueEnttity(
                    500, "1", "BR", formatted
                ), validations
            )
        )
    }
}