package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable
import com.learn.aws.dynamodb.repository.constants.PersonTableConstants.Companion.TENANT_ID
import java.util.*

@DynamoDBTable(tableName = "tbeq3171_pess_dynamo")
data class PersonEntity(

    @DynamoDBHashKey(attributeName = TENANT_ID)
    val tenantId: UUID,

    @DynamoDBAttribute(attributeName = "documento_originacao")
    val originationDocumentEntity: OriginationDocumentEntity
)
