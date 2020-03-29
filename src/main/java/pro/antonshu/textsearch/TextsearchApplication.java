package pro.antonshu.textsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
//import pro.antonshu.textsearch.configs.FileUploadConfig;

@SpringBootApplication
//@Import(FileUploadConfig.class)
public class TextsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextsearchApplication.class, args);
	}

}
