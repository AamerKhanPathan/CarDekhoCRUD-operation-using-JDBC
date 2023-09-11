package CRUDCARDekho;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Car car=new Car();
		CarCRUD carCRUD=new CarCRUD();
		
		Scanner scanner=new Scanner(System.in);
		boolean condition=true;
		do {
			System.out.println("Enter your choice \n1)Insert the car \n2)update the car \n3)delete the car\n4)get the  car information \n5)show all cars record"
					+ "\n6)Exit");
			int num=scanner.nextInt();
			
			switch (num) {
			case 1:
			{
				System.out.println("enter car id");
				int id=scanner.nextInt();
				
				System.out.println("enter car name");
				String name=scanner.next();
				
				System.out.println("enter car Compony name");
		        String  componyName=scanner.next();
				
				System.out.println("enter car price");
		        double price=scanner.nextDouble();
				
				System.out.println("enter car color");
		          String color=scanner.next();
		          
		          car.setId(id);
		          car.setName(name);
		          car.setComponyName(componyName);
		          car.setPrice(price);
		          car.setColor(color);
		          
		          carCRUD.inserCar(car);
		         
			}
				
				break;
			case 2:
			{
				System.out.println("enter car id");
				int id=scanner.nextInt();
				
				System.out.println("enter car name");
				String name=scanner.next();
				
				System.out.println("enter car Compony name");
		        String  componyName=scanner.next();
				
				System.out.println("enter car price");
		        double price=scanner.nextDouble();
				
				System.out.println("enter car color");
		          String color=scanner.next();
		          
		          car.setId(id);
		          car.setName(name);
		          car.setComponyName(componyName);
		          car.setPrice(price);
		          car.setColor(color);
		          
		          carCRUD.updateCar(car);
			}
			break;
			case 3:{

				System.out.println("enter car id which you want to remove from record");
				int id=scanner.nextInt();
				
				carCRUD.deleteCar(id);
			}
			
			break;
			case 4:{
				System.out.println("enter car id which you want to See");
				int id=scanner.nextInt();
				carCRUD.showCar(id);
				
			}
			break;
			
			case 5:{
				carCRUD.showAllCars();
				
			}
			break;
			case 6:
			{
				condition=false;
				
			}
			break;
			default:
			{
				System.out.println("enter valid preferance");
				
			}
				break;
				
			}
			
		} while (condition);
		
		System.out.println("Thank you.. for use my application  "
				+ "\nrun again if you want to perform some CRUD\n'regards Aamer'");
		
		
		
		
		
		
	}

}
