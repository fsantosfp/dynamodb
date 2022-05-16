package com.learn.aws.dynamodb.repository.config.impl

import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import com.learn.aws.dynamodb.repository.config.IDynamoDBConfig
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class DynamoDBConfig(): IDynamoDBConfig {

    @Value("\${dynamo.db.local.endpoint")
    val dynamodbLocalUrl: String? = null

    @Value("\${cloud.aws.region.static")
    val awsDynamoDBRegion: String? = null

    override fun dynamoDBClient(): AmazonDynamoDB {

        val amazonDynamoBuilder = AmazonDynamoDBClientBuilder.standard()

        if(dynamodbLocalUrl?.isNotBlank() == true ){
            amazonDynamoBuilder.withEndpointConfiguration(
                AwsClientBuilder.EndpointConfiguration(dynamodbLocalUrl, awsDynamoDBRegion)
            )
        }
        return amazonDynamoBuilder.build()
    }
}