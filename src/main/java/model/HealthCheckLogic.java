package model;

public class HealthCheckLogic {
	public void execute(Health health) {
		Double height = health.getHeight();
		Double weight = health.getWeight();
		String bodyType;
		
		//bmi
		Double bmi = weight / ((height / 100) * (height / 100));
		health.setBmi(bmi);
		
		//bodyType
		if(bmi < 18.5) {
			//thin
			bodyType = "thin";
		} else if(bmi < 25) {
			//Nomal
			bodyType = "normal";
		} else {
			//fat
			bodyType = "fat";
		}
		health.setBodyType(bodyType);
	}
}
