package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument

@DynamoDBDocument
data class OriginationDocumentEntity(

    @DynamoDBAttribute(attributeName = "valor_cadastral")
    var uniqueValue: UniqueDocumentOriginationValueEnttity ?= null,

    @DynamoDBAttribute(attributeName = "validacoes")
    var validations: List<ValidationEntity> ?= null

)

