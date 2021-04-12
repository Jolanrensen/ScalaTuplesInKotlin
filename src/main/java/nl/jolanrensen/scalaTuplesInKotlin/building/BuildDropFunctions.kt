package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..21).toList()

    for (a in alphabet){
        val numbers = (1..a).toList()

        println(
            "fun <${numbers.joinToString { "T$it" }}> Tuple${a + 1}<*, ${numbers.joinToString { "T$it" }}>.dropFirst(): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "this._${it + 1}()" }})"
        )
        println(
            "fun <${numbers.joinToString { "T$it" }}> Tuple${a + 1}<${numbers.joinToString { "T$it" }}, *>.dropLast(): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "this._$it()" }})"
        )
    }
}