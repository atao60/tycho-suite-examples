package domain;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class TestPersonWithAssertJ {

	@Test
	public void testPersonMember() {
		Person p = new Person();
		p.setName("Laurel");
		assertThat(p).isNotNull();
		assertThat(p.getName()).isEqualTo("Laurel");
	}
}
