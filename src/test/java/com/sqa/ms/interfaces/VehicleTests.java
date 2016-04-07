/**
 *   File Name: VehicleTests.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.ms.interfaces;

import org.junit.*;

import com.sqa.ms.Interfaces.*;

/**
 * VehicleTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class VehicleTests {
	@Test
	public void test() {
		iVehicle[] vehicles = { new Boat(), new Car(), new Train(), new Plane(), new Boat("Master Cruiser", 0.45),
				new Car("SpikyCar"), new Train("Thomas"), new Plane("jetZ45"), new Boat("test Boat", 0.75),
				new Car("test Car"), new Train("test Train"), new Plane("test Plane") };

		System.out.println("my vehicles");
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(" vehicle " + (i + 1) + ":" + vehicles[i]);
			vehicles[i].moveVehicle();

		}
		// for (iVehicle vehicle : vehicles){
		//
		// }
	}

}
