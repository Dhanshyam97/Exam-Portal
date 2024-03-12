package com.example.Report_app.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Report_app.Entity.CitizenPlan;
import com.example.Report_app.request.SearchRequest;
import com.example.Report_app.services.ReportService;



@Controller
public class ReportController {
	@Autowired	
	private ReportService services;
	
	@PostMapping("/search")
	public String handleSearch(SearchRequest request,Model model) {
		System.out.println(request);
		
		List<CitizenPlan>plans= services.search(request);
		model.addAttribute("plans", plans);
		init (model);
		return "index";
	}
	
	@GetMapping("/")
	public String indexPage(Model model) {
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("search", new SearchRequest());
		model.addAttribute("names",  services.getPlanNames());
		model.addAttribute("status", services.getPlaneStatus());
	}
	
}
