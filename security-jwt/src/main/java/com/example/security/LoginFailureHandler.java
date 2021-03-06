package com.example.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.example.http.Api;
import com.example.http.Error;
import com.example.util.JsonUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException e) throws IOException, ServletException {
		response.setContentType("application/json;charset=utf-8");
		Error error = e.getMessage() == null ? Error.USER_ACCOUNT_NOT_EXIST : Error.USER_CREDENTIALS_ERROR;
		response.getWriter().write(JsonUtils.toJSONString(Api.failure(error)));
	}
}
