import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class FirstSpringBootApplication{
	@RequestMapping("/")
	String home(){
		return "Hello Spring World\n";
	}

	public static void main(String[] args)  throws Exception{
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}
}