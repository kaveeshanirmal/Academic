case class Book(title: String, author: String, isbn: String)
var library: Set[Book] = Set()


@main def main(): Unit= {
  addBook("Sihina Dahana", "Seelasaahan Mihimi", "9789552104640")
  addBook("Buddha Hasam", "Susangala Buddhaaya", "9789553000025")
  addBook("Colamba Bihasa", "Neelawala Vijewala", "9789553034402")
  
  isInLibrary("9789553000025")
  removeBook("9789553000025")
  isInLibrary("9789553000025")
  displayLibrary()
  searchByTitle("Sihina Dahana")
  displayBooksByAuthor("Neelawala Vijewala")
}

def addBook(title: String, author: String, isbn: String): Unit = {
  val newBook = Book(title, author, isbn)
  library += newBook
  println(s"New book added: $newBook")
}

def removeBook(isbn: String): Any = {
  val initialSize = library.size
  library = library.filterNot(_.isbn == isbn)
  
  if (library.size < initialSize) {
    println(s"Removed book with ISBN $isbn")
  } 
  else {
    println(s"Book not found")
  }
}

def isInLibrary(isbn: String): Any = {
    if (library.exists(_.isbn == isbn)) println(s"Found book with ISBN $isbn")
    else println("Book not found")
}

def displayLibrary(): Unit = {
  println("Library:")
  library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
}

def searchByTitle(title: String): Unit = {
  val foundBooks = library.filter(_.title.toLowerCase == title.toLowerCase)

  if (foundBooks.nonEmpty) {
    foundBooks.foreach(book => println(s"Book found:\nTitle: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  } 
  else {
    println(s"Book with title '$title' not found")
  }
}

def displayBooksByAuthor(author: String): Unit = {
  val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
  if (booksByAuthor.nonEmpty) 
  {
    println(s"Books by $author:")
    booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
  } 
  else println(s"No books found by $author.")
}
