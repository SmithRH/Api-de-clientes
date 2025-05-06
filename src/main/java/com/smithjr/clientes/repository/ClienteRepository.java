package com.smithjr.clientes.repository;

import com.smithjr.clientes.model.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Modifying
    @Transactional
    @Query(value = "CALL eliminar_cliente(:id)", nativeQuery = true)
    void eliminarCliente(@Param("id") Long id);


}
