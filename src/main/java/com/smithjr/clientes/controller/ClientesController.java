package com.smithjr.clientes.controller;


import com.smithjr.clientes.model.Cliente;
import com.smithjr.clientes.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientesController {


    // iyectaremos el servicio
    @Autowired
    ClientesService clientesService;

    @GetMapping("/clientes")
    public List<Cliente> findAllClientes(){
        return clientesService.findAllClientes();
    };

    @PostMapping("/registrarClientes")
    public Cliente registrarCliente(@RequestBody Cliente cliente){
        return clientesService.registrarCliente(cliente);
    }

    @PutMapping("/actualizarClientes/{id}")
    public Cliente actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        return clientesService.actualizarCliente(id, cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCliente(@PathVariable Long id){
        clientesService.eliminarcliente(id);
    }


}
