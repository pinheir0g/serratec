package br.org.serratec.academia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.academia.entities.User;
import br.org.serratec.academia.records.CredenciaisLoginRecord;
import br.org.serratec.academia.records.JwtTokenRecord;
import br.org.serratec.academia.records.UserRecord;
import br.org.serratec.academia.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	UserService userService;

	@PostMapping("/signin")
	public ResponseEntity<JwtTokenRecord> login(@RequestBody CredenciaisLoginRecord credenciaisLoginRecord) {
		JwtTokenRecord jwtToken = userService.authenticateUser(credenciaisLoginRecord);
		return ResponseEntity.status(HttpStatus.OK).body(jwtToken);
	}
	@PostMapping("/signup")
	public ResponseEntity<User> cadastro(@RequestBody UserRecord userRecord) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userRecord));
	}

}
