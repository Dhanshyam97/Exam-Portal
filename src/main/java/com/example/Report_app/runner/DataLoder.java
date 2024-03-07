package com.example.Report_app.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.Report_app.Entity.CitizenPlan;
import com.example.Report_app.repo.CitizenPlanRepository;

@Component
public class DataLoder implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
	     repo.deleteAll();
//		citizen plan
		CitizenPlan c1= new CitizenPlan();
		c1.setCitizenName("Shubham");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanstatus("Approved");
		c1.setPlaneStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);
		
		CitizenPlan c2= new CitizenPlan();
		c2.setCitizenName("Sumit");
		c2.setGender("Male");
		c2.setPlanName("Cash"); 
		c2.setPlanstatus("Denied");
		c2.setPlaneStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setDenialReson("Rent Income");
		
		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Roshani");
		c3.setGender("feMale");
		c3.setPlanName("Cash");
		c3.setPlanstatus("Terminated");
		c3.setPlaneStartDate(LocalDate.now().plusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationRsn("Employee");
		
//		Food Plan
		CitizenPlan c4= new CitizenPlan();
		c4.setCitizenName("raj");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanstatus("Approved");
		c4.setPlaneStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(4000.00);
		
		CitizenPlan c5= new CitizenPlan();
		c5.setCitizenName("Rohan");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanstatus("Denied");
		c5.setPlaneStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setDenialReson("Property Income");
		
		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Rani");
		c6.setGender("feMale");
		c6.setPlanName("Food");
		c6.setPlanstatus("Terminated");
		c6.setPlaneStartDate(LocalDate.now().plusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(5000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationRsn("Employeed");
		
//		Medical Plan Data
		CitizenPlan c7= new CitizenPlan();
		c7.setCitizenName("Sanket");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanstatus("Approved");
		c7.setPlaneStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(4000.00);
		
		CitizenPlan c8= new CitizenPlan();
		c8.setCitizenName("vijay");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanstatus("Denied");
		c8.setPlaneStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setDenialReson("Property Income");
		
		CitizenPlan c9=new CitizenPlan();
		c9.setCitizenName("sona");
		c9.setGender("feMale");
		c9.setPlanName("Medical");
		c9.setPlanstatus("Terminated");
		c9.setPlaneStartDate(LocalDate.now().plusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(5000.00);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationRsn("Govertment job");
		
//		Employment Plan Data
		CitizenPlan c10= new CitizenPlan();
		c10.setCitizenName("Viraj");
		c10.setGender("Male");
		c10.setPlanName("Employment ");
		c10.setPlanstatus("Approved");
		c10.setPlaneStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(4000.00);
		
		CitizenPlan c11= new CitizenPlan();
		c11.setCitizenName("Prashant");
		c11.setGender("Male");
		c11.setPlanName("Employment ");
		c11.setPlanstatus("Denied");
		c11.setPlaneStartDate(LocalDate.now());
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setDenialReson("Property Income");
		
		CitizenPlan c12=new CitizenPlan();
		c12.setCitizenName("sakashi");
		c12.setGender("feMale");
		c12.setPlanName("Employment ");
		c12.setPlanstatus("Terminated");
		c12.setPlaneStartDate(LocalDate.now().plusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(5000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationRsn("Govertment job");

	List<CitizenPlan> list= Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);
	repo.saveAll(list)	;  
		
	
		
	}


}
