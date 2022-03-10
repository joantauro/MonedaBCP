package com.proyecto.moneda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.moneda.model.Moneda;
import com.proyecto.moneda.model.User;
import com.proyecto.moneda.response.MonedaResponse;
import com.proyecto.moneda.service.MonedaService;
import com.proyecto.moneda.util.Utilitario;

@RestController
@RequestMapping (value="Moneda")
public class MonedaController {

	@Autowired
	private MonedaService monedaService;
	
	@GetMapping(value="listarMonedas")
	public List<Moneda> getTasks() {
		return monedaService.findAll();
	}
	
	@GetMapping(value="Calcular")
	public MonedaResponse getCalcular(@RequestParam double monto,@RequestParam String monedaOrigen,@RequestParam String monedaDestino) {
		return monedaService.calcularMonto(monto, monedaOrigen, monedaDestino);
	}
	
	@PostMapping(path = { "guardar" }, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public Moneda guardar(@RequestBody Moneda moneda) {
		return monedaService.saveORupdate(moneda);
	}
	
	@PutMapping(path = { "actualizar/{id}"}, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public Moneda actualizar(@PathVariable long id, @RequestBody Moneda moneda) {
		moneda.setId(id);
		return monedaService.saveORupdate(moneda);
	}
}