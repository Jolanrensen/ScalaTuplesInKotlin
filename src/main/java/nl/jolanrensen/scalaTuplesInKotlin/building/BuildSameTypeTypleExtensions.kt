package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T> Tuple$a<${numbers.joinToString { "T" }}>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "fun <T> Tuple$a<${numbers.joinToString { "T" }}>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T> Tuple$a<${numbers.joinToString { "T" }}>.get(index: Int): T = productElement(index) as T"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T> Tuple$a<${numbers.joinToString { "T" }}>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }"
        )
    }
}