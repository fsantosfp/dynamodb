package com.learn.aws.dynamodb.repository.converters

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class LocalDateConverter(): DynamoDBTypeConverter<String, LocalDateTime> {

    override fun convert( localDate: LocalDateTime?): String? {
        return localDate?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    }

    override fun unconvert(localDate: String?): LocalDateTime {
        return LocalDateTime.parse(localDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    }

}