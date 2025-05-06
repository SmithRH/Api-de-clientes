package com.smithjr.clientes.service;

import com.smithjr.clientes.model.Cliente;

import java.util.List;

public interface ClientesService {
    List<Cliente> findAllClientes();
    Cliente registrarCliente(Cliente cliente);
    Cliente actualizarCliente(Long id, Cliente cliente);
    void eliminarcliente(Long id); //
}
