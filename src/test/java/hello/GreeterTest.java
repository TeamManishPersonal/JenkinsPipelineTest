import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import hello.Greeter;

public class GreeterTest {
	
	@Test
	public void successTestGreeter() {
		Greeter greet =  new Greeter();
		assertEquals("Hello world!", greet.sayHello());
	}
	
	@Test
	public void failTestGreter() {
		Greeter greet =  new Greeter();
		assertNotEquals("Hello world", greet.sayHello());
	}
}
