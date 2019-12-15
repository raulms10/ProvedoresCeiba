package com.ceiba.proveedores.Biblioteca;

import com.ceiba.proveedores.modelo.Respuesta;

public class VerficarDireccion implements IVerficarDireccion {

	@Override
	public Respuesta<Object> verificarDireccion(String direccion) {
		
		if(!direccion.toLowerCase().startsWith("cl")) 
		{
			return new Respuesta<Object>(false, "La direccion debe iniciar con CL");
		}
		
		return new Respuesta<Object>(true, "");
	}

}
