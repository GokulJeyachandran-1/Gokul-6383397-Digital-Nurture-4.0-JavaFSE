package com.example.MockingAndStubbing;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalAPI {

	 public String getData() {
        return "Real Data from API";
    }
	

}
