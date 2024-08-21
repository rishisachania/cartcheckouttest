import org.scalatest.funsuite.AnyFunSuite

class CheckoutTest extends AnyFunSuite {

  test("calculateTotal should return 0 for an empty list") {
    assert(CheckoutHelper.calculateTotal(List()) == BigDecimal(0))
  }

  test("calculateTotal should return the correct total for a list of apples and oranges") {
    val items = List("Apple", "Apple", "Orange", "Apple")
    assert(CheckoutHelper.calculateTotal(items) == BigDecimal(2.05))
  }

  test("calculateTotal should ignore unrecognized items") {
    val items = List("Apple", "Banana", "Orange", "Apple")
    assert(CheckoutHelper.calculateTotal(items) == BigDecimal(1.45))
  }
}