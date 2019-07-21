package com.example.zwd.springcloudfeign.exception;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ExceptionInfo implements Serializable {

	private Date timestamp;

	private Integer status;

	private String message;

	private String path;

	private String error;

}
