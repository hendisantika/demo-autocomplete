package com.hendisantika.demoautocomplete;

import com.hendisantika.demoautocomplete.entity.Person;
import com.hendisantika.demoautocomplete.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoAutocompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAutocompleteApplication.class, args);
	}


	@Bean
    CommandLineRunner initData(PersonRepository repo){
	    return args -> {
	        repo.save(new Person(1L, "Uzumaki Naruto", 17));
	        repo.save(new Person(2L, "Uchiha Sasuke", 19));
	        repo.save(new Person(3L, "Haruno Sakura", 18));
	        repo.save(new Person(4L, "Hatake Kakashi", 17));
	        repo.save(new Person(5L, "Yamanaka Ino", 17));
	        repo.save(new Person(6L, "Naara Shikamaru", 17));
	        repo.save(new Person(7L, "Akamichi Chouji", 17));
	        repo.save(new Person(8L, "Sarutobi Asuma", 17));
	        repo.save(new Person(9L, "Ten-ten", 17));
	        repo.save(new Person(10L, "Rock Lee", 17));
	        repo.save(new Person(11L, "Hyuuga Neji", 17));
	        repo.save(new Person(12L, "Maito Guy", 17));
	        repo.save(new Person(13L, "Aburame Shino", 17));
	        repo.save(new Person(14L, "Inuzuka Kiba", 17));
	        repo.save(new Person(15L, "Hyuuga Hinata", 17));
	        repo.save(new Person(16L, "Yuuha Kurenai", 17));
	        repo.save(new Person(17L, "Hiruzen Sarutobi", 17));
	        repo.save(new Person(18L, "Orochimaru", 17));
	        repo.save(new Person(19L, "Tsunade", 17));
	        repo.save(new Person(20L, "Jiraiya", 17));
	        repo.save(new Person(21L, "Uzumaki Kushina", 47));
        };
    }
}
