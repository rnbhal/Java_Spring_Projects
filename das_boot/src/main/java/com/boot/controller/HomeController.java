package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "hi rohit bhal";
	}
}
