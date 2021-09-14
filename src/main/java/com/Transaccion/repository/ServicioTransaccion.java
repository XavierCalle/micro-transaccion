package com.Transaccion.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Transaccion.model.transaccionfinal;



public interface ServicioTransaccion extends JpaRepository<transaccionfinal, Integer>{
	
	
}
