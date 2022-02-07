package org.allvehicle;
import org.allvehicle.*;
import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
private void vehicleNecessery() {
	// TODO Auto-generated method stub
	System.out.println("Vehicle Information");
}
public static void main(String[] args) {
	Vehicle ve = new Vehicle();
	ve.vehicleNecessery();
	
	TwoWheeler tw =new TwoWheeler();
	tw.bike();
	tw.cycle();
	
	ThreeWheeler tr = new ThreeWheeler();
	tr.auto();
	
	FourWheeler f = new FourWheeler();
	f.bus();
	f.lorry();
	f.car();
}
}
