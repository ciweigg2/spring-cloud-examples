package com.example.zwd.springcloudclientA.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {

	private String id;

	private String name;

}
