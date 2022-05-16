package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument
import com.learn.aws.dynamodb.repository.constants.PersonTableConstants.Companion.COMPLETENESS_CONFIRMATION_METHOD
import com.learn.aws.dynamodb.repository.constants.PersonTableConstants.Companion.LEVEL_RELIABILITY_COMPLETENESS

@DynamoDBDocument
data class ValidationEntity(

    @DynamoDBAttribute(attributeName = LEVEL_RELIABILITY_COMPLETENESS)
    val levelCompleteness: Long,

    @DynamoDBAttribute(attributeName = COMPLETENESS_CONFIRMATION_METHOD)
    val confirmationMode: String

)
