@main def main(): Unit = {
  val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(filterEvenNumbers(numList))
}

def filterEvenNumbers(num: List[Int]): List[Int] = {
  val filtr: List[Int]=>List[Int] = (num => num.filter(_%2 == 0))
  filtr(num)
}

//simpler implementation
//def filterEvenNumbers(numbers: List[Int]): List[Int] = {
//  numbers.filter(num => num % 2 == 0)
//}
