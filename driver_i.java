//--------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 2
// 03/04/2022
//--------------------------------------------------------------------
package driverPack;
// Importing all packages
import Airplanes.*;
import Helicopters.*;
import DroneMAV.*;
import Multirotors.*;
import UAVs.*;

public class driver_i {
	// findLeastAndMostExpensiveUAV method
	public static String findLeastAndMostExpensiveUAV (FlyingObject[] fO) { 
		UAV uTest = new UAV(); // Class to test if objects are UAVs
		UAV u[] = new UAV[fO.length]; // Array to store all UAVs in flying objects array
		int count = 0; // Will count the number of UAVs found in flying objects array
		int i;
		double prices[] = new double[0];
		if(fO.length == 0) {
			return "\nNo flying objects in this array";
		}
		else { // If flying object array isn't empty, program tests if any objects are UAVs
			for(i = 0; i < fO.length-1; i++) {
				if(fO[i].getClass() == uTest.getClass()) {
					u[0] = (UAV) fO[i];
					break;
				}
			}
			for(int j = i+1; j < fO.length; j++) {
				if(fO[j].getClass() == uTest.getClass()) {
					count = count + 1;
					u[count] = (UAV) fO[j];
				}
			}
		}
		if(count == 0) { // If only one UAV is found, it becomes the least and most expensive UAV
			if(u[0] != null) {
				System.out.println("\nOnly one UAV in this array");
			}
		}
		else {
			prices = new double[count+1]; // This array stores the prices of the UAVs in the same order as the UAV array
			for(int k = 0; k < prices.length; k++) {
				prices[k] = u[k].getPrice();
			}
			for(int l=0; l < prices.length; l++) { // Sorts both arrays in terms of the most expensive
				for(int m = 1+l; m < prices.length; m++) {
					if(prices[m] > prices[l]) {
						double tempP = prices[l];
						UAV tempU = u[l];
						
						prices[l] = prices[m];
						u[l] = u[m];
						
						prices[m] = tempP;
						u[m] = tempU;
					}
				}
			}
		}
		if(u[0] == null) { // Returns this string if no UAVs are found
			return "No UAVs in the flying object array";
		}
		else { // Return the most and least expensive UAV string
			return "\nMOST EXPENSIVE: " + u[0].toString() + "\n\nLEAST EXPENSIVE: " + u[count].toString();
		}
	}
	public static void main(String[] args) {
		// Creating objects of all classes
		Airplane a = new Airplane("AAA", 2000000, 3003003);
		Helicopter b = new Helicopter("BBB", 400000, 404040, 15, 2021, 10);
		Quadcopter c = new Quadcopter("CCC", 350000, 909040, 12, 2016, 8, 300);
		Multirotor d = new Multirotor("DDD", 950000, 808040, 11, 2008, 9, 22);
		UAV e = new UAV(30000, 88000);
		AgriculturalDrone f = new AgriculturalDrone(44400, 150000, "EEE", 2);
		MAV g = new MAV(11, 1500, "Gv4", 2.7);
		Airplane h = new Airplane("AAB", 2020200, 3003003);
		Helicopter i = new Helicopter("BBA", 1100000, 707040, 9, 2016, 11);
		Quadcopter j = new Quadcopter("CCB", 380000, 606040, 10, 2020, 14, 255);
		Multirotor k = new Multirotor("DDC", 440000, 505040, 17, 2017, 18, 17);
		UAV l = new UAV(22000, 180000);
		AgriculturalDrone m = new AgriculturalDrone(55500, 160000, "FFF", 3);
		MAV n = new MAV(12, 1750, "Hv6", 29.1);
		Airplane o = new Airplane("AAC", 2000000, 3003000);
		Helicopter p = new Helicopter("BBD", 3000000, 504040, 16, 2018, 12);
		Quadcopter q = new Quadcopter("DDD", 9500000, 808040, 11, 2008, 9, 22);
		Multirotor r = new Multirotor("DDF", 3000000, 704040, 14, 2010, 12, 19);
		UAV s = new UAV(90900, 1000000);
		AgriculturalDrone t = new AgriculturalDrone(55500, 160000, "FFG", 3);
		MAV u = new MAV(12, 1750, "Hv6", 29.1);
		Airplane v = new Airplane("AAA", 2000000, 3003003);
		Helicopter w = new Helicopter("DDD", 920000, 400000, 13, 2018, 13);
		Quadcopter x = new Quadcopter("DDD", 910000, 405050, 12, 2021, 16, 310);
		Multirotor y = new Multirotor("DDD", 90000, 406060, 11, 2016, 15, 21);
		UAV z = new UAV(8000000, 14000);
		
		// toString for all objects above
		System.out.println("---------- Flying Objects ----------");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(g.toString());
		System.out.println(h.toString());
		System.out.println(i.toString());
		System.out.println(j.toString());
		System.out.println(k.toString());
		System.out.println(l.toString());
		System.out.println(m.toString());
		System.out.println(n.toString());
		System.out.println(o.toString());
		System.out.println(p.toString());
		System.out.println(q.toString());
		System.out.println(r.toString());
		System.out.println(s.toString());
		System.out.println(t.toString());
		System.out.println(u.toString());
		System.out.println(v.toString());
		System.out.println(w.toString());
		System.out.println(x.toString());
		System.out.println(y.toString());
		System.out.println(z.toString());

		// equals methods
		System.out.println("\n---------- Equals Methods ----------\n");
		System.out.println(a.equals(b)); // testing two objects from different classes
		System.out.println(d.equals(q)); // testing two objects of different classes with all the same values
		System.out.println(e.equals(l)); // testing two objects from the same class with different values
		System.out.println(m.equals(t)); // testing two objects from the same class with similar values
		System.out.println(n.equals(u)); // testing two objects from the same class with all the same values
		
		// Creating array with an object from every class
		FlyingObject[] flyingObjects1 = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};
		// Creating array with no UAVs
		FlyingObject[] flyingObjects2 = {a, b, c, d, f, g, h, i, j, k, m, n, o, p, q, r, t, u, v, w, x, y};

		// Calling findLeastAndMostExpensiveUAV expensive UAV and printing result to console
		System.out.println("\n---------- Finding Least and Most Expensive UAV ----------");
		System.out.println("\nTest 1:");
		System.out.println(findLeastAndMostExpensiveUAV(flyingObjects1));
		System.out.println("\nTest 2:");
		System.out.println("\n" + findLeastAndMostExpensiveUAV(flyingObjects2));
	}
}
