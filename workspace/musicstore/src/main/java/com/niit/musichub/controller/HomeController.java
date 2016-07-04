package com.niit.musichub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		System.out.println("hello");
		return "index";
	}
	
	@RequestMapping("contactUs")
	public String contactUs()
	{
		System.out.println("hello");
		return "MyWebPage";
	}

	@RequestMapping("allProducts")
	public String allProducts()
	{
		System.out.println("hello");
		return "AllProducts";
	}
	
	@RequestMapping("category")
	public String Category()
	{
		System.out.println("hello");
		return "category";
	}
}

