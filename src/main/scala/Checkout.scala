

object Checkout {
  
  def main(args: Array[String]): Unit = {
    val items = List("Apple", "Apple", "Orange", "Apple")
    val totalCost = CheckoutHelper.calculateTotal(items)
    println(f"Total cost: £$totalCost%.2f")
  }
}