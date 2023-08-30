package nl.codecraftr.introduction.printable

// Type Class
trait Printable[A] {
  def format(value: A): String
}

object Printable {
  // Type Class Use -> compiler searches for a printable of A in the implicit scope
  def format[A](value: A)(implicit printable: Printable[A]): String =
    printable.format(value)

  def print[A](value: A)(implicit printable: Printable[A]): Unit = println(
    format(value)
  )
}

object PrintableSyntax {
  // Implicit Class -> utility that makes Type Class easier to use
  implicit class PrintableOps[A](value: A) {
    def format(implicit printable: Printable[A]): String =
      printable.format(value)

    def print(implicit printable: Printable[A]): Unit = println(
      format(printable)
    )
  }
}

// Type Class Instances
object PrintableInstances {
  // This puts this instance in the implicit scope
  implicit val stringPrintable: Printable[String] = (value: String) => value

  implicit val intPrintable: Printable[Int] = (value: Int) => value.toString
}
