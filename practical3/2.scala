import scala.io.StdIn.readLine

@main def main(): Unit = {
  
  println("Enter a list of strings seperated by spaces: ")
  val rawString = readLine()

  val stringList = rawString.split(" ").toList

  val filteredList = filter(stringList)
  println(s"\nFiltered List: $filteredList")
}

def filter(myList: List[String]): List[String] = {
  
  var newList = List[String]()
  for (eachitem <- myList)
  {
    if(eachitem.length() > 5)
      newList = eachitem :: newList 
  }

  return newList.reverse
}
