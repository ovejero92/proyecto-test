package com.example.demojpa.repository;
import com.example.demojpa.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente,Long> {

}
