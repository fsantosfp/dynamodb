package com.learn.aws.dynamodb.util

import com.learn.aws.dynamodb.repository.entity.OriginationDocumentEntity
import com.learn.aws.dynamodb.repository.entity.PersonEntity
import com.learn.aws.dynamodb.repository.entity.UniqueDocumentOriginationValueEnttity
import com.learn.aws.dynamodb.repository.entity.ValidationEntity
import java.time.LocalDateTime
import java.util.*

class RequestDataBuilder {

    companion object {
        fun newCreateCompanyRequest(): PersonEntity {

            return  PersonEntity(

                tenantId = UUID.fromString("1a3473dd-1b24-4302-a02c-60a59c7ddcab"),
                originationDocumentEntity = newOriginationDocumentEntity()

            )

        }

        private fun newOriginationDocumentEntity() : OriginationDocumentEntity {
            return OriginationDocumentEntity(
                uniqueValue = UniqueDocumentOriginationValueEnttity(
                    originationDocumentType = 559,
                    originationDocumentNumber = "98737886000155",
                    originationDocumentCountry = "BR",
                    originationDocumentCreateDate = LocalDateTime.now()
                ),

                validations = listOf( ValidationEntity(
                    journeyID = UUID.fromString("45dffe42-91cb-42b7-9236-5cd216460796"),
                    levelCompleteness = 200,
                    confirmationSource = 12456,
                    confirmationMode = 123456,
                    isValidatedCompleteness = true,
                    isCritical = true,
                    information = "id microchip",
                    sourceDataValidation = LocalDateTime.now()
                ))
            )
        }

    }
}