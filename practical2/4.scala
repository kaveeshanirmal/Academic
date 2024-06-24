//15$ -> 120
//10$ -> 140
//20$ -> 100

//let ticket price be x, 
//attendance = 120 + (15-x)/5*20

@main def main(): Unit = {
  val pro15 = profit(15)
  val pro10 = profit(10)
  val pro20 = profit(20)
  val pro25 = profit(25)
  val pro30 = profit(30)
  val pro35 = profit(35)
  println("profit from setting ticket prices, ")
  println(s"15: $pro15")
  println(s"10: $pro10")
  println(s"20: $pro20")
  println(s"25: $pro25")
  println(s"30: $pro30")
  println(s"35: $pro35")
  
}

def attendance(x: Int): Int = {
  return 120 + (15-x)/5*20
}

def income(x: Int): Int = {
  return attendance(x)*x
}

def profit(x: Int): Int = {
  return income(x)-attendance(x)*3-500
}
