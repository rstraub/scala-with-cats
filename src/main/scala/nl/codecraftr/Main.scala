package nl.codecraftr

import nl.codecraftr.introduction.printable.{Cat, Printable}

object Main extends App {
  Printable.print(Cat("Garfield", 38, "ginger and black"))
}
