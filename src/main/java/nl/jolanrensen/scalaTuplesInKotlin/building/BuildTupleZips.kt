package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbersA = (1..a).toList()

        println(
            "infix fun Tuple$a<${numbersA.joinToString { "*" }}>.zip(other: EmptyTuple): EmptyTuple = EmptyTuple"
        )
        println(
            "infix fun EmptyTuple.zip(other: Tuple$a<${numbersA.joinToString { "*" }}>): EmptyTuple = EmptyTuple"
        )

        for (b in alphabet) {
            val numbersB = (1..b).toList()

            val minSize = minOf(a, b)

            val numbersATrimmed = numbersA.take(minSize + 1)
            val numbersBTrimmed = numbersB.take(minSize + 1)

            val aTypes = numbersA.map {
                if (it <= minSize) "TA$it" else "*"
            }
            val bTypes = numbersB.map {
                if (it <= minSize) "TB$it" else "*"
            }

            val aTypesTrimmed = aTypes.filter { it != "*" }
            val bTypesTrimmed = bTypes.filter { it != "*" }
            val allTypes = aTypesTrimmed + bTypesTrimmed


            val returnTuple = "Tuple$minSize<${
                aTypesTrimmed.zip(bTypesTrimmed).joinToString { (a, b) ->
                    "Tuple2<$a, $b>"
                }
            }>"

            val mergedArguments = numbersATrimmed.zip(numbersBTrimmed).map { (a, b) ->
                "Tuple2<TA$a, TB$b>(this._$a(), other._$b())"
            }

//            println("""
//                debug:
//                    maxSize: $minSize
//            """.trimIndent())

            println(
                "infix fun <${allTypes.joinToString()}> Tuple$a<${aTypes.joinToString()}>.zip(other: Tuple$b<${bTypes.joinToString()}>): $returnTuple = $returnTuple(${mergedArguments.joinToString()})"
            )

        }



    }

}