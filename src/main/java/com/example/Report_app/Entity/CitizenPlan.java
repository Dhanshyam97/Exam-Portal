package com.example.Report_app.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="CITIZEN_PLAN")
public class CitizenPlan implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer citizenId;
	private String CitizenName;
	private String gender;
	private String planName;
	private String planstatus;
	private LocalDate planeStartDate;
	private LocalDate planEndDate;
	private Double benefitAmt;
	private String denialReson;
	private LocalDate terminatedDate;
	private String terminationRsn;
	
	public CitizenPlan() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return CitizenName;
	}
	public void setCitizenName(String citizenName) {
		CitizenName = citizenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanstatus() {
		return planstatus;
	}
	public void setPlanstatus(String planstatus) {
		this.planstatus = planstatus;
	}
	public LocalDate getPlaneStartDate() {
		return planeStartDate;
	}
	public void setPlaneStartDate(LocalDate localDate) {
		this.planeStartDate = localDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate localDate) {
		this.planEndDate = localDate;
	}
	public Double getBenefitAmt() {
		return benefitAmt;
	}
	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}
	public String getDenialReson() {
		return denialReson;
	}
	public void setDenialReson(String denialReson) {
		this.denialReson = denialReson;
	}
	public LocalDate getTerminatedDate() {
		return terminatedDate;
	}
	public void setTerminatedDate(LocalDate terminatedDate) {
		this.terminatedDate = terminatedDate;
	}
	public String getTerminationRsn() {
		return terminationRsn;
	}
	public void setTerminationRsn(String terminationRsn) {
		this.terminationRsn = terminationRsn;
	}
}


