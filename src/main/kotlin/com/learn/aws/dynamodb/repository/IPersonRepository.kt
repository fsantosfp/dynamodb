package com.learn.aws.dynamodb.repository

import com.learn.aws.dynamodb.repository.entity.PersonEntity
import java.util.UUID

interface IPersonRepository {

    fun save(personEntity: PersonEntity): PersonEntity
    fun getById(tenantId: UUID): PersonEntity
}