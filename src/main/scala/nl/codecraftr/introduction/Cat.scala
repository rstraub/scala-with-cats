package nl.codecraftr.introduction

import cats.implicits._
import cats.{Eq, Show}
import nl.codecraftr.introduction.printable.Printable

final case class Cat(name: String, age: Int, color: String)

object Cat {
  val garfield: Cat = Cat("Garfield", 38, "ginger and black")

  implicit val catPrintable: Printable[Cat] = (cat: Cat) =>
    s"${cat.name} is a ${cat.age} year-old ${cat.color} cat."

  // Creates a printable cat using the Cats library
  implicit val catShow: Show[Cat] = Show.show((cat: Cat) =>
    s"${cat.name} is a ${cat.age} year-old ${cat.color} cat."
  )

  implicit val catEq: Eq[Cat] = Eq.instance { (a, b) =>
    (a.name === b.name) &&
    (a.age === b.age) &&
    (a.color === b.color)
  }
}
