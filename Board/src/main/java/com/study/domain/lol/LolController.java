package com.study.domain.lol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LolController {

	static String authkey = "67556a6f7463686f38345a7a506347";
	@GetMapping("/lol/lolInfo.do")
	public String openLolList (Model model){
		model.addAttribute("a", "a");
		model.addAttribute("authkey",authkey);
		return "lol/lolInfo";
	}
}
