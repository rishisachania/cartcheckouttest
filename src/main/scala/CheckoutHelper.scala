
import Prices._

object CheckoutHelper {
  def calculateTotal(items: List[String]): BigDecimal = {
    items.foldLeft(BigDecimal(0)) { (total, item) =>
      item.toLowerCase match {
        case "apple" => total + applePrice
        case "orange" => total + orangePrice
        case _ => total
      }
    }
  }
}
