package nl.codecraftr.introduction.printable

final case class Cat(name: String, age: Int, color: String)

object Cat {
  implicit val catPrintable: Printable[Cat] = (value: Cat) =>
    s"${value.name} is a ${value.age} year-old ${value.color} cat."
}
