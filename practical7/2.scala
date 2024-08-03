@main def main(): Unit = {
  val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(calculateSquare(numList))
}

def calculateSquare(num: List[Int]): List[Int] = {
  num.map(num=>num*num)
}
