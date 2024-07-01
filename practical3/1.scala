import scala.io.StdIn.readLine

@main def main():Unit = {
  println("Enter a string: ")
  val myString = readLine()
  
  val revString = reverse(myString)
  println(s"Reversed string: $revString")
}

def reverse(str: String): String = str match {
  case x if x.length() == 1 => x 
  case x => x.charAt(x.length()-1).toString + reverse(x.substring(0, x.length()-1))
}
