package com.proyecto.moneda.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Utilitario {

	@Autowired
	private HttpServletRequest httpServletRequest;
	
	public Utilitario() {
		// TODO Auto-generated constructor stub
	}

	
	public static String getUsuario(String jwtToken ) {
		String[] split_string = jwtToken.split("\\.");
        String base64EncodedHeader = split_string[0];
        String base64EncodedBody = split_string[1];
        String base64EncodedSignature = split_string[2];
        
        Base64 base64Url = new Base64(true);
        String header = new String(base64Url.decode(base64EncodedHeader));
        String body = new String(base64Url.decode(base64EncodedBody));     
        
        JsonObject jsonObject = new Gson().fromJson( body, JsonObject.class);
        JsonElement jsonElement = jsonObject.get("sub");
        
        return jsonElement.getAsString();
	}
}
