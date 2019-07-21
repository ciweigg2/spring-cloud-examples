package com.example.zwd.springcloudgateway.hystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HystrixController {

	@GetMapping("/fallback")
	public Map<String,Object> fallback() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Code",200);
		map.put("Message","请稍后再试");
		return map;
	}

}
