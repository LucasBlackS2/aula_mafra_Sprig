package MerPrimeiroApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MerPrimeiroAppApplication {
	@RequestMapping("/hello")
	public String criaContato(){
		return "Hello World";

	}
	public static void main(String[] args) {
		SpringApplication.run(MerPrimeiroAppApplication.class, args);
	}

}
