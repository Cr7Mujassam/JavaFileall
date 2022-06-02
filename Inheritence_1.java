package com.Inheritence;

public class Inheritence_1 {
	
	String building_name;
	Inheritence_1(){
		System.out.println(this.building_name);
	}
	
	int fuel() {
		System.out.println("Fuel1");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		building b1 = new building();
		String B1=b1.building_name = "Taukir";
		String B2=b1.name = "Khan";
		room1 r1= new room1();
		int l= r1.length=10;
		int b=r1.breadth=20;
		Inheritence_1 i1= new Inheritence_1();
		i1.fuel();
		b1.fuel();

		
		

	}

}