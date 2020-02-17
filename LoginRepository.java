package com.fms.Repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.Entity.UserInfo;
import com.fms.Model.UserCredentails;

import reactor.core.publisher.Mono;

@Repository
public interface LoginRepository extends ReactiveCrudRepository<UserInfo, Long> {

	@Query("select * from userinfo where is_active_user=1 "/*+and email =" + email + " and userpassword = " + password*/)
	Mono<UserInfo> findByEmail(String email, String password);

	
}