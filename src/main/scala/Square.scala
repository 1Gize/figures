case class Square(a: Double) extends Figure with Areable with Permitable{
  override def area(): Double = a*a

  override def perimiter(): Double = 4*a
}
