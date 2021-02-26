package nl.jolanrensen.scalaTuplesInKotlin

import org.junit.Test


class Test {

    @Test
    fun `Test tuple concatenation`() {
        assert(
            tupleOf(1) + tupleOf("test") == tupleOf(1, "test")
        )

        assert(
            tupleOf(1) + tupleOf("test", 5L) == tupleOf(1, "test", 5L)
        )
    }

    @Test
    fun `Test tuple extending`() {
        assert(
            tupleOf(1).."test" == tupleOf(1, "test")
        )

        assert(
            1..tupleOf("test") == tupleOf(1, "test")
        )

        assert(
            1..tupleOf("test")..6L == tupleOf(1, "test", 6L)
        )
    }


}