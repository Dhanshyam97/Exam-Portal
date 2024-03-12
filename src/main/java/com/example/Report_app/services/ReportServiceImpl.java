package com.example.Report_app.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Entity;

import com.example.Report_app.Entity.CitizenPlan;
import com.example.Report_app.repo.CitizenPlanRepository;
import com.example.Report_app.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private CitizenPlanRepository planRepo;

	@Override
	public List<String> getPlanNames() {
      return planRepo.getPlanName();
	}

	@Override
	public List<String> getPlaneStatus() {
		return planRepo.getPlanstatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		
		return planRepo.findAll();
	
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getPlanStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

}
