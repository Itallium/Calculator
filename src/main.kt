fun main(args: Array<String>) {
    println("This Calculator developed by Kotlin language from Itallium.")
    if(args.size == 0) {
        println("Please enter two numbers and action as command-line arguments.")
        println("Example: \"2 + 2\"")
        return
    }
    val x = Integer.parseInt(args[0])
    val y = Integer.parseInt(args[2])
    val action = args[1].toString()
    println(when (action) {
        "+" -> "\n${x} + ${y} = ${x + y}"
        "-" -> "\n${x} - ${y} = ${x - y}"
        "*" -> "\n${x} * ${y} = ${x * y}"
        "/" -> ""
        else -> "Second command-line`s argument not valid."
    })
    if (action.equals("/")) {
        if (y == 0) {
            println("Second number should not be zero!");
            return
        }
        println("${x} / ${y} = ${x / y}")
    }
}