import scala.io.StdIn.readLine

@main def main(): Unit =  {
  println("Enter number1: ")
  val num1 = readLine().toInt
  println("Enter number2: ")
  val num2 = readLine().toInt
  
  val avg = average(num1, num2)
  println(s"\nArithmetic mean: $avg")
}

def average(a: Int, b: Int): Float = {
  val avg = (a+b.toFloat)/2
  val roundedAvg = (math.round(avg * 100) / 100.0).toFloat

  return roundedAvg
}
