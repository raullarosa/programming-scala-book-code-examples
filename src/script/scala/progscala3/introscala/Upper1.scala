// src/script/scala/progscala3/introscala/Upper1.scala

class Upper1:
  def convert(strings: Seq[String]): Seq[String] =
    strings.map((s: String) => s.toLowerCase)

val up = new Upper1()
val uppers = up.convert(List("Hello", "World", "!"))
println(uppers)

uppers.foreach((upper: String) => println(upper.contains("el")))
1 + 2
val bool1: Boolean = true
