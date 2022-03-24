package nl.jolanrensen.scalaTuplesInKotlin.building

import java.io.Serializable

private fun main() {
    val alphabet = (1..26).toList()
//    val words = listOf(
//        "first",
//        "second",
//        "third",
//        "fourth",
//        "fifth",
//        "sixth",
//        "seventh",
//        "eighth",
//        "ninth",
//        "tenth",
//        "eleventh",
//        "twelfth",
//        "thirteenth",
//        "fourteenth",
//        "fifteenth",
//        "sixteenth",
//        "seventeenth",
//        "eighteenth",
//        "nineteenth",
//        "twentieth",
//        "twentyFirst",
//        "twentySecond",
//    )

    data class Arity2<T1, T2>(val _1: T1, val _2: T2): Serializable

    @Deprecated("Use Scala tuples instead.", ReplaceWith("t(_1, _2)"))
    fun <T1, T2> c(_1: T1, _2: T2): Arity2<T1, T2> = Arity2<T1, T2>(_1, _2)

    for (a in alphabet) {
        val numbers = (1..a).toList()
//        println("""
//
//                @Deprecated("Use Scala tuples instead.", ReplaceWith("Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "_$it" }})", "scala.Tuple$a"))
//                data class Arity$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "val _$it: T$it" }}): Serializable""".trimIndent()
//        )
        println("""

            @Deprecated("Use Scala tuples instead.", ReplaceWith("t(${numbers.joinToString { "_$it" }})"))
            fun <${numbers.joinToString { "T$it" }}> c(${numbers.joinToString { "_$it: T$it" }}): Arity$a<${numbers.joinToString { "T$it" }}> = Arity$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "_$it" }})
        """.trimIndent())
    }

    println()

//    for (a in alphabet) {
//        val numbers = (1..a).toList()
//
//        println("""
//
//                /**
//                 * Returns a new Tuple$a of the given arguments.
//                 * @see [tupleOf]
//                 **/""".trimIndent()
//        )
//        println(
//            "fun <${numbers.joinToString { "T$it" }}> t(${numbers.joinToString { "${ words[it - 1] }: T$it" }}): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { words[it - 1] }})"
//        )
//
//    }
}