package nl.jolanrensen.scalaTuplesInKotlin

import org.junit.Test
import scala.Tuple1
import scala.Tuple2
import scala.Tuple3
import scala.Tuple4
import scala.reflect.internal.Trees
import java.io.Serializable

@Deprecated("Use Scala tuples instead.", ReplaceWith("Tuple1<T1>(_1)", "scala.Tuple1"))
data class Arity1<T1>(val _1: T1) : Serializable

@Deprecated("Use Scala tuples instead.", ReplaceWith("Tuple2<T1, T2>(_1, _2)", "scala.Tuple2"))
data class Arity2<T1, T2>(val _1: T1, val _2: T2) : Serializable


@Deprecated("Use Scala tuples instead.", ReplaceWith("t(_1, _2)"))
fun <T1, T2> c(_1: T1, _2: T2): Arity2<T1, T2> = Arity2<T1, T2>(_1, _2)


class Test {

    @Test
    fun test() {
        val a = Arity2("1", 4)
        val b = c("1", 4)
        val c = Arity2("1", 4)
        val df = Arity2("1", 4)
    }

    @Test
    fun `Test all tuple creation methods`() {

        val a: Tuple3<Int, Int, Int> = t(1) + 2 + 3
        val b: Tuple3<Int, Int, Int> = 1 + t(2) + 3
        val c: Tuple3<Int, Int, Int> = t(1, 2) + t(3)
        val d: Tuple3<Int, Int, Int> = t(1, 2).concat(t(3))
        val e: Tuple3<Int, Int, Tuple1<Int>> = t(1, 2).appendedBy(t(3))

        listOf(
            1 then 2L then "3",
            t + 1 + 2L + "3",
            1 + t + 2L + "3",
            t() + 1 + 2L + "3",
            tupleOf() + 1 + 2L + "3",
            EmptyTuple + 1 + 2L + "3",
            emptyTuple() + 1 + 2L + "3",
            t(1, 2L, "3"),
            tupleOf(1, 2L, "3"),
            Tuple3(1, 2L, "3"),
            t(1, 2L) + "3",
            1 + t(2L) + "3",
            1 + t(2L, "3"),
        ).forEach {
            assert(it == t(1, 2L, "3"))
        }
    }

    @Test
    fun `Test tuple textual accessors`() {
        val a: Tuple3<Int, Int, Int> = tupleOf(1, 2, 3)
        assert(a.first() == 1)
        assert(a.dropFirst().first() == 2)
        assert(a.last() == 3)
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
            (tupleOf(1) + "test") == tupleOf(1, "test")
        )

        assert(
            1 + tupleOf("test") == tupleOf(1, "test")
        )

        assert(
            1 + tupleOf("test") + 6L == tupleOf(1, "test", 6L)
        )

        assert(
            tupleOf(1).appendedBy(tupleOf("test")) == tupleOf(1, tupleOf("test"))
        )
    }


    @Test
    fun `Test tuple copying`() {
        assert(
            (t + 1 + "a") == t(1, "b").copy(_2 = "a")
        )

        assert(
            t(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                1, // different!
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
            ) == t(
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
            ).copy(
                _1 = 0,
                _2 = 0,
                _3 = 0,
                _4 = 0,
                _5 = 0,
                _6 = 0,
                _7 = 0,
                _8 = 0,
                _9 = 0,
                // _10 keep same
                _11 = 0,
                _12 = 0,
                _13 = 0,
                _14 = 0,
                _15 = 0,
                _16 = 0,
                _17 = 0,
                _18 = 0,
                _19 = 0,
                _20 = 0,
                _21 = 0,
                _22 = 0,
            )

        )
    }

//    @Test
//    fun `Test destructed tuple builders`() {
//
//        // value u value
//        val a = 1 u 2L
//        assert(a == tupleOf(1, 2L))
//
//        // tuple u value
//        val b = 1 u 2L u ""
//        assert(b == tupleOf(1, 2L, ""))
//
//        // value u tuple: Same as tuple u value
//        // { value }: Not done, use { value.u }
//        // tuple u tuple: Not done, use tuple u value u value... or {}
//
//        // value u { tuple }
//        val c = 1 u { 2L u "" }
//        assert(c == tupleOf(1, tupleOf(2L, "")))
//
//        // { tuple } u value
//        val d = { 1 u 2L } u ""
//        assert(d == tupleOf(tupleOf(1, 2L), ""))
//
//        // tuple u { tuple }
//        val e = 1 u 2L u { "".u }
//        assert(e == tupleOf(1, 2L, tupleOf("")))
//
//        // { tuple } u tuple: Done using { tuple } u value u value...
//        val f = { 1.u } u 2L u ""
//        assert(f == tupleOf(tupleOf(1), 2L, ""))
//
//        // { tuple } u { tuple }
//        val g = { 1.u } u { 2L u "" }
//        assert(g == tupleOf(tupleOf(1), tupleOf(2L, "")))
//
//        val u = "test"
//        val h = u u u u u
//        assert(h == tupleOf(u, u, u))
//
//        val i = { 1 u 'b' } u { "!" u 43+2 }
//        assert(i == tupleOf(tupleOf(1, 'b'), tupleOf("!", 43+2)))
//
//
//        val tuple = { 1 u "b" u 5 } u 6 u "test" u { 6.u }
//        assert(tuple.first.first == 1)
//        assert(tuple.first.second == "b")
//        assert(tuple.first.third == 5)
//        assert(tuple.second == 6)
//        assert(tuple.third == "test")
//        assert(tuple.fourth.first == 6)
//
//        val tuplb = "b" u { 5 u 6 u "test" }
//        assert(tuplb.first == "b")
//        assert(tuplb.second.first == 5)
//        assert(tuplb.second.second == 6)
//        assert(tuplb.second.third == "test")
//
//        val tuplc = 1 u "b" u { 5 u 6 u "test" }
//        assert(tuplc.first == 1)
//        assert(tuplc.second == "b")
//        assert(tuplc.third.first == 5)
//        assert(tuplc.third.second == 6)
//        assert(tuplc.third.third == "test")
//
//        val tuple2 = "4" u 6L u { 5 u { 5 u 6.0 } u { 6 u "blabla" } }
//        assert(tuple2.first == "4")
//        assert(tuple2.second == 6L)
//        assert(tuple2.third.first == 5)
//        assert(tuple2.third.second.first == 5)
//        assert(tuple2.third.second.second == 6.0)
//        assert(tuple2.third.third.first == 6)
//        assert(tuple2.third.third.second == "blabla")
//
////        val (a, b, c, d) = "test" u 5L u 7 u 3.0
//
//
//    }

    @Test
    fun `Test drop functions`() {
        assert(
            tupleOf(1, 2L, "").dropLast() == tupleOf(1, 2L)
        )

        assert(
            tupleOf(1, 2L, "").dropFirst() == tupleOf(2L, "")
        )

        assert(
            tupleOf(1).dropFirst() == tupleOf()
        )

        assert(
            tupleOf(1).dropLast() == tupleOf()
        )
    }

    @Test
    fun `Test tuple QOL functions`() {

        assert(
            0 !in tupleOf()
        )

        assert(
            1 in tupleOf(1, 2, 3)
        )

        assert(
            0 !in tupleOf(1, 2, 3)
        )

        assert(
            tupleOf(1, 2, 3).iterator().asSequence().toSet() == setOf(1, 2, 3)
        )

        for (it in tupleOf(1, 1, 1)) {
            assert(it == 1)
        }

        assert(
            tupleOf(1, 2, 3).toList().isNotEmpty()
        )

        assert(tupleOf(1, 2, 3).asIterable().none {
            it > 4
        })

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
            tupleOf(1, 2, 3, 4, 5, 6, 7)[1..3].containsAll(listOf(2, 3, 4))
        )

        assert(
            tupleOf(1, 1, 2)[1..2] == tupleOf(1, 2, 2)[0..1]
        )

        assert(
            tupleOf(1, 2) == tupleOf(2, 1).swap()
        )

        val a: List<Super> = tupleOf(A(), B()).toList()

        assert(
            tupleOf(1 to "Test") == tupleOf(1 to "Test")
        )
    }

    interface Super

    class A : Super
    class B : Super

}

