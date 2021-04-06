package cl.devweb.spring.security.hashing.blowfish;

import org.springframework.security.crypto.bcrypt.BCrypt;

/*
 * This simple sample to hash password using blowfish2a compatible with
 * Postgres pgcrypto https://www.postgresql.org/docs/9.3/static/pgcrypto.html
 *
 */
public class SpringSecurityTest {

	public static void main(String[] args) {

		String salt = BCrypt.gensalt(6);
		System.out.println("salt:" + salt );

		String password = "holamundo";
		String stored_hash = "$2a$06$Rja8BGNHYDAQmWdDnaPZZeZDe1PzD8AUrwwyWurJ7t7qk7SDAjjyy";

		// sample from https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/crypto/bcrypt/BCrypt.html
		String hashed = BCrypt.hashpw(password, stored_hash);
		System.out.println("hashed-pwd:" + hashed );


		if (BCrypt.checkpw(password, stored_hash)) {
			System.out.println("It matches");
		} else {
			System.out.println("It does NOT match");
		}

	}

}

