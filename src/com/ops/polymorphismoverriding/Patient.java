package com.ops.polymorphismoverriding;

/*A hospital calculates bills differently for:

General Patients

Insurance Patients

Emergency Patients

But bill generation logic is common, so we use method overriding.*/


public class Patient {

	
	 int patientid;
	 String patientname;
	 double treatmentcost;
	
	Patient(int patientid,String patientname,double treatmentcost)
	{
		this.patientid=patientid;
		this.patientname=patientname;
		this.treatmentcost=treatmentcost;
	}
	
	void generateBill()
	{
		System.out.println(" Total Bill of Patient");
	}
	
}
