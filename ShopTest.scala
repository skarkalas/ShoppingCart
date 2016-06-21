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
	
	def testCheckout()
	{
		val goods = List[Merchandise](new Apple, new Apple, new Apple, new Orange, new Orange)
		assertEquals("3 x 60 + 2 x 25 must be 230", 230, shop.checkout(goods))
	}
}

