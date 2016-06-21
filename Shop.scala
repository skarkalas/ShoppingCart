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
	def checkout(goods: List[Merchandise]): Int = 
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
		
		apples * Apple.price + oranges * Orange.price
	}

	def checkout2(goods: List[Merchandise]): Int = 
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
		
		val appleCost = (apples / 2) * Apple.price + (apples % 2) * Apple.price
		val orangeCost = (oranges / 3) * (2 * Orange.price) + (oranges % 3) * Orange.price
		appleCost + orangeCost
	}
}
