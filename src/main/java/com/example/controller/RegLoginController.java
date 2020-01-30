package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.model.LoginVO;
import com.example.service.LoginRegService;

@Controller
@SessionAttributes("userData")  // multiple Model set in session @SessionAttributes({"userData","userInfo"}) 
public class RegLoginController {
 
	@Autowired
	LoginRegService LoginRegService;
	
	@RequestMapping("/")
	public String loadReg() {	
		return "reg";
	}
	
	@RequestMapping("login")
	public String loadLogin() {	
		return "login";
	}
	
	@RequestMapping("profile")
	public String loadProfile() {	
		return "profile";
	}
	
	@GetMapping("insertReg")
	public String insertReg(@ModelAttribute LoginVO loginVO) {
		
		this.LoginRegService.insertUser(loginVO);
		return "redirect:/";
	}
	
	@GetMapping("checkLogin")
	public String checkLogin(@ModelAttribute LoginVO loginVO, Model model) {		
		
		loginVO = this.LoginRegService.isAvailableUser(loginVO.getEmail(), loginVO.getPassword());
		
		if(loginVO!=null) {
			
			model.addAttribute("userData", loginVO);
			return "welcome";
		}
		else			
			return "redirect:login";
	}
}