package nl.jolanrensen.scalaTuplesInKotlin.building

import scala.Tuple1

private fun main() {
    val alphabet = (1..22).toList()
    val words = listOf(
        "first",
        "second",
        "third",
        "fourth",
        "fifth",
        "sixth",
        "seventh",
        "eighth",
        "ninth",
        "tenth",
        "eleventh",
        "twelfth",
        "thirteenth",
        "fourteenth",
        "fifteenth",
        "sixteenth",
        "seventeenth",
        "eighteenth",
        "nineteenth",
        "twentieth",
        "twentyFirst",
        "twentySecond",
    )

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "fun <${numbers.joinToString { "T$it" }}> Tuple$a<${numbers.joinToString { "T$it" }}>.copy(${numbers.joinToString { "${ words[it - 1] }: T$it = this._$it()" }}): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { words[it - 1] }})"
        )
    }

    println()

}