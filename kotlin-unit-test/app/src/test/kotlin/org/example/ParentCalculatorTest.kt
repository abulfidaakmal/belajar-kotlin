package org.example

import org.example.resolver.RandomParamResolver
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions

@Extensions(value = [
    ExtendWith(RandomParamResolver::class)
])
abstract class ParentCalculatorTest {
    val calculator = Calculator()

    @BeforeEach
    fun beforeEach() {
        println("Before each")
    }
}