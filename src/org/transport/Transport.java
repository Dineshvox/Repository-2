package org.transport;
import org.air.Air;
import org.road.Road;
import org.water.Water;
public class Transport {
	private void transportForm() {
		// TODO Auto-generated method stub
		System.out.println("Transport form details");
	}
		public static void main(String[] args) {
			Transport tr = new Transport();
			tr.transportForm();
			Road rd = new Road();
			rd.bike();
			rd.cycle();
			rd.car();
			rd.bus();
			Air ar = new Air();
			ar.aeroPlane();
			ar.heliCopter();
			 Water wa = new Water();
			 wa.boat();
			 wa.ship();
		}
}
