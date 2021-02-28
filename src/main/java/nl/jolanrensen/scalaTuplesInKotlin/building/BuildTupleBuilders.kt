package nl.jolanrensen.scalaTuplesInKotlin.building

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
        println("""
            
                /** 
                 * Returns a new Tuple$a of the given arguments. 
                 * @see [t] 
                 **/""".trimIndent()
        )
        println(
            "fun <${numbers.joinToString { "T$it" }}> tupleOf(${numbers.joinToString { "${ words[it - 1] }: T$it" }}): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { words[it - 1] }})"
        )

    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()

        println("""
            
                /** 
                 * Returns a new Tuple$a of the given arguments. 
                 * @see [tupleOf] 
                 **/""".trimIndent()
        )
        println(
            "fun <${numbers.joinToString { "T$it" }}> t(${numbers.joinToString { "${ words[it - 1] }: T$it" }}): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { words[it - 1] }})"
        )

    }
}