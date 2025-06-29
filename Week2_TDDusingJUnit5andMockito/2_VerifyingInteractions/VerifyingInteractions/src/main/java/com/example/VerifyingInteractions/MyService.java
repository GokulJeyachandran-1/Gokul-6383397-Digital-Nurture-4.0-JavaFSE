package com.example.VerifyingInteractions;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyService {

	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

}
