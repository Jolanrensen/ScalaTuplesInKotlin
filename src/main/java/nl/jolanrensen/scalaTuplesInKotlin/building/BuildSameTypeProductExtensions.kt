package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T, ${ numbers.joinToString { "T$it: T" } }> Product$a<${numbers.joinToString { "T$it" }}>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "fun <T, ${ numbers.joinToString { "T$it: T" } }> Product$a<${numbers.joinToString { "T$it" }}>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T, ${ numbers.joinToString { "T$it: T" } }> Product$a<${numbers.joinToString { "T$it" }}>.get(index: Int): T = productElement(index) as T"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T, ${ numbers.joinToString { "T$it: T" } }> Product$a<${numbers.joinToString { "T$it" }}>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }"
        )
    }
}