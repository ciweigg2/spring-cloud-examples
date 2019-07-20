package com.example.zwd.springcloudmultinacofconfig.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Component
@RefreshScope
public class User implements Serializable {

	@Value("${user.id}")
	private String id;

}
