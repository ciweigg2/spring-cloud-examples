package com.example.zwd.springcloudfeign.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Slf4j
@Configuration
public class ExceptionErrorDecoder implements ErrorDecoder {

	ObjectMapper objectMapper = new ObjectMapper();

	public Exception decode(String methodKey, Response response) {
		ObjectMapper om = new ObjectMapper();
		ExceptionInfo resEntity = null;
		Exception exception = null;
		try {
			resEntity = om.readValue(Util.toString(response.body().asReader()), ExceptionInfo.class);
		} catch (IOException ex) {
			log.error(ex.getMessage(), ex);
		}
		return new Exception(resEntity.getMessage());
	}

}
