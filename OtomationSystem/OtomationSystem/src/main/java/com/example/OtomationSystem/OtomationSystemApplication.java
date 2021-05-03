package com.example.OtomationSystem;

import com.example.OtomationSystem.Classes.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OtomationSystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext=
				SpringApplication.run(OtomationSystemApplication.class, args);

		AirlinesRepository airlinesRepository=
				configurableApplicationContext.getBean(AirlinesRepository.class);
		Airlines havayolu1=new Airlines("TURKISH AIRLINES");
		airlinesRepository.save(havayolu1);
		Airlines havayolu2=new Airlines(("PEGASUS"));
		airlinesRepository.save(havayolu2);
		Airlines havayolu3=new Airlines(("ATLAS JET"));
		airlinesRepository.save(havayolu3);
		Airlines havayolu4=new Airlines(("SUN EXPRESS"));
		airlinesRepository.save(havayolu4);
		Airlines havayolu5=new Airlines(("ANADOLU JET"));
		airlinesRepository.save(havayolu5);


		AirportsRepository airportsRepository=
				configurableApplicationContext.getBean(AirportsRepository.class);
		Airports havalimanı1=new Airports("ANTALYA HAVALİMANI");
		airportsRepository.save(havalimanı1);
		Airports havalimanı2=new Airports("ESENBOĞA HAVALİMANI");
		airportsRepository.save(havalimanı2);
		Airports havalimanı3=new Airports("ADNAN MENDERES HAVALİMANI");
		airportsRepository.save(havalimanı3);
		Airports havalimanı4=new Airports("TRABZON HAVALİMANI");
		airportsRepository.save(havalimanı4);
		Airports havalimanı5=new Airports("İSTANBUL YENİ HAVALİMANI");
		airportsRepository.save(havalimanı5);


		FlightsRepository flightsRepository=
				configurableApplicationContext.getBean(FlightsRepository.class);
		Flights uçuş1=new Flights(300);
		flightsRepository.save(uçuş1);
		Flights uçuş2=new Flights(400);
		flightsRepository.save(uçuş2);
		Flights uçuş3=new Flights(250 );
		flightsRepository.save(uçuş3);
		Flights uçuş4=new Flights(280);
		flightsRepository.save(uçuş4);
		Flights uçuş5=new Flights(375);
		flightsRepository.save(uçuş5);


		RoutesRepository routesRepository=
				configurableApplicationContext.getBean(RoutesRepository.class);
		Routes rota1=new Routes("İSTANBUL HAVALİMANI","ANTALYA HAVALİMANI");
		routesRepository.save(rota1);
		Routes rota2=new Routes("İZMİR HAVALİMANI","ANTALYA HAVALİMANI");
		routesRepository.save(rota2);
		Routes rota3=new Routes("ESENBOĞA HAVALİMANI","ANTALYA HAVALİMANI");
		routesRepository.save(rota3);
		Routes rota4=new Routes("ADNAN MENDERES HAVALİMANI","ESENBOĞA HAVALİMANI");
		routesRepository.save(rota4);
		Routes rota5=new Routes("İSTANBUL YENİ HAVALİMANI","TRABZON HAVALİMANI");
		routesRepository.save(rota5);


		TicketRepository ticketRepository=
				configurableApplicationContext.getBean(TicketRepository.class);
		Ticket bilet1=new Ticket(1234567,200,"İSTANBUL HAVALİMANI","ANTALYA HAVALİMANI");
		ticketRepository.save(bilet1);
		Ticket bilet2=new Ticket(2345671,200,"İZMİR HAVALİMANI","ANTALYA HAVALİMANI");
		ticketRepository.save(bilet2);
		Ticket bilet3=new Ticket(3456712,200,"ESENBOĞA HAVALİMANI","ANTALYA HAVALİMANI");
		ticketRepository.save(bilet3);
		Ticket bilet4=new Ticket(4567123,200,"ADNAN MENDERES HAVALİMANI","ESENBOĞA HAVALİMANI");
		ticketRepository.save(bilet4);
		Ticket bilet5=new Ticket(5671234,200,"İSTANBUL YENİ HAVALİMANI","TRABZON  HAVALİMANI");
		ticketRepository.save(bilet5);


	}

}
