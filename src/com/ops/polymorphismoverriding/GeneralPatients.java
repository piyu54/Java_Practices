package com.ops.polymorphismoverriding;

public class GeneralPatients extends Patient{

	GeneralPatients(int patientid, String patientname, double treatmentcost) 
	{
		super(patientid, patientname, treatmentcost);
		
	}
	
	@Override
	void generateBill() {
	
	}

}
