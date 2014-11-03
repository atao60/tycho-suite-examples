package domain;

import static  org.fest.assertions.api.Assertions.*;

import org.junit.Test;

public class TestPersonWithFestAssert {

	@Test
	public void testPersonMember() {
		Person p = new Person();
		p.setName("Laurel");
		assertThat(p).isNotNull();
		assertThat(p.getName()).isEqualTo("Laurel");
	}
}
