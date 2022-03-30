package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "fun <T, R, ${ numbers.joinToString { "T$it: T" } }> Tuple$a<${numbers.joinToString { "T$it" }}>.map(func: (T) -> R): Tuple$a<${numbers.joinToString { "R" }}> = Tuple$a<${numbers.joinToString { "R" }}>(${numbers.joinToString { "func(this._$it())" }})"
        )
    }

    println()

}