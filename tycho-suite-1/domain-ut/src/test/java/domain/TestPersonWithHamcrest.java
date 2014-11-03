package domain;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TestPersonWithHamcrest {
	
	@Test
	public void testPersonMember() {
		Person p = new Person();
		p.setName("Laurel");
		assertThat(p.getName(), is("Laurel"));
	}

}
