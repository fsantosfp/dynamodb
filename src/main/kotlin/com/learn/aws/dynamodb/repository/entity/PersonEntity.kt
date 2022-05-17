package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.*
import com.learn.aws.dynamodb.repository.constants.PersonTableConstants.Companion.TENANT_ID
import java.util.*

@DynamoDBTable(tableName = "tbeq3171_pess_dynamo")
data class PersonEntity(

    @DynamoDBHashKey(attributeName = TENANT_ID)
    var tenantId: UUID ?= null,

    @DynamoDBAttribute(attributeName = "documento_originacao")
    var originationDocumentEntity: OriginationDocumentEntity ?= null
)
