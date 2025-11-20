package org.example

import org.example.resolver.RandomParamResolver
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.*
import java.util.Random

@Extensions(value = [
    ExtendWith(RandomParamResolver::class)
])
class RandomCalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testRandom(random: Random) {
        val first = random.nextInt(100)
        val second = random.nextInt(100)

        val result = calculator.add(first, second)
        assertEquals(first + second, result)
    }
}