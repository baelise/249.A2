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

public class driver_ii {
	// copyFlyingObjects method
	public static FlyingObject[] copyFlyingObjects(FlyingObject[] fO) {
		FlyingObject[] newA = new FlyingObject[fO.length];
		for(int i = 0; i < fO.length; i++) {
			newA[i] = fO[i].copy();
		}
		return newA;
	}
	public static void main(String[] args) {
		// Creating objects of all classes
		Airplane a = new Airplane("AAA", 2003333.3, 300000);
		UAV b = new UAV(99.99, 99.99);
		Helicopter c = new Helicopter();
		Airplane d = new Airplane("BBB", 2003333.3, 300000);
		MAV e = new MAV();
		Airplane f = new Airplane("CCC", 2003333.3, 300000);
		UAV g = new UAV(9.9, 9.9);
		UAV h = new UAV(9999.9999, 9999.9999);
		UAV i = new UAV(1.1, 2.2);
		AgriculturalDrone j = new AgriculturalDrone(4.4, 4.4,"DDD", 3);
		Quadcopter k = new Quadcopter("EEE", 6.6, 67, 5, 2016, 7, 8);
		Multirotor l = new Multirotor("FFF", 6.6, 67, 5, 2016, 7, 9);
		Helicopter m = new Helicopter();
		AgriculturalDrone n = new AgriculturalDrone(4.4, 4.4,"GGG", 3);
		AgriculturalDrone o = new AgriculturalDrone(4.4, 4.4,"HHH", 3);
		MAV p = new MAV(4.4, 44.44, "VVV", 56.56);
		Airplane q = new Airplane("III", 2003333.3, 300000);
		Quadcopter r = new Quadcopter("JJJ", 6.6, 67, 5, 2001, 7, 8);
		Multirotor s = new Multirotor("NNN", 6.6, 67, 5, 2020, 7, 9);
		Quadcopter t = new Quadcopter("LLL", 6.6, 67, 5, 2019, 7, 8);
		
		// flyingObjects array that will be passed to copyFlying Objects method
		FlyingObject[] flyingObjects = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t};
		// Printing each objects from original array to console
		System.out.println("---------- ORIGINAL FLYING OBJECTS ARRAY ----------");
		for(int u = 0; u < flyingObjects.length; u++) {
			System.out.println(flyingObjects[u].toString());
		}
		// Calling copyFlyingObjects method
		FlyingObject[] newFlyingObjects = copyFlyingObjects(flyingObjects);
		// Printing each objects from new array to console
		System.out.println("\n\n---------- NEW FLYING OBJECTS ARRAY ----------");
		for(int v = 0; v < newFlyingObjects.length; v++) {
			System.out.println(newFlyingObjects[v].toString());
		}
	}
}
