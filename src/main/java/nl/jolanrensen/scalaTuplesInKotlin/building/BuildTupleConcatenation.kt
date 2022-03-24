package nl.jolanrensen.scalaTuplesInKotlin.building

import nl.jolanrensen.scalaTuplesInKotlin.EmptyTuple
import scala.Tuple1


private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbers1 = (1..a).toList()

        println(
            "infix fun <${numbers1.joinToString { "T$it" }}> EmptyTuple.concat(other: Tuple$a<${numbers1.joinToString { "T$it" }}>): Tuple$a<${numbers1.joinToString { "T$it" }}> = other.clone()"
        )
        println(
            "infix fun <${numbers1.joinToString { "T$it" }}> Tuple$a<${numbers1.joinToString { "T$it" }}>.concat(other: EmptyTuple): Tuple$a<${numbers1.joinToString { "T$it" }}> = this.clone()"
        )
        for (b in alphabet) {
            val numbers2 = (a + 1..a + b).toList()

            val numbers = numbers1 + numbers2

            if (numbers.size > 22) continue

            println(
                "infix fun <${numbers.joinToString { "T$it" }}> Tuple$a<${numbers1.joinToString { "T$it" }}>.concat(other: Tuple$b<${numbers2.joinToString { "T$it" }}>): Tuple${a + b}<${numbers.joinToString { "T$it" }}> = Tuple${a + b}<${numbers.joinToString { "T$it" }}>(${numbers1.joinToString { "this._$it()" }}, ${numbers2.indices.joinToString { "other._${it + 1}()" }})"
            )

        }
    }

    println()

    for (a in alphabet) {
        val numbers1 = (1..a).toList()

        println(
            "operator fun <${numbers1.joinToString { "T$it" }}> EmptyTuple.plus(other: Tuple$a<${numbers1.joinToString { "T$it" }}>): Tuple$a<${numbers1.joinToString { "T$it" }}> = other.clone()"
        )
        println(
            "operator fun <${numbers1.joinToString { "T$it" }}> Tuple$a<${numbers1.joinToString { "T$it" }}>.plus(other: EmptyTuple): Tuple$a<${numbers1.joinToString { "T$it" }}> = this.clone()"
        )

        for (b in alphabet) {
            val numbers2 = (a + 1..a + b).toList()

            val numbers = numbers1 + numbers2

            if (numbers.size > 22) continue

//            println(
//                "operator fun <${numbers.joinToString { "T$it" }}> Tuple$a<${numbers1.joinToString { "T$it" }}>.plus(other: Tuple$b<${numbers2.joinToString { "T$it" }}>): Tuple${a + b}<${numbers.joinToString { "T$it" }}> = this.concat<${numbers.joinToString { "T$it" }}>(other)"
//            )
            println(
                "operator fun <${numbers.joinToString { "T$it" }}> Tuple$a<${numbers1.joinToString { "T$it" }}>.plus(other: Tuple$b<${numbers2.joinToString { "T$it" }}>): Tuple${a + b}<${numbers.joinToString { "T$it" }}> = Tuple${a + b}<${numbers.joinToString { "T$it" }}>(${numbers1.joinToString { "this._$it()" }}, ${numbers2.indices.joinToString { "other._${it + 1}()" }})"
            )

        }
    }
}