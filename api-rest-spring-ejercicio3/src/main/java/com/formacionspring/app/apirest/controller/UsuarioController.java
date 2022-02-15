package com.formacionspring.app.apirest.controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NestedRuntimeException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.formacionspring.app.apirest.entity.Usuarios;
import com.formacionspring.app.apirest.service.UsuarioService;

@RestController
@RequestMapping("/app")
public class UsuarioController {
	@Autowired
	private UsuarioService servicio;
	
	
	
	@PostMapping("/usuarios")
	public ResponseEntity<?> login(@RequestBody String usuarioPost, @RequestBody String contraseña) {
		
		Map<String,Object> response=new HashMap<>();
		
		boolean login = false;
		boolean usuarioEncontrado = false;
		
		try 
		{
			List<Usuarios> listaUsuarios = servicio.findAll();
			for(Usuarios usuario : listaUsuarios)
			{
				if(usuarioPost.equals(usuario.getUsuario_id())) 
				{
					usuarioEncontrado=true;
					if(contraseña.equals(usuario.getContraseña()))
					{
						login=true;
						break;
					}
				}
			}
		} 
		catch (Exception e) 
		{
			response.put("mensaje", "error al realizar la consulta");
			response.put("error", e.getMessage().concat("_ ").concat(((NestedRuntimeException) e).getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(login)
		{
			response.put("mensaje", "sesión iniciada");
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
		}
		else if(usuarioEncontrado)
		{
			response.put("mensaje", "error de contraseña");
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
		
		response.put("mensaje", "el usuario no es correcto");
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
	}

}
