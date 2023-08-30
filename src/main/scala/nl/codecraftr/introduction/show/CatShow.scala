package nl.codecraftr.introduction.show

import cats.implicits._
import nl.codecraftr.introduction.Cat.garfield

object CatShow extends App {
  println(garfield.show)
}
