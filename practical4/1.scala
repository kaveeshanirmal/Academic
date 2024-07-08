var arr1 = Array("apples", "orranges", "pinapple", "papaya")
var arr2 = Array(12, 34, 56, 29)

@main def main(): Unit = {
  displayInventory(arr1, arr2)
  println()
  restockItem("papaya", 34)
  println()
  displayInventory(arr1, arr2)
  println()
  sellItem("papaya", 32)
  println()
  displayInventory(arr1, arr2)
  println()
  sellItem("papaya", 32)
}

def displayInventory(x: Array[String], y: Array[Int]): Unit = if (!x.isEmpty){
    printf("%s : %d\n", x.head, y.head)
    displayInventory(x.tail, y.tail)
}

def restockItem(x: String, y: Int): Any = {
  if (arr1.indexOf(x) != -1) arr2(arr1.indexOf(x)) += y
  else println("Item not found\n")
}

def sellItem(x: String, y: Int): Unit = {
  val index = arr1.indexOf(x)
 
  if (index != -1) {
    if (arr2(index) >= y) arr2(index) -= y else println("Not enough quantity")
  }

  else {
    println("Item not found")
  }
}

