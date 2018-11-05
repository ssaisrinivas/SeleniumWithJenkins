package SeleniumWithJenkins.SeleniumImple;

import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumWithJenkins.SeleniumImple.RandomEmailGenerator;

/**
 * Unit test for simple App.
 */
 
public class RandomEmailGeneratorTest{

	@Test()
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");

	}

}