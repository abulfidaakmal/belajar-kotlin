package org.example

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.opentest4j.TestAbortedException
import kotlin.test.assertNotEquals

@DisplayName("Test class calculator")
class CalculatorTest {

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            println("Before all tests")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            println("After all tests")
        }
    }

    val calculator = Calculator()

    @BeforeEach
    fun beforeEach() {
        println("Before each test")
    }

    @AfterEach
    fun afterEach() {
        println("After each test")
    }

    @Test
    @DisplayName("Test function add")
    fun testAddSuccess() {
        val result = calculator.add(1, 2)
        assertEquals(result, 3)
    }

    @Test
    fun testAddSuccess2() {
        val result = calculator.add(1, 2)
        assertNotEquals(result, 5)
    }

    @Test
    @Disabled("Not implemented yet")
    fun testLater() {}

    @Test
    fun testAborted() {
        val profile = System.getenv("profile")
        if("DEV" != profile) {
            throw TestAbortedException()
        }

        println("cancel test cause profile is not DEV")
    }

    @Test
    fun testAssumptions() {
        assumeTrue("DEV" == System.getenv("profile"))

        println("cancel test cause profile is not DEV")
    }
}