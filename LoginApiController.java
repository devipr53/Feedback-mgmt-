package com.fms.Api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fms.Entity.UserInfo;
import com.fms.Repository.LoginRepository;

import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-24T12:20:46.638+05:30[Asia/Calcutta]")
@Controller
public class LoginApiController implements LoginApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	@Autowired
	private DatabaseClient databaseClient;
	@Autowired
	LoginRepository loginRepository;

	@Autowired
	public LoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public Optional<ObjectMapper> getObjectMapper() {
		return Optional.ofNullable(objectMapper);
	}

	@Override
	public Optional<HttpServletRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	public Mono<ResponseEntity<UserInfo>> loginUser(@RequestParam(value = "emailAddress", required = true) String email,
			@RequestParam(value = "password", required = true) String password) {

		return (Mono<ResponseEntity<UserInfo>>) databaseClient
				.execute("select * from userinfo where is_active_user=1 and email ='" + email + "' and userpassword = '"
						+ password + "'")
				.as(UserInfo.class).fetch().first().map(userInfo -> ResponseEntity.ok(userInfo))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
	}

}
