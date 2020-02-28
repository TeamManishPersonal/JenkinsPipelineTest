package hello;

public class GreeterTest {

	@Test
	public void successTestGrreter() {
		Greeter greet =  new Greeter();
		assertEquals("Hello world!", greet.sayHello());
	}
}
