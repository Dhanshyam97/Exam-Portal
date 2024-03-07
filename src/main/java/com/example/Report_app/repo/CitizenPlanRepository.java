package com.example.Report_app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Report_app.Entity.CitizenPlan;


@Repository
public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{
	@Query("select distinct(planName) from CitizenPlan")
	public List<String> getPlaneNames();
	
	@Query("select distinct(planstatus) from CitizenPlan")
	public List<String> getPlaneStatus();

}
