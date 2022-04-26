import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RectangleSpec extends AnyFlatSpec with should.Matchers{

  "Function area " should "return area of a rectangle" in{
    val a = Rectangle(2,4)
    val b = Rectangle(3,5)
    a.area() shouldBe 8
    b.area() shouldBe 15
  }
  "Function perimiter" should "return perimiter of a circle" in{
    val a = Rectangle(2,4)
    val b = Rectangle(3,5)
    a.perimiter() shouldBe 12
    b.perimiter() shouldBe 16
  }
}
