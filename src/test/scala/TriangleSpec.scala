import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TriangleSpec extends AnyFlatSpec with should.Matchers{

  "Function area " should "return area of a rectangle" in{
    val a = Triangle(4,5,6)
    val b = Triangle(1,2,2)
    a.area() shouldBe 9.921567416492215
    b.area() shouldBe 0.9682458365518543
  }
  "Function perimiter" should "return perimiter of a circle" in{
    val a = Triangle(4,5,6)
    val b = Triangle(1,2,2)
    a.perimiter() shouldBe 15
    b.perimiter() shouldBe 5
  }
}