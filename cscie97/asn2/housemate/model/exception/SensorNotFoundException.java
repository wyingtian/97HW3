package cscie97.asn2.housemate.model.exception;

public class SensorNotFoundException extends Exception {

	public SensorNotFoundException() {
		super();	
	}
	public SensorNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}
	
}