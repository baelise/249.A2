package driverPack;
import Airplanes.*;
import Helicopters.*;
import DroneMAV.*;
import Multirotors.*;
import UAVs.*;


public class driver {
	public static String findLeastAndMostExpensiveUAV (Object[] fR) { 
		UAV uTest = new UAV();
		UAV u[] = new UAV[fR.length];
		int count = 0;
		int i;
		double prices[] = new double[0];
		if(fR.length == 0) {
			return "\nNo flying objects in this array";
		}
		else {
			for(i = 0; i < fR.length-1; i++) {
				if(fR[i].getClass() == uTest.getClass()) {
					u[0] = (UAV) fR[i];
					break;
				}
			}
				
			for(int j = i+1; j < fR.length; j++) {
				if(fR[j].getClass() == uTest.getClass()) {
					count = count + 1;
					u[count] = (UAV) fR[j];
				}
			}
		}
		if(count == 0) {
			if(u[0] != null) {
				System.out.println("\nOnly one UAV in this array");
			}
		}
		else {
			prices = new double[count+1];
			for(int k = 0; k < prices.length; k++) {
				prices[k] = u[k].getPrice();
			}
			for(int l=0; l < prices.length; l++) {
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
		if(u[0] == null) {
			return "No UAVs in the flying object array";
		}
		else {
			
			return "\nMOST EXPENSIVE: " + u[0].toString() + "\n\nLEAST EXPENSIVE: " + u[count].toString();
		}
	}

	public static void main(String[] args) {
		
		Airplane a = new Airplane("TY", 2003333.3, 300000);
		UAV b = new UAV(99.99, 99.99);
		Helicopter c = new Helicopter();
		Airplane d = new Airplane("TY", 2003333.3, 300000);
		MAV e = new MAV();
		Airplane f = new Airplane("TY", 2003333.3, 300000);
		UAV g = new UAV(9.9, 9.9);
		UAV h = new UAV(9999.9999, 9999.9999);
		UAV i = new UAV(1.1, 2.2);
		UAV j = new UAV(3.3, 4.4);
		UAV k = new UAV(5.5, 6.6);
		UAV l = new UAV(7.7, 8.8);
		UAV m = new UAV(9.9, 10.10);
		UAV n = new UAV(11.11, 12.12);
		UAV o = new UAV(13.13, 14.14);
		UAV p = new UAV(15.15, 16.16);
		AgriculturalDrone q = new AgriculturalDrone(4.4, 4.4,"P", 3);
		Quadcopter r = new Quadcopter("", 6.6, 67, 5, 6, 7, 8);
		Multirotor s = new Multirotor("", 6.6, 67, 5, 6, 7, 9);
		Helicopter t = new Helicopter();
		AgriculturalDrone u = new AgriculturalDrone(4.4, 4.4,"P", 3);
		AgriculturalDrone v = new AgriculturalDrone(4.4, 4.4,"P", 3);
		Helicopter w = new Helicopter();
		Airplane x = new Airplane("TY", 2003333.3, 300000);
		Quadcopter y = new Quadcopter("", 6.6, 67, 5, 6, 7, 8);
		Multirotor z = new Multirotor("", 6.6, 67, 5, 6, 7, 9);
		Quadcopter a1 = new Quadcopter("", 6.6, 67, 5, 6, 7, 8);
		Multirotor b1 = new Multirotor("", 6.6, 67, 5, 6, 7, 9);
		
		//Stings 
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
		System.out.println(y.toString());
		System.out.println(x.toString());
		System.out.println(z.toString());
		System.out.println(a1.toString());
		System.out.println(b1.toString());
		
		//equals
		System.out.println("\n**Equals Methods**");
		System.out.println(a.equals(d));
		System.out.println(a.equals(o));
		System.out.println(g.equals(h));
		System.out.println(r.equals(a1));
		System.out.println(c.equals(t));
		
		//Arrays
		Object[] test = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, a1, b1};
		Object[] test1 = {a, c, d, e, f, q, r, s, t, u, v, w, x, y, z, a1, b1};
		Object[] test2 = {a, b, c, d, e, f, q, r, s, t, u, v, w, x, y, z, a1, b1};

		
		
		//least/most expensive
		System.out.println("\n**Finding Least and Most Expensive UAV**");
		System.out.println("\nTest 1:");
		System.out.println(findLeastAndMostExpensiveUAV(test));
		System.out.println("\nTest 2:");
		System.out.println(findLeastAndMostExpensiveUAV(test1));
		System.out.println("\nTest 3:");
		System.out.println(findLeastAndMostExpensiveUAV(test2));


	}
}

//DRIVER ii
// package driverPack;
// import Airplanes.*;
// import Helicopters.*;
// import DroneMAV.*;
// import Multirotors.*;
// import UAVs.*;

// public class driver {
// 	public static Object[] copyFlyingObjects(Object[] o) {
// 		Object[] newA = new Object[o.length];
// 		for(int i = 0; i < o.length; i++) {
// 			newA[i] = o[i];
// 		}
// 		return newA;
// 	}

// 	public static void main(String[] args) {
		
		
// 		Airplane a = new Airplane("TY", 2003333.3, 300000);
// 		UAV b = new UAV(99.99, 99.99);
// 		Helicopter c = new Helicopter();
// 		Airplane d = new Airplane("TY", 2003333.3, 300000);
// 		MAV e = new MAV();
// 		Airplane f = new Airplane("TY", 2003333.3, 300000);
// 		UAV g = new UAV(9.9, 9.9);
// 		UAV h = new UAV(9999.9999, 9999.9999);
// 		UAV i = new UAV(1.1, 2.2);
// 		UAV j = new UAV(3.3, 4.4);
// 		UAV k = new UAV(5.5, 6.6);
// 		UAV l = new UAV(7.7, 8.8);
// 		UAV m = new UAV(9.9, 10.10);
// 		UAV n = new UAV(11.11, 12.12);
// 		UAV o = new UAV(13.13, 14.14);
// 		UAV p = new UAV(15.15, 16.16);
// 		AgriculturalDrone q = new AgriculturalDrone(4.4, 4.4,"P", 3);
// 		Quadcopter r = new Quadcopter("", 6.6, 67, 5, 6, 7, 8);
// 		Multirotor s = new Multirotor("", 6.6, 67, 5, 6, 7, 9);
// 		Helicopter t = new Helicopter();
// 		AgriculturalDrone u = new AgriculturalDrone(4.4, 4.4,"P", 3);
// 		AgriculturalDrone v = new AgriculturalDrone(4.4, 4.4,"P", 3);
// 		Helicopter w = new Helicopter();
// 		Airplane x = new Airplane("TY", 2003333.3, 300000);
// 		Quadcopter y = new Quadcopter("", 6.6, 67, 5, 6, 7, 8);
// 		Multirotor z = new Multirotor("", 6.6, 67, 5, 6, 7, 9);
// 		Quadcopter a1 = new Quadcopter("", 6.6, 67, 5, 6, 7, 8);
// 		Multirotor b1 = new Multirotor("", 6.6, 67, 5, 6, 7, 9);
		
// 		//Arrays
// 		Object[] test = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, a1, b1};
// 		Object[] test1 = {a, c, d, e, f, q, r, s, t, u, v, w, x, y, z, a1, b1};
// 		Object[] test2 = {a, b, c, d, e, f, q, r, s, t, u, v, w, x, y, z, a1, b1};

// 		//Copy flying object array
// 		Object[] newOne = copyFlyingObjects(test);
// 		System.out.println(newOne.length);
// 		for(int aa = 0; aa < newOne.length; aa++) {
// 			System.out.println(newOne[aa].toString());
// 		}
// 		Object[] newOne2 = copyFlyingObjects(test1);
// 		System.out.println(newOne2.length);
// 		for(int bb= 0; bb < newOne2.length; bb++) {
// 			System.out.println(newOne2[bb].toString());
// 		}
// 		Object[] newOne3 = copyFlyingObjects(test2);
// 		System.out.println(newOne3.length);
// 		for(int cc = 0; cc < newOne3.length; cc++) {
// 			System.out.println(newOne3[cc].toString());
// 		}
// 	}
// }
