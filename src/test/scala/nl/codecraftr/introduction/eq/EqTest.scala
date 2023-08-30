package nl.codecraftr.introduction.eq

import cats.implicits._
import nl.codecraftr.introduction.Cat
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class EqTest extends AnyFlatSpec with Matchers {
  private val cat1 = Cat(
    "Garfield",
    38,
    "ginger and black"
  )
  private val cat2 = cat1.copy(age = 39)

  "eq" should "return false given two unequal cats" in {
    cat1 =!= cat2 shouldBe true
  }

  it should "work for Schrodingers cat" in {
    cat1.some =!= Option.empty[Cat] shouldBe true
  }
}
