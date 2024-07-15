@main def main():Unit =  {
  val productList = getProductList()
  println(productList)
  printProductList(productList)
  print("Total number of products: ")
  println(getTotalProducts(productList))
}

def getProductList(): List[String] = {

  print("Enter: ")
  val input = scala.io.StdIn.readLine()

  if (input == "done") List()
  else
  {
    List(input):::getProductList()
  }
}

def printProductList(prList: List[String]): Unit = {
  for (each <- prList)
  {
    val index = prList.indexOf(each)+1
    println(s"$index.$each")
  }
}

def getTotalProducts(prList: List[String]): Int = {
  if (prList.isEmpty) 0
  else 1 + getTotalProducts(prList.tail)
}
