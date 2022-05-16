package com.learn.aws.dynamodb.repository

import com.learn.aws.dynamodb.repository.entity.PersonEntity

interface IPersonRepository {

    fun save(personEntity: PersonEntity): PersonEntity
}