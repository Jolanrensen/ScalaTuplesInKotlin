package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbers = (0..a).toList()

        for (nr in numbers) {
            val types = numbers.drop(1).map { "T$it" }
            val (firstTypes, secondTypes) = types
                .withIndex()
                .partition { (i, _) -> i < nr }
                .let { (first, second) ->
                    Pair(first.map { it.value }, second.map { it.value })
                }

            val (firstNrs, secondNrs) = numbers.drop(1).partition { it <= nr }

            val firstTuple = if (firstTypes.isEmpty()) "EmptyTuple" else "Tuple${firstTypes.size}<${firstTypes.joinToString()}>"
            val firstTupleInvoke = if (firstTypes.isEmpty()) "" else "(${firstNrs.joinToString { "this._$it()" }})"

            val secondTuple = if (secondTypes.isEmpty()) "EmptyTuple" else "Tuple${secondTypes.size}<${secondTypes.joinToString()}>"
            val secondTupleInvoke = if (secondTypes.isEmpty()) "" else "(${secondNrs.joinToString { "this._$it()" }})"

            val resultTuple = "Tuple2<$firstTuple, $secondTuple>"

            println(
                "fun <${types.joinToString()}> Tuple$a<${types.joinToString()}>.splitAt$nr(): $resultTuple = $resultTuple($firstTuple$firstTupleInvoke, $secondTuple$secondTupleInvoke)"
            )
        }
    }

}