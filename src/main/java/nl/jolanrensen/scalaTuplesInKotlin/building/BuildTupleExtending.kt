package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..21).toList()

    for (a in alphabet) {
        val numbers = (1..a + 1).toList()

        println(
            "fun <${ numbers.joinToString { "T$it" } }> Tuple$a<${numbers.dropLast(1).joinToString { "T$it" } }>.appendedBy(other: T${numbers.last()}): Tuple${a+1}<${ numbers.joinToString { "T$it" } }> = Tuple${a+1}<${ numbers.joinToString { "T$it" } }>(${numbers.dropLast(1).joinToString { "this._$it()" } }, other)"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a + 1).toList()

        println(
            "fun <${ numbers.joinToString { "T$it" } }> Tuple$a<${numbers.drop(1).joinToString { "T$it" } }>.prependedBy(other: T${numbers.first()}): Tuple${a+1}<${ numbers.joinToString { "T$it" } }> = Tuple${a+1}<${ numbers.joinToString { "T$it" } }>(other, ${numbers.dropLast(1).joinToString { "this._$it()" } })"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a + 1).toList()
        if (numbers.isEmpty()) continue

        println(
            "operator fun <${ numbers.joinToString { "T$it" } }> Tuple$a<${numbers.dropLast(1).joinToString { "T$it" } }>.rangeTo(other: T${numbers.last()}): Tuple${a+1}<${ numbers.joinToString { "T$it" } }> = this.appendedBy<${ numbers.joinToString { "T$it" } }>(other)"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a + 1).toList()
        if (numbers.isEmpty()) continue

        println(
            "operator fun <${ numbers.joinToString { "T$it" } }> T${numbers.first()}.rangeTo(other: Tuple$a<${numbers.drop(1).joinToString { "T$it" } }>): Tuple${a+1}<${ numbers.joinToString { "T$it" } }> = other.prependedBy<${ numbers.joinToString { "T$it" } }>(this)"
        )
    }
}