file://<WORKSPACE>/practical9/2.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/practical8/2.scala
and also in
  <WORKSPACE>/practical9/1.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 370
uri: file://<WORKSPACE>/practical9/2.scala
text:
```scala
// Write a program in PatternMatching, takes the integer input from the command line.
// Based on the input, write a code using match to print Negative/Zero is input when input is
// less than or equal to 0. Print Even number is given when input is even, and print Odd
// number is given when input is odd. (Hint: Use Lambda functions)

object PatternMatching extends Ap@@p {
    val input = scala.io.StdIn.readInt()
    input match {
        case input if input <= 0 => println("Negative/Zero is input")
        case input if input % 2 == 0 => println("Even number is given")
        case _ => println("Odd number is given")
    }
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/practical8/2.scala
and also in
  <WORKSPACE>/practical9/1.scala
One of these files should be removed from the classpath.