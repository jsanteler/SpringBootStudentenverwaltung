package com.itkollegimst.studentenverwaltung;

import com.itkollegimst.studentenverwaltung.domain.Student;
import com.itkollegimst.studentenverwaltung.repositories.DbZugriffStudenten;
import com.itkollegimst.studentenverwaltung.repositories.StudentJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentenverwaltungApplication implements ApplicationRunner {

	//Dependency Injection
	//Spring boot sucht entsprechende Implementierung und injiziert dieses Objekt.
	//ohne new StudentJPARepo
	@Autowired
	DbZugriffStudenten dbZugriffStudenten;
	public static void main(String[] args) {
		SpringApplication.run(StudentenverwaltungApplication.class, args);
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.dbZugriffStudenten.studentSpeichern(new Student("Julian Santeler", "6020"));
		this.dbZugriffStudenten.studentSpeichern(new Student("Riccardo Burger", "6100"));
		this.dbZugriffStudenten.studentSpeichern(new Student("Ali Keskin", "6500"));
		this.dbZugriffStudenten.studentSpeichern(new Student("Christoph Stecher", "6471"));



	}
}
