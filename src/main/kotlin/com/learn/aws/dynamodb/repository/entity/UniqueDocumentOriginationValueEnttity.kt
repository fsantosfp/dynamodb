package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.*
import com.learn.aws.dynamodb.repository.converters.LocalDateConverter
import java.time.LocalDateTime

@DynamoDBDocument
data class UniqueDocumentOriginationValueEnttity(

    @DynamoDBAttribute(attributeName = "tipo")
    var originationDocumentType: Long ?= null,

    @DynamoDBAttribute(attributeName = "numero")
    var originationDocumentNumber: String ?= null,

    @DynamoDBAttribute(attributeName = "pais")
    var originationDocumentCountry: String ?= null,

    @DynamoDBTypeConverted(converter = LocalDateConverter::class)
    @DynamoDBAttribute(attributeName = "data_criacao")
    var originationDocumentCreateDate: LocalDateTime ?= null

    )
