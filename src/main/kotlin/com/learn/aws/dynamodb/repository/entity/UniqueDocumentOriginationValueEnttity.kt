package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped
import java.time.LocalDateTime

@DynamoDBDocument
data class UniqueDocumentOriginationValueEnttity(

    @DynamoDBAttribute(attributeName = "tipo")
    val originationDocumentType: Long,

    @DynamoDBAttribute(attributeName = "numero")
    val originationDocumentNumber: String,

    @DynamoDBAttribute(attributeName = "pais")
    val originationDocumentCountry: String,

    @DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
    @DynamoDBAttribute(attributeName = "data_criacao")
    val originationDocumentCreateDate: LocalDateTime

    )
