import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CircleSpec extends AnyFlatSpec with should.Matchers{

  "Function area " should "return area of a circle" in{
    val circle = Circle(1)
    val cr = Circle(2)
    circle.area() shouldBe 3.14
    cr.area() shouldBe 4*3.14
  }
  "Function perimiter" should "return perimiter of a circle" in{
    val circle = Circle(1)
    val cr = Circle(2)
    circle.perimiter() shouldBe 3.14*2
    cr.perimiter() shouldBe 4*3.14
  }
}
