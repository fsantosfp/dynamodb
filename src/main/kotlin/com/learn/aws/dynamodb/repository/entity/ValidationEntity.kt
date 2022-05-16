package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.COMPLEMENTARY_INFORMATION
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.COMPLETENESS_CONFIRMATION_METHOD
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.COMPLETENESS_CONFIRMATION_SOURCE
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.DATE_TIME_VALIDATION_SOURCE
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.JOURNEY_ID
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.LEVEL_RELIABILITY_COMPLETENESS
import java.time.LocalDateTime
import java.util.*


@DynamoDBDocument
data class ValidationEntity(

    @DynamoDBAttribute(attributeName = JOURNEY_ID)
    val journeyID: UUID,

    @DynamoDBAttribute(attributeName = LEVEL_RELIABILITY_COMPLETENESS)
    val levelCompleteness: Long,

    @DynamoDBAttribute(attributeName = COMPLETENESS_CONFIRMATION_SOURCE)
    val confirmationSource: Long,

    @DynamoDBAttribute(attributeName = COMPLETENESS_CONFIRMATION_METHOD)
    val confirmationMode: Long,

    @DynamoDBAttribute(attributeName = "is_valida_completude")
    val isValidatedCompleteness: Boolean,

    @DynamoDBAttribute(attributeName = "is_critico")
    val isCritical: Boolean,

    @DynamoDBAttribute(attributeName = COMPLEMENTARY_INFORMATION )
    val information: String,

    @DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
    @DynamoDBAttribute(attributeName = DATE_TIME_VALIDATION_SOURCE )
    val sourceDataValidation: LocalDateTime,






    )
