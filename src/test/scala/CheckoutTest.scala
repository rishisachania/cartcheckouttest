import org.scalatest.funsuite.AnyFunSuite

class CheckoutTest extends AnyFunSuite {

  test("calculateTotal should return 0 for an empty list") {
    assert(CheckoutHelper.calculateTotal(List()) == BigDecimal(0))
  }

  test("calculateTotal should return the correct total for a list of apples and oranges") {
    val items = List("Apple", "Apple", "Orange", "Apple")
    assert(CheckoutHelper.calculateTotal(items) == BigDecimal(1.45))
  }

  test("calculateTotal should ignore unrecognized items") {
    val items = List("Apple", "Banana", "Orange", "Apple")
    assert(CheckoutHelper.calculateTotal(items) == BigDecimal(0.85))
  }

  test("calculateTotal should apply buy one get one free on apples") {
    val items = List("Apple", "Apple", "Apple", "Apple")
    assert(CheckoutHelper.calculateTotal(items) == BigDecimal(1.20)) // 4 apples for 1.20 (2 free)
  }

  test("calculateTotal should apply 3 for 2 on oranges") {
    val items = List("Orange", "Orange", "Orange", "Orange", "Orange", "Orange")
    assert(CheckoutHelper.calculateTotal(items) == BigDecimal(1.00)) // 6 oranges for 1.00 (2 free)
  }
}