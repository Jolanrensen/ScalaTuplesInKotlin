package nl.jolanrensen.scalaTuplesInKotlin.building

import nl.jolanrensen.scalaTuplesInKotlin.*
import scala.Tuple1
import scala.Tuple2
import scala.Tuple3

private fun main() {
    val alphabet = (1..22).toList()

//    for (a in alphabet) {
//        val numbers = (1..a).toList()
//        println(
//            "fun <T, R, ${numbers.joinToString { "T$it: T" }}> Tuple$a<${numbers.joinToString { "T$it" }}>.map(func: (T) -> R): Tuple$a<${numbers.joinToString { "R" }}> = Tuple$a<${numbers.joinToString { "R" }}>(${numbers.joinToString { "func(this._$it())" }})"
//        )
//    }
//
//    println()
//    println()
//    println()
//
//    for (a in alphabet) {
//        val numbers = (1..a).toList()
//
//        val funcs = buildList {
//            for (it in numbers)
//                add("func$it: (T$it) -> R$it")
//        }.joinToString()
//
//        println(
//            "fun <${numbers.joinToString { "T$it" }}, ${numbers.joinToString { "R$it" }}> Tuple$a<${numbers.joinToString { "T$it" }}>.mapEach($funcs): Tuple$a<${numbers.joinToString { "R$it" }}> = Tuple$a<${numbers.joinToString { "R$it" }}>(${numbers.joinToString { "func$it(this._$it())" }})"
//        )
//
//    }

    /**
     * Converts [4,1,87,1,4,4,1] to [1,2,3,2,1,1,2]
     */
    fun List<Int>.simplify(startAt: Int = 1): List<Int> {
        var i = startAt
        val map: MutableMap<Int, Int> = mutableMapOf()

        return buildList {
            for (it in this@simplify) {
                this += map.getOrPut(it) { i++ }
            }
        }
    }

//    fun List<List<Int>>.simplify(startAt: Int = 1): List<List<Int>> {
//        var i = startAt
//        val map: MutableMap<Int, Int> = mutableMapOf()
//
//        return buildList {
//            for (list in this@simplify) add(
//                buildList {
//                    for (it in list)
//                        this += map.getOrPut(it) { i++ }
//                }
//            )
//        }
//    }


    fun List<Int>.plusOne(base: Int): List<Int> {
        val list = this.toMutableList()
        for (i in indices.reversed()) {
            if (list[i] < base - 1) {
                list[i]++
                break
            }
            list[i] = 0
        }
        return list
    }

    tailrec fun countAll(
        size: Int,
        base: Int,
        current: List<Int> = List(size) { 0 },
        result: List<List<Int>> = listOf(),
    ): List<List<Int>> = when {
        current.all { it == base - 1 } -> result.plusElement(current)
        else -> countAll(
            size = size,
            base = base,
            current = current.plusOne(base),
            result = result.plusElement(current),
        )
    }

//    println(countAll(1, 1).map { it.simplify(1).map { "T$it" } }.toSet())
//    println(countAll(2, 2).map { it.simplify(1).map { "T$it" } }.toSet())
//    println(countAll(3, 3).map { it.simplify(1).map { "T$it" } }.toSet())
//    println(countAll(4, 4).map { it.simplify(1).map { "T$it" } }.toSet())

    for (a in alphabet.take(6)) {

        // like [[T1, T1, T1], [T1, T1, T2], [T1, T2, T1], [T1, T2, T2], [T1, T2, T3]]
        val typeManners = countAll(a, a).map { it.simplify(startAt = 1) }.toSet()

        for (typeManner in typeManners) {
            val tTypes = typeManner.joinToString { "T$it" }
            val rTypes = typeManner.joinToString { "R$it" }
            val typeMannerSet = typeManner.toSet()
            val allTypes = (typeMannerSet.map { "T$it" } + typeMannerSet.map { "R$it" }).joinToString()

            println(
                """@JvmName("mapPerTypeTuple${a}${(tTypes + rTypes).replace(", ", "")}") fun <$allTypes> Tuple$a<$tTypes>.mapPerType(${typeMannerSet.joinToString { "func$it: (T$it) -> R$it" }}): Tuple$a<$rTypes> = Tuple$a<$rTypes>(${typeManner.withIndex().joinToString { (i, it) -> "func$it(this._${i + 1}())" }})""".trimIndent()
            )
        }


    }

    val a = t(1, 2, 3).mapPerType(Int::toString)
    val b = t(1.0, 2L, 3.0).mapPerType(Double::toFloat, Long::toString)
    val c = t(1, 2L, 3.0).mapPerType(Int::toLong, Long::toString, Double::toFloat)
//
//    val d = t(1.0, "").mapPerType { it: String -> it.toInt() }
//
//    listOf(b, b, b, b).map { (a, b, c) ->
//
//    }

}


//// TODO
//@JvmName("mapPerTypeTuple2T1T2R2")
//fun <T1, T2, R2> Tuple2<T1, T2>.mapPerType(func2: (T2) -> R2): Tuple2<T1, R2> =
//    Tuple2<T1, R2>(this._1(), func2(this._2()))
//
//// TODO
//@JvmName("mapPerTypeTuple2T1T2R1")
//fun <T1, T2, R1> Tuple2<T1, T2>.mapPerType(func1: (T1) -> R1): Tuple2<R1, T2> =
//    Tuple2<R1, T2>(func1(this._1()), this._2())

