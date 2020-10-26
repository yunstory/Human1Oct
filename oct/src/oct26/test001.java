package oct26;

import dto.*;

public class test001 {

	public static void main(String[] args) {
		

		Car car = new Car();
		car.color="빨강";
		car.company="현대";
		car.maxSpeed=200;
		car.model="소나타";
		car.tire.company="금호";
		car.tire.mileage=20;
		car.tire.price=50000;
		
		
		System.out.println("\n------------------\n");
		
		
		Car newCar =new Car();
		//newCar=car;
		newCar.color = car.color;
		newCar.company = car.company;
		newCar.maxSpeed = car.maxSpeed;
		newCar.model = car.model;
		//newCar.tire=car.tire;
		newCar.tire.company = car.tire.company;
		newCar.tire.mileage = car.tire.mileage;
		newCar.tire.price = car.tire.price;



	}

}
