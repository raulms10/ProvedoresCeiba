package com.ceiba.proveedores.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.proveedores.Repositorio.ProveedoresRepository;
import com.ceiba.proveedores.modelo.Proveedor;

@Service
public class ProveedorLogica implements IProveedorLogica {

	@Autowired
	private ProveedoresRepository repositorio;
	
	@Override
	public List<Proveedor> obtenerTodosProveedores() {
		return repositorio.findAll();
	}

	@Override
	public Proveedor obtenerPorId(int id) {
		return repositorio.findOne(id);
	}

	@Override
	public Proveedor agregarProveedor(Proveedor proveedor) {
		return this.repositorio.save(proveedor);
	}

	@Override
	public Proveedor modificarProveedor(Proveedor proveedor) {
		return this.repositorio.save(proveedor);
	}

}
