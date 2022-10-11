package org.alvas.onetoone;

import java.util.Scanner;

public class PersonController {
	
	static Person person = new Person();
	static Adhar adhar = new Adhar();
	static PersonDao dao = new PersonDao();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
			System.out.println("1.Save Person Adhar 2.Get Details 3.Delete by Id 4.Update 5.Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				adhar.setAdharNumber(123456456760L);
				adhar.setAddress("Mijar");
			
				person.setName("loooeh");
				person.setEmail("ha@gmail.com");
				person.setAdhar(adhar);
				dao.savePerson(person, adhar);
				break;
				
			case 2:
				Person person = dao.getPersonAdhar(1);
				System.out.println("Person details");
				System.out.println(person.getId()+"\n"+person.getEmail()+"\n"+person.getName());
				
				System.out.println("Adhar details");
				System.out.println(person.getAdhar().getId());
				System.out.println(person.getAdhar().getAdharNumber());
				System.out.println(person.getAdhar().getAddress());
				
			case 3:
				System.out.println("Enter id");
				int id = sc.nextInt();
				dao.deletePersonById(id);
				break;
				
			case 4:
				System.out.println("Enter id");
				int id1 = sc.nextInt();
				System.out.println("Enter new name");
				String name = sc.next();
				System.out.println("Enter new adhar no");
				long adharNumber = sc.nextLong();
				dao.updateById(id1,name,adharNumber);
				break;
			
			case 5:
				System.exit(0);
			}
		}
}
}