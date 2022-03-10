package com.proyecto.moneda.service.impl;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.moneda.model.Moneda;
import com.proyecto.moneda.repository.MonedaRepository;
import com.proyecto.moneda.response.MonedaAudityResponse;
import com.proyecto.moneda.response.MonedaResponse;
import com.proyecto.moneda.service.MonedaService;
import com.proyecto.moneda.util.Utilitario;

@Service
public class MonedaServiceImpl implements MonedaService{

	@Autowired
	private HttpServletRequest httpServletRequest;
	
	@Autowired
	private MonedaRepository monedaRepository;
	
	@Override
	public List<Moneda> findAll() {
		return  monedaRepository.findAll();
	 
	}

	@Override
	public MonedaResponse calcularMonto(double monto, String monedaOrigen, String monedaDestino) {

		double tipoCambio = monedaRepository.findByDescripcion(monedaOrigen,monedaDestino).getTipocambio();
		double montoDevuelto = monto*tipoCambio;
		
		MonedaResponse response  = new MonedaResponse();
		response.setMonto(monto);
		response.setMontoConTipoCambio(montoDevuelto);
		response.setTipoDeCambio(tipoCambio);
		response.setMonedaOrigen(monedaOrigen);
		response.setMonedaDestino(monedaDestino);

		return response;
	}

	@Override
	public Moneda saveORupdate(Moneda moneda) {
		if(moneda.getId()!=null){
			Optional<Moneda> find = monedaRepository.findById(moneda.getId());
			if(find.isPresent()) {
				Moneda mon = find.get();
				mon.setMonedadestino(moneda.getMonedadestino());
				mon.setMonedaorigen(moneda.getMonedaorigen());
				mon.setTipocambio(moneda.getTipocambio());
				
				mon.setCampoSegUpd(getUserAudity(), Instant.now());
				monedaRepository.save(mon);
				return mon;
			}
			
		} else {
			moneda.setCampoSegIns(getUserAudity(), Instant.now());
			monedaRepository.save(moneda);
		}
		return moneda;
	}



	public String getUserAudity() {
		return Utilitario.getUsuario(httpServletRequest.getHeader("Authorization"));
	}

 

 

}