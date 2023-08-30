package nl.codecraftr.introduction.show

import cats.implicits._
import nl.codecraftr.introduction.Cat
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShowTest extends AnyFlatSpec with Matchers {
  "show" should "format a cat" in {
    val cat = Cat(
      "Garfield",
      38,
      "ginger and black"
    )

    cat.show shouldBe "Garfield is a 38 year-old ginger and black cat."
  }
}
