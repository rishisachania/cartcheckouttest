

object Checkout extends App {
  
    val items = List("Apple", "Apple", "Orange", "Apple")
    val totalCost = CheckoutHelper.calculateTotal(items)
    println(f"Total cost: £$totalCost%.2f")
  
}