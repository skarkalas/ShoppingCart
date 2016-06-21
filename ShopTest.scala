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
		val goods = List[String]("test")
		assertEquals("empty", 0, shop.checkout(goods))
	}
}

