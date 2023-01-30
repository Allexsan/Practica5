import java.util.Scanner

fun main(args: Array<String>){
    println("введите кол-во элементов")
    val reader = Scanner(System.`in`)
    var sum = 0.0
    var n = reader.nextInt()
    for (i in 0 until n)
    {
        sum += Math.pow(-0.5, i.toDouble()) * (1 - (i % 2) * 2)
    }
println(sum)
}