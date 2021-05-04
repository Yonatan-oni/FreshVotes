package com.freshvotes.service;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDetailsServiceTest {

	@Test
	public void generate_encrypted_password() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "password";
		String encodedPassword = encoder.encode(rawPassword);

		System.out.println(encodedPassword);
		Assertions.assertThat(rawPassword).isNotIn(encodedPassword);
		
	}

}
