package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    // drop
    for (a in alphabet) {
        val numbers = (1..a).toList()

        println(
            "fun <${numbers.joinToString { "T$it" }}> Tuple$a<${numbers.joinToString { "T$it" }}>.drop0(): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "this._$it()" }})"
        )

        for (drop in numbers.dropLast(1)) {
            val types = numbers.map { if (it > drop) "T$it" else "*" }

            val allTypesTrimmed = types.filter { it != "*" }.joinToString()

            val nrs = numbers.drop(drop).toList()


            println(
                "fun <$allTypesTrimmed> Tuple$a<${types.joinToString()}>.drop$drop(): Tuple${a - drop}<$allTypesTrimmed> = Tuple${a - drop}<$allTypesTrimmed>(${nrs.joinToString { "this._$it()" }})"
            )
        }

        println(
            "fun Tuple$a<${numbers.joinToString { "*" }}>.drop$a(): EmptyTuple = EmptyTuple"
        )
    }

    println()
    println()
    println()

    // dropLast
    for (a in alphabet) {
        val numbers = (1..a).toList()

        println(
            "fun <${numbers.joinToString { "T$it" }}> Tuple$a<${numbers.joinToString { "T$it" }}>.dropLast0(): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "this._$it()" }})"
        )

        for (drop in numbers.dropLast(1)) {
            val types = numbers.map { if (it <= (a - drop)) "T$it" else "*" }

            val allTypesTrimmed = types.filter { it != "*" }.joinToString()

            val nrs = numbers.dropLast(drop).toList()


            println(
                "fun <$allTypesTrimmed> Tuple$a<${types.joinToString()}>.dropLast$drop(): Tuple${a - drop}<$allTypesTrimmed> = Tuple${a - drop}<$allTypesTrimmed>(${nrs.joinToString { "this._$it()" }})"
            )
        }

        println(
            "fun Tuple$a<${numbers.joinToString { "*" }}>.dropLast$a(): EmptyTuple = EmptyTuple"
        )
    }

}