package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbers = (1..a).toList()

        val returnTuple = "Tuple$a<${numbers.joinToString { "T$it" }}>"
        println(
            "inline fun <${ numbers.joinToString { "reified T$it" } }> Tuple$a<${numbers.joinToString { "*" }}>.cast(): $returnTuple = $returnTuple(${numbers.joinToString { "this._$it() as T$it" }})"
        )
    }

    println()

}