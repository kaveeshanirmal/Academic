@main def main(): Unit = {
  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  names.foreach { name =>
  val formattedName = formatNames(name)(toUpper)
  println(formattedName)
  }

  names.foreach { name =>
  val formattedName = formatNames(name)(toLower)
  println(formattedName)
  }
}

def toUpper(str: String): String = {
    str.toUpperCase
}

def toLower(str: String): String = {
    str.toLowerCase
}

def formatNames(name: String)(formatter: String => String): String = {
    formatter(name)
}
