@main def main(): Unit = {
  val salary = takeHomeSalary(40, 30)
  println(s"Take home salary for employee: Rs. $salary")
}

def takeHomeSalary(workingHours: Int, otHours: Int): Double = {
  return 0.88*(250*workingHours + 85*otHours)
}
