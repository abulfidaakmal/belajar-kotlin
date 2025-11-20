package org.example.repository

import org.example.model.Person

interface PersonRepository {

    fun getById(id: String): Person?

    fun insert(person: Person)

}