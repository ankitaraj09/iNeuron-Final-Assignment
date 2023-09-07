package in.grs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProblemStatement28ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemStatement28ServerApplication.class, args);
	}

}
