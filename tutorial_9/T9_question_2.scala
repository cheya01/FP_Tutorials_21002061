package FP_tutorials.FP_Tutorials_21002061.tutorial_9

class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // Auxiliary constructor for whole numbers

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational = new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  override def toString: String = s"$numer/$denom"
}

object T9_question_2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)
    println(s"x - y - z = $result")
  }
}


