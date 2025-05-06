package com.smithjr.clientes.service;

import com.smithjr.clientes.model.Cliente;
import com.smithjr.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(Long id, Cliente cliente) {
        Cliente clienteExistente = clienteRepository.findById(id).orElse(null);
        if (clienteExistente != null) {
            clienteExistente.setNombres(cliente.getNombres());
            clienteExistente.setApell_paterno(cliente.getApell_paterno());
            clienteExistente.setApell_materno(cliente.getApell_materno());
            clienteExistente.setFecha_nac(cliente.getFecha_nac());
            clienteExistente.setSexo(cliente.getSexo());
            clienteExistente.setDireccion(cliente.getDireccion());
            clienteExistente.setCorreo(cliente.getCorreo());
            return clienteRepository.save(clienteExistente);
        }
        return null;
    }

    @Override
    public void eliminarcliente(Long id) {
        clienteRepository.deleteById(id);

    }
}
