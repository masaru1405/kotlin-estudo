fun main(args: Array<String>){

   /*val resp = max(10,22)
   println("${resp}")

   println(add(12,45))
   println(sub(56,89))
   println(div(15,2))
   println(mult(5,5))*/

   /***************************************************/

   val fruits = arrayOf("banana", "laranja", "maçã", "abacaxi")
   listFruits(fruits)
   var userInput = userFruit(fruits)
   var computer = computerFruit(fruits)

   println("User: $userInput -- Computer: $computer")
}

fun max(a:Int, b:Int) : Int = if(a > b) a else b

fun add(a:Int, b:Int) : Int = a + b

fun sub(a:Int, b:Int) : Int = a - b

fun div(a:Int, b:Int) : Double = a.toDouble() / b

fun mult(a:Int, b:Int) : Int = a * b

fun listFruits(optionsParam:Array<String>){
   for((index, fruta) in optionsParam.withIndex()) println("$index: $fruta")
}

fun userFruit(optionsParam:Array<String>):String{
   var isValidChoice = false
   var userChoice = " "
   while(!isValidChoice){
      print("Qual é a sua fruta preferida entre:")
      for(fruta in optionsParam) print(" - $fruta")
      println()
      val userInput = readLine()
      if(userInput != null && userInput in optionsParam){
         isValidChoice = true
         userChoice = userInput
      }else{
         println("Por favor, digite um fruta da lista abaixo.")
      }
   }
   return userChoice
}

fun computerFruit(optionsParam:Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()] 

