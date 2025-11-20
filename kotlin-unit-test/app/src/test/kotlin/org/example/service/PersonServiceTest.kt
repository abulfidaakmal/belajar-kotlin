package org.example.service

import org.example.model.Person
import org.example.repository.PersonRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import kotlin.test.assertEquals

@Extensions(value = [
    ExtendWith(MockitoExtension::class)
])
class PersonServiceTest {
    @Mock
    lateinit var personRepository: PersonRepository

    lateinit var personService: PersonService

    @BeforeEach
    fun setUp() {
        personService = PersonService(personRepository)
    }

    @Test
    fun testPersonIdIsBlank() {
        assertThrows<IllegalArgumentException> {
            personService.getById("  ")
        }
    }

    @Test
    fun testPersonIsNotFound() {
        assertThrows<Exception> {
            personService.getById("not found")
        }
    }

    @Test
    fun testGetPersonByIdSuccess() {
        Mockito.`when`(personRepository.getById("1"))
            .thenReturn(Person("1", "Budi"))

        val person = personService.getById("1")
        assertEquals("1", person.id)
        assertEquals("Budi", person.name)
    }

    @Test
    fun testRegisterNameIsBlank() {
        assertThrows<IllegalArgumentException> {
            personService.register("  ")
        }
    }

    @Test
    fun testRegisterSuccess() {
        val person = personService.register("Budi")

        assertEquals("Budi", person.name)
        assertNotNull(person.id)

        Mockito.verify(personRepository, Mockito.times(1))
            .insert(Person(person.id, "Budi"))
    }
}