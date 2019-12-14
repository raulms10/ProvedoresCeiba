package com.ceiba.proveedores.Repositorio;

import com.ceiba.proveedores.modelo.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface ProveedoresRepository extends CrudRepository<Proveedor, Integer> 
{
    Proveedor findByName(String nombre);
}