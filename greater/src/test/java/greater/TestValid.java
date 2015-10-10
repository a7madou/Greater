package greater;

import org.junit.Assert;
import org.junit.Test;

public class TestValid {

	@Test
	public void test(){

		Greeter greeter=new Greeter();
		Assert.assertEquals("hello", greeter.sayHello());
	}

}
