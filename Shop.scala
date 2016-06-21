abstract class Merchandise
class Apple extends Merchandise
object Apple
{
	def apply() = new Apple
	var price = 60
}
class Orange extends Merchandise
object Orange
{
	def apply() = new Orange
	var price = 25
}

class Shop
{
	def fullPrice(apples: Int, oranges: Int) = apples * Apple.price + oranges * Orange.price
	def priceAfterDiscount(apples: Int, oranges: Int) = 
	{
		val appleCost = (apples / 2) * Apple.price + (apples % 2) * Apple.price
		val orangeCost = (oranges / 3) * (2 * Orange.price) + (oranges % 3) * Orange.price
		appleCost + orangeCost		
	}
	def checkout(goods: List[Merchandise], setPrices:(Int, Int) => Int): Int = 
	{
		def matchApples(good: Merchandise) = good match
		{
			case apple: Apple => true
			case _ => false
		}
		def matchOranges(good: Merchandise) = good match
		{
			case orange: Orange => true
			case _ => false
		}	
		val apples = goods.filter(matchApples).length
		var oranges = goods.filter(matchOranges).length
		setPrices(apples, oranges)
	}
	def checkoutInFull(goods: List[Merchandise]) = checkout(goods, fullPrice)
	def checkoutWithDiscount(goods: List[Merchandise]) = checkout(goods, priceAfterDiscount)	
}
