package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Employee")
public class EmpController {
	@GetMapping("/Hello")
	public String Hello() {
		return "Hello Employee";
	}
	

}
