package org.example

import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LifecycleTest {

    @BeforeAll
    fun beforeAll() {
        println("Before all tests")
    }

    @AfterAll
    fun afterAll() {
        println("After all tests")
    }

    @Test
    fun test1() {
        println(this.hashCode())
    }

    @Test
    fun test2() {
        println(this.hashCode())
    }

}