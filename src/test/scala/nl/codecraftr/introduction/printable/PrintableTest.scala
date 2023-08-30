package nl.codecraftr.introduction.printable

import nl.codecraftr.introduction.Cat
import nl.codecraftr.introduction.printable.PrintableInstances._
import nl.codecraftr.introduction.printable.PrintableSyntax._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PrintableTest extends AnyFlatSpec with Matchers {
  "format" should "format a string" in {
    Printable.format("Hello") shouldBe "Hello"
  }

  it should "format an int" in {
    Printable.format(1) shouldBe "1"
  }

  it should "format a cat" in {
    Cat(
      "Garfield",
      38,
      "ginger and black"
    ).format shouldBe "Garfield is a 38 year-old ginger and black cat."
  }
}
