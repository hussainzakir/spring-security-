package com.mvc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.beans.MyBean;
import com.mvc.beans.UserTableData;
import com.mvc.dao.Mydao;
import com.mvc.dao.UserTableDataDao;

@Controller
public class MyController {

	@Autowired
	Mydao dao;

	@Autowired
	UserTableDataDao userDao;

	@RequestMapping("/auth/homepage")
	public String test(Model m) {
		return "homepage";
	}

	@GetMapping("/login")
	public String login(@ModelAttribute("userdata") UserTableData userdata) {	
		return "login";
	}

	@RequestMapping(value = "auth/saveform", method = RequestMethod.POST)
	public String retriveLogin(@ModelAttribute("userdata") UserTableData userdata) {
		System.out.println(userdata);
		return "test";
	}

	
	@RequestMapping(value = "auth/admin/test")
	public String home1() {
		return "test";
	}
		
}
