package se.lolotron.qualifierspy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QualifierspyApplicationWorkingTest {

	@SpyBean(name = "simpleService2")
	private SimpleService simpleService;

	@Test
	public void testSpy() {
		Assert.assertEquals("hello 2", simpleService.method());
	}

}
