package se.lolotron.qualifierspy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QualifierspyApplicationFailingTest {

	@SpyBean
	@Qualifier("simpleService2")
	private SimpleService simpleService2;

	@Test
	public void testSpy() {
		Assert.assertEquals("hello 2", simpleService2.method());
	}

}
