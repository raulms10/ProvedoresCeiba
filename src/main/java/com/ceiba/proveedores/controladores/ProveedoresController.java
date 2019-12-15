package com.ceiba.proveedores.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.proveedores.logica.IProveedorLogica;
import com.ceiba.proveedores.modelo.Proveedor;

@RestController
@RequestMapping("/proveedores")
public class ProveedoresController {

	@Autowired
	private IProveedorLogica logica;
	
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Proveedor> ListaProveedores() {
		return logica.obtenerTodosProveedores();
	}
}
