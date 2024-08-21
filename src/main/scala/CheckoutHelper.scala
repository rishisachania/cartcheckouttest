
import Prices._

object CheckoutHelper {
  def calculateTotal(items: List[String]): BigDecimal = {
    val (apples, oranges) = items.foldLeft((0, 0)) { (counts, item) =>
      item.toLowerCase match {
        case "apple"  => (counts._1 + 1, counts._2)
        case "orange" => (counts._1, counts._2 + 1)
        case _        => counts
      }
    }

    // BOGOF on Apples
    // 3 for the price of 2 on Oranges

    val appleTotal = (apples / 2 + apples % 2) * applePrice
    val orangeTotal = ((oranges / 3) * 2 + oranges % 3) * orangePrice

    // apply offers to total
    appleTotal + orangeTotal
  }
}
