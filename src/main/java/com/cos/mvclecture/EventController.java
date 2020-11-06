package com.cos.mvclecture;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

	@Autowired
	EventService eventService;
	
	// @GetMapping 4.3버전부터
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public String events(Model model) { // <- 핸들러가 됨
		// Model model : 화면에 전달할 모델 (Map)
		// 화면에 전달할 model에다가 우리가 담고 싶은 것을 담으면 된다.
		//model.addAllAttributes(""); // Map 이므로 key, value형식으로 담는거
		model.addAttribute("events", eventService.getEvents());
		return "events";
	}
	
	
}
