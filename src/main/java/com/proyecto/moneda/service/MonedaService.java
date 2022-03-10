package com.proyecto.moneda.service;

import java.util.List;

import com.proyecto.moneda.model.Moneda;
import com.proyecto.moneda.response.MonedaAudityResponse;
import com.proyecto.moneda.response.MonedaResponse;

public interface MonedaService {
	List<Moneda> findAll();
	MonedaResponse calcularMonto(double monto,String monedaOrigen,String monedaDestino);
	Moneda saveORupdate(Moneda moneda);
}
