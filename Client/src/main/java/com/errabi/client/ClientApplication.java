package com.errabi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.errabi.client.entities.Client;
import com.errabi.client.repositories.ClientRepository;

@SpringBootApplication
@EnableJpaRepositories
public class ClientApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
	 for(int i=0;i<30;i++){
		Client client = new Client();
		client.setNom("Errabi");
		client.setPrenom("Ayoub");
		client.setCIN("4YP5657");
		client.setAddress("Casablanca");
		//clientRepository.save(client);
	 }
			
	}
}
