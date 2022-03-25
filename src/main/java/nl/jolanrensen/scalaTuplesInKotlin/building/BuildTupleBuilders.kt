package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()
//    val words = listOf(
//        "first",
//        "second",
//        "third",
//        "fourth",
//        "fifth",
//        "sixth",
//        "seventh",
//        "eighth",
//        "ninth",
//        "tenth",
//        "eleventh",
//        "twelfth",
//        "thirteenth",
//        "fourteenth",
//        "fifteenth",
//        "sixteenth",
//        "seventeenth",
//        "eighteenth",
//        "nineteenth",
//        "twentieth",
//        "twentyFirst",
//        "twentySecond",
//    )


    println(
        """
        
        |/** 
        | * Returns the instance of Tuple0.
        | * @see t
        | */
        |fun tupleOf(): EmptyTuple = EmptyTuple""".trimMargin()
    )

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            """
                |
                |/**
                | * Returns a new Tuple$a of the given arguments.
                | * @see t
                | * @see X
                | */""".trimMargin()
        )
        println(
            "fun <${numbers.joinToString { "T$it" }}> tupleOf(${numbers.joinToString { "_$it: T$it" }}): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "_$it" }})"
        )
    }

    println(
        """
        
        |/** 
        | * Returns the instance of Tuple0.
        | * @see tupleOf
        | */
        |fun t(): EmptyTuple = EmptyTuple""".trimMargin()
    )

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            """
                |
                |/**
                | * Returns a new Tuple$a of the given arguments.
                | * @see tupleOf
                | * @see X
                | */""".trimMargin()
        )
        println(
            "fun <${numbers.joinToString { "T$it" }}> t(${numbers.joinToString { "_$it: T$it" }}): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "_$it" }})"
        )
    }

    println()

}