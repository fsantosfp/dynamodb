package com.learn.aws.dynamodb.repository.config

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB

interface IDynamoDBConfig {
    fun dynamoDBClient(): AmazonDynamoDB
}