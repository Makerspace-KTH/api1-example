package example.api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
@RestController
@CrossOrigin
public class Api1Application {

    public static void main(String[] args) {
        SpringApplication.run(Api1Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        var random = ThreadLocalRandom.current().nextInt(0, 1000);
        return "Hello from api1! Here is a random number: " + random;
    }
}
