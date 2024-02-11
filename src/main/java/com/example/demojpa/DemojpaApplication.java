package com.example.demojpa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
@SpringBootApplication
public class DemojpaApplication {
public static void main(String[] args) {
		SpringApplication.run(DemojpaApplication.class, args);
	}
}
//import models.Cliente;
//import org.springframework.boot.CommandLineRunner;

//import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//public class DemojpaApplication {
//	public static void  main(String[] args){
//		SpringApplication.run(DemojpaApplication.class, args);
//	}
//
//	@Bean
//	public CommandLineRunner demo(ClienteRepository clienteRepository) {
//		return args -> {
//		// Crear un cliente
//		Cliente cliente1 = new Cliente();
//		cliente1.setNombre("Juan");
//		cliente1.setEmail("juanSanMartin@gmail.com");
//		clienteRepository.save(cliente1);
//
//		// Recuperar todos los clientes
//			System.out.println("Todos los clientes");
//			clienteRepository.findAll().forEach(System.out::println);
//
//		// Recuperer cliente por nombre
//		String nombreBuscar = "Juan";
//		Cliente clienteEncontrado = clienteRepository.findByNombre(nombreBuscar);
//			System.out.println("Cliente encontrado por nombre " + nombreBuscar + ": " + clienteEncontrado);
//
//		// Borrar un cliente por nombre
//		clienteRepository.deleteByNombre(nombreBuscar);
//			System.out.println("Cliente borrado por nombre " + nombreBuscar);
//
//		//Mostrar la lista despues de borrar
//			System.out.println("Todos los clientes despues de borrar: ");
//			clienteRepository.findAll().forEach(System.out::println);
		//};
//	}
//}