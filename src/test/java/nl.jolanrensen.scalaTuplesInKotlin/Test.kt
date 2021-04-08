package nl.jolanrensen.scalaTuplesInKotlin

import org.junit.Test


class Test {

    @Test
    fun `Test tuple textual accessors`() {
        val a = tupleOf(1, 2, 3)
        assert(a.first == 1)
        assert(a.first() == 1)
        assert(a.second == 2)
        assert(a.third == a.last() && a.last() == 3)
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
    fun `Test destructed tuple builders`() {

        val tuple = { 1 u "b" u 5 } u 6 u "test" u { 6.u }
        assert(tuple.first.first == 1)
        assert(tuple.first.second == "b")
        assert(tuple.first.third == 5)
        assert(tuple.second == 6)
        assert(tuple.third == "test")
        assert(tuple.fourth.first == 6)

        val tuplb = "b" u { 5 u 6 u "test" }
        assert(tuplb.first == "b")
        assert(tuplb.second.first == 5)
        assert(tuplb.second.second == 6)
        assert(tuplb.second.third == "test")

        val tuplc = 1 u "b" u { 5 u 6 u "test" }
        assert(tuplc.first == 1)
        assert(tuplc.second == "b")
        assert(tuplc.third.first == 5)
        assert(tuplc.third.second == 6)
        assert(tuplc.third.third == "test")

        val tuple2 = "4" u 6L u { { 5 u 6.0 } u { 6 u "blabla" } }
        assert(tuple2.first == "4")
        assert(tuple2.second == 6L)
        assert(tuple2.third.first.first == 5)
        assert(tuple2.third.first.second == 6.0)
        assert(tuple2.third.second.first == 6)
        assert(tuple2.third.second.second == "blabla")

        val (a, b, c, d) = "test" u 5L u 7 u 3.0


    }


    @Test
    fun `Test tuple QOL functions`() {
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
            tupleOf(1, 2, 3).asIterable().toList().isNotEmpty()
        )

        assert(
            tupleOf(1, 2, 3)
                .asIterable()
                .none {
                    it > 4
                }
        )

        assert(
            tupleOf(1, 2, 3, 4, 5).size == 5
        )

        assert(
            tupleOf(1, 2, 3, 4)[0] == 1
        )

        assert(
            tupleOf(1, 2, 3).toTriple() == Triple(1, 2, 3)
        )

        assert(
            tupleOf(1, 2, 3, 4, 5, 6, 7)[1..3]
                .containsAll(listOf(2, 3, 4))
        )

        assert(
            tupleOf(1, 1, 2)[1..2] == tupleOf(1, 2, 2)[0..1]
        )

        assert(
            tupleOf(1, 2) == tupleOf(2, 1).swap()
        )

        val a: List<Super> = tupleOf(A(), B()).asIterable().toList()

        assert(
            tupleOf(1 to "Test") == tupleOf(1 to "Test")
        )
    }

    interface Super

    class A : Super
    class B : Super

}

