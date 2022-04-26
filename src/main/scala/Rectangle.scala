case class Rectangle(a: Double, b: Double)extends Figure with Areable with Permitable{
  override def area(): Double = a * b

  override def perimiter(): Double = 2 * (a + b)
}
