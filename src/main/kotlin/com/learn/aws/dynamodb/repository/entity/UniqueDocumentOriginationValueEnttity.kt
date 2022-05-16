package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument

@DynamoDBDocument
data class UniqueDocumentOriginationValueEnttity(

    @DynamoDBAttribute(attributeName = "tipo")
    val originationDocumentType: Long,

    @DynamoDBAttribute(attributeName = "numero")
    val originationDocumentNumber: String,

    @DynamoDBAttribute(attributeName = "pais")
    val originationDocumentCountry: String,

    @DynamoDBAttribute(attributeName = "data_criacaoo")
    val originationDocumentCreateDate: String,

    )
