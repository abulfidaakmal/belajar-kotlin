package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.util.Random

class InheritanceTest: ParentCalculatorTest() {

    @Test
    fun testRandom(random: Random) {
        val first = random.nextInt(100)
        val second = random.nextInt(100)

        val result = calculator.add(first, second)
        assertEquals(first + second, result)
    }

    @DisplayName("Test calculator random")
    @RepeatedTest(
        value = 5,
        name = "{displayName} {currentRepetition} to {totalRepetition}"
    )
    fun testRepeated(random: Random) {
        val first = random.nextInt(100)
        val second = random.nextInt(100)

        val result = calculator.add(first, second)
        assertEquals(first + second, result)
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3, 4, 5])
    fun testWithParam(value: Int) {
        val result = calculator.add(value, value)
        assertEquals(value + value, result)
    }

    @ParameterizedTest
    @MethodSource(value = ["paramSource"])
    fun testWithMethodSource(value: Int) {
        val result = calculator.add(value, value)
        assertEquals(value + value, result)
    }

    companion object {
        @JvmStatic
        fun paramSource(): List<Int> {
            return listOf(1, 2, 3, 4, 5)
        }
    }
}