package org.sid;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsUh2cApplication implements CommandLineRunner{
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MsUh2cApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	Formation f1 =	formationRepository.save(new Formation(null , "php" , "30" , null));
	Formation f2 =	formationRepository.save(new Formation(null , "java" , "30" , null));
	Formation f3 =	formationRepository.save(new Formation(null , "oracle" , "30" , null));
		etudiantRepository.save(new Etudiant(null,"Hassan","Hassan",new Date() , f1));
		etudiantRepository.save(new Etudiant(null,"Mohamed","Mohamed",new Date() , f1));
		etudiantRepository.save(new Etudiant(null,"Hannan","Hannan",new Date() , f2));
		etudiantRepository.save(new Etudiant(null,"Nabila","Nabila",new Date() , f3));
		}

}

