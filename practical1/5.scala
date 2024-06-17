@main def main(): Unit = {
  val totalRunTime: Int = easyPaceTime(4)+tempoTime(3)
  println(s"Total running time: $totalRunTime mins")
}

def easyPaceTime(distance: Int): Int = {
  return 8*distance
}

def tempoTime(distance: Int): Int = {
  return 7*distance
}
