import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SquareSpec extends AnyFlatSpec with should.Matchers{

    "Function area " should "return area of a rectangle" in{
      val a = Square(3)
      val b = Square(5)
      a.area() shouldBe 9
      b.area() shouldBe 25
    }
    "Function perimiter" should "return perimiter of a circle" in{
      val a = Square(3)
      val b = Square(5)
      a.perimiter() shouldBe 12
      b.perimiter() shouldBe 20
    }
}
