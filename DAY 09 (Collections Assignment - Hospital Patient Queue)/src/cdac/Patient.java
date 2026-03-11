package cdac;

public class Patient implements Comparable<Patient> {
	
	int patientId;
	String patientName;
	String disease;
	int severity;
	
	public Patient(int patientId, String patientName, String disease, int severity) {

		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
		this.severity = severity;
	}

	public void patientDisplay() {
		
		System.out.println( "   " + patientId + "            " + patientName + "              " + disease);
	}
	
	public int compareTo(Patient p) {

        if(this.severity != p.severity)
            return this.severity - p.severity;  

        return this.patientId - p.patientId;  
    }

}
