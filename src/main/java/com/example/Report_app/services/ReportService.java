package com.example.Report_app.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.Report_app.Entity.CitizenPlan;
import com.example.Report_app.request.SearchRequest;


@Service
public interface ReportService {
public List<String> getPlanNames();
	
	public List<String> getPlaneStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();

	public Object getPlanStatuses();
	

}
