/*
 * created by Gothbag <josemariacagigalso@gmail.com>
 * this represents a "linked" list of cars
 * 
 */

import java.util.LinkedList;

public class CarLinkedList {

	public static void main(String[] args) {
		//declarations
		LinkedList<Car> cars = new LinkedList<Car>();
		//we add the cars
		cars.offer(new Car("Alfa Romeo", "Giulia", 2900, 6));
		cars.offer(new Car("Dacia", "Sandero", 1200, 4));
		cars.offer(new Car("Ford", "Focus", 2000, 4));
		cars.offer(new Car("Opel", "Insignia", 2200, 4));
		Car ibizi = new Car("Seat", "Ibiza", 1600, 4);
		cars.offer(ibizi);
		Car car2 = cars.get(2);
		car2.setFiscalHorsepower(0);
		System.out.println("The fiscal horsepower of car in position 2 is " + car2.getFiscalHorsepower() + ".");
		//the Hyundai is added to the beginning of the list
		cars.addFirst(new Car("Hyundai", "Atos", 1500, 3));
		Car focci = new Car("Ford", "Focus", 2000, 4);
		//the Ford Focus is appended to the list
		cars.addLast(focci);
		System.out.println(cars.lastIndexOf(focci));
		System.out.println("Yes, it seems we are able to add duplicate elements. That may be because we haven't set a property which determines what makes two cars equal.");
		cars.add(1,new Car("Audi", "A8", 4600, 8));
		System.out.println("Yes, it seems we can \"add\" a car into a position previously occupied by another element as now the make of the car in position 1 is " + cars.get(1).getMake() + ".");
		Car miito = new Car("Seat", "Mii", 1000, 3);
		cars.set(cars.indexOf(ibizi), miito);
		//we iterate over the array to obtain the position of each Ford Focus in the list
		int carInd = 0;
		for (Car c : cars) {		
			if ( c.getMake().equals("Ford") && c.getModel().equals("Focus") ) {
				System.out.print(carInd + " ");
			}
			carInd++;
			
		}
		System.out.println();
		//now we go over the array to print out the details of each car in it.
		for (Car c : cars) {
			c.setFiscalHorsepower(0);
			System.out.println(c.getMake() + " " + c.getModel() + " " + c.getEngineDisplacement() + " " + c.getNCylinders());
			
		}
	}

}
