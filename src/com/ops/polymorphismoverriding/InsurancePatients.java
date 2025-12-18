package com.ops.polymorphismoverriding;

public class InsurancePatients extends Patient{

	InsurancePatients(int patientid, String patientname, double treatmentcost) {
		super(patientid, patientname, treatmentcost);
		
	}
	
	@Override
	void generateBill() {
		
	}

	
	
}
