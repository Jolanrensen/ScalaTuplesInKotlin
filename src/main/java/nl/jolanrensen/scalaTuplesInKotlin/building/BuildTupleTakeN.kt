package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    // take
    for (a in alphabet) {
        val numbers = (1..a).toList()

        for (nr in numbers) {
            val types = numbers.map { if (it <= nr) "T$it" else "*" }
            val allTypesTrimmed = types.filter { it != "*" }.joinToString()

            val nrs = (1..nr).toList()

            println(
                "fun <$allTypesTrimmed> Tuple$a<${types.joinToString()}>.take$nr(): Tuple$nr<$allTypesTrimmed> = Tuple$nr<$allTypesTrimmed>(${nrs.joinToString { "this._$it()" }})"
            )
        }
    }

    println()
    println()
    println()

    // takeLast
    for (a in alphabet) {
        val numbers = (a downTo 1).toList()

        for (nr in numbers) {
            val types = numbers.map { if (it <= nr) "T${a + 1 - it}" else "*" }
            val allTypesTrimmed = types.filter { it != "*" }.joinToString()

            val nrs = ((a + 1) - nr..a).toList()


            println(
                "fun <$allTypesTrimmed> Tuple$a<${types.joinToString()}>.takeLast$nr(): Tuple$nr<$allTypesTrimmed> = Tuple$nr<$allTypesTrimmed>(${nrs.joinToString { "this._$it()" }})"
            )
        }
    }

}