package com.olivier.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}




/*@SpringBootApplication
public class ContactApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM t_contact";
		List<Contact> contacts = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Contact.class));

		contacts.forEach(contact -> System.out.println(contact.getName()));

	}*/

}
