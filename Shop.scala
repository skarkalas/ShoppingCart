abstract class Merchandise
class Apple extends Merchandise
class Orange extends Merchandise

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
		
		apples * 60 + oranges * 25
	}
}
