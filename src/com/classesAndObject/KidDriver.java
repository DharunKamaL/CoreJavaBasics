package com.classesAndObject;

public class KidDriver 
{

	public static void main(String[] args)
	{
		
		Kid Kidone = new Kid("Pinky",8);
		Kidone.play();
		System.out.println("Kidone name is :"+Kidone.name);
		System.out.println("Kidtwo age is :"+Kidone.age);
		
		Kid KidTwo = new Kid("Wicky", 9);
		KidTwo.play();
		System.out.println("Kidtwo name is :"+KidTwo.name);
		System.out.println("Kidtwo age is :"+Kidone.age);
		
		EncapsulatedKid kid = new EncapsulatedKid();
		kid.setAge(4);
		kid.setName("Robert");
//		int age = kid.getAge();
		System.out.println("Name:"+kid.getName()+","+" Age:"+kid.getAge());
//		String name = kid.getName();
		
	}

}
