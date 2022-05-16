package com.learn.aws.dynamodb.repository.impl

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.learn.aws.dynamodb.repository.IPersonRepository
import com.learn.aws.dynamodb.repository.config.IDynamoDBConfig
import com.learn.aws.dynamodb.repository.entity.PersonEntity
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class PersonRepositoryImpl(private val dynamoDBConfig: IDynamoDBConfig): IPersonRepository {

    override fun save(personEntity: PersonEntity): PersonEntity {

        val amazonDynamoDBClient = dynamoDBConfig.dynamoDBClient()
        val dynamoDBMapper = DynamoDBMapper(amazonDynamoDBClient)
        dynamoDBMapper.save(personEntity)

        personEntity.tenantId = UUID.fromString("b012d024-94d8-4660-b5ed-78fc7b6327ce")

        return personEntity
    }
}