package nl.jolanrensen.scalaTuplesInKotlin

import org.junit.Test


class Test {

    @Test
    fun `Test tuple textual accessors`() {
        val a = tupleOf(1, 2, 3)
        assert(a.first == 1)
        assert(a.second == 2)
        assert(a.third == a.last && a.last == 3)
    }

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

        assert(
            tupleOf(1).appendedBy(tupleOf("test")) == tupleOf(1, tupleOf("test"))
        )
    }

    @Test
    fun `Test tuple contains`() {
        assert(
            1 in tupleOf(1, 2, 3)
        )

        assert(
            0 !in tupleOf(1, 2, 3)
        )

        assert(
            tupleOf(1, 2, 3)
                .iterator()
                .asSequence()
                .toSet() == setOf(1, 2, 3)
        )

        for (it in tupleOf(1, 1, 1)) {
            assert(it == 1)
        }

        assert(
            tupleOf(1, 2, 3).asIterable().map { it as Int }.isNotEmpty()
        )

        assert(
            tupleOf(1, 2, 3)
                .asIterable()
                .none { (it as Int) > 4 }
        )

        assert(
            tupleOf(1, 2, 3, 4, 5).size == 5
        )

        assert(
            tupleOf(1, 2, 3, 4)[0] == 1
        )


    }

}