package org.example

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import kotlin.test.assertEquals

class MockTest {
    @Test
    fun testMock() {
        val list = Mockito.mock(List::class.java) as List<String>

        Mockito.`when`(list[0]).thenReturn("Budi")
        Mockito.`when`(list[1]).thenReturn("Joko")

        assertEquals("Budi", list[0])
        assertEquals("Budi", list[0])
        assertEquals("Joko", list[1])

        Mockito.verify(list, Mockito.times(2))[0]
        Mockito.verify(list, Mockito.times(1))[1]

        println(list[0])
        println(list[1])
    }
}