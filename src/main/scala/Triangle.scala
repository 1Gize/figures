import scala.math.sqrt

case class Triangle(a: Double, b: Double, c: Double) extends Figure with Areable with Permitable{
  override def area(): Double = {
    val p = (a + b + c)/2
    sqrt(p*(p-a)*(p-b)*(p-c))
  }

  override def perimiter(): Double = a + b + c
}
