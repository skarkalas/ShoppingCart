import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class ShopTest extends TestCase
{
	var shop:Shop = _

	override def setUp()
	{
		shop = new Shop
	}
	
	def testCreateShop()
	{
		assertNotNull(shop)
	}
	
	def testCheckout_full()
	{
		val goods = List[Merchandise](Apple(), Apple(), Apple(), Orange(), Orange())
		assertEquals("3 x 60 + 2 x 25 must be 230", 230, shop.checkout(goods))
	}

	def testCheckout_discount()
	{
		val goods = List[Merchandise](Apple(), Apple(), Apple(), Orange(), Orange(), Orange(), Orange())
		assertEquals("3 apples (120) + 4 oranges (75) must be 195", 195, shop.checkout2(goods))
	}
}

