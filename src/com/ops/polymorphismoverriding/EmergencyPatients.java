package com.ops.polymorphismoverriding;

public class EmergencyPatients extends Patient{

	EmergencyPatients(int patientid, String patientname, double treatmentcost) {
		super(patientid, patientname, treatmentcost);
		
	}
	
	@Override
	void generateBill() {
		
	}

}
