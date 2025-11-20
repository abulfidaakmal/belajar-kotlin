package org.example.service

import org.example.model.Person
import org.example.repository.PersonRepository
import java.util.UUID

class PersonService(private val personRepository: PersonRepository) {

    fun getById(id: String): Person {
        if(id.isBlank()) {
            throw IllegalArgumentException("id cannot be blank")
        }

        val person = personRepository.getById(id)

        if(person != null) {
            return person
        } else {
            throw Exception("person cannot be found")
        }
    }

    fun register(name: String): Person {
        if(name.isBlank()) {
            throw IllegalArgumentException("name cannot be blank")
        }

        val person = Person(UUID.randomUUID().toString(), name)

        personRepository.insert(person)

        return person
    }
}