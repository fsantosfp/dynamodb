package com.learn.aws.dynamodb.repository.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.COMPLEMENTARY_INFORMATION
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.COMPLETENESS_CONFIRMATION_METHOD
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.COMPLETENESS_CONFIRMATION_SOURCE
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.DATE_TIME_VALIDATION_SOURCE
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.JOURNEY_ID
import com.learn.aws.dynamodb.repository.constants.CompletenessTableConstants.Companion.LEVEL_RELIABILITY_COMPLETENESS
import com.learn.aws.dynamodb.repository.converters.LocalDateConverter
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*


@DynamoDBDocument
data class ValidationEntity(

    @DynamoDBAttribute(attributeName = JOURNEY_ID)
    var journeyID: UUID ?= null,

    @DynamoDBAttribute(attributeName = LEVEL_RELIABILITY_COMPLETENESS)
    var levelCompleteness: Long ?= null,

    @DynamoDBAttribute(attributeName = COMPLETENESS_CONFIRMATION_SOURCE)
    var confirmationSource: Long ?= null,

    @DynamoDBAttribute(attributeName = COMPLETENESS_CONFIRMATION_METHOD)
    var confirmationMode: Long ?= null,

    @DynamoDBAttribute(attributeName = "is_valida_completude")
    var isValidatedCompleteness: Boolean = false,

    @DynamoDBAttribute(attributeName = "is_critico")
    var isCritical: Boolean = false,

    @DynamoDBAttribute(attributeName = COMPLEMENTARY_INFORMATION )
    var information: String ?= null ,

    @DynamoDBTypeConverted(converter = LocalDateConverter::class)
    @DynamoDBAttribute(attributeName = DATE_TIME_VALIDATION_SOURCE )
    var sourceDataValidation: LocalDateTime ?= null

    )
