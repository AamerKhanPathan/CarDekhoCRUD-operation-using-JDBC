package CRUDPerson;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner scanner=new Scanner(System.in);
		 Person person=new Person();
		PersonCRUD personCRUD=new PersonCRUD();
		boolean condition=true ;
		do {
			System.out.println("Enter the choid\n1) Save person\n2) Update person\n3) Delete person\n4)show person ");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:{
				System.out.println("enter id");
				int id=scanner.nextInt();
				
				System.out.println("Enter the name");
				String name = scanner.next();
				
				System.out.println("Enter the phone");
				long phone = scanner.nextLong();
				
				System.out.println("Enter the addresss");
				String address=scanner.next();
				
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				person.setAddress(address);
				
				personCRUD.savePerson(person);
			}
				
				break;
			case 2:{
				System.out.println("enter id");
				int id=scanner.nextInt();
				
				System.out.println("Enter the name");
				String name = scanner.next();
				
				System.out.println("Enter the phone");
				long phone = scanner.nextLong();
				
				System.out.println("Enter the addresss");
				String address=scanner.next();
				
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				person.setAddress(address);
				
				personCRUD.updatePerson(person);
			}
				break;
			case 3:
			{
				System.out.println("enter id");
				int id=scanner.nextInt();
				
				personCRUD.deletePerson(id);
				
			}
				break;
				
			case 4: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();

				personCRUD.showPerson(id);
			}
				break;
			default:
				System.out.println("\nKindly Enter Correct Choice Number\n");
				break;
			}

			
			
		} while (condition);
		
		
		
		
		
	}

}
