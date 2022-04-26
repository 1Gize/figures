case class Circle(r: Double) extends Figure {
  override def area(): Double = 3.14 * r * r

  override def perimiter(): Double = 2 * 3.14 * r
}
