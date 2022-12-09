package Assignment1;

class Vehicle {
	public void start() {
		System.out.println("Vehicle start()");
	};

	public void stop() {
		System.out.println("Vehicle stop()");
	}
}

class TwoWheeler extends Vehicle {
	@Override
	public void start() {
		System.out.println("TwoWheeler start()");
	};

	@Override
	public void stop() {
		System.out.println("TwoWheeler stop()");
	}
}

class FourWheeler extends Vehicle {
	@Override
	public void start() {
		System.out.println("FourWheeler start()");
	};

	@Override
	public void stop() {
		System.out.println("FourWheeler stop()");
	}
}

public class VehicleTest {

	public static void main(String[] args) {
		TwoWheeler twoWheeler = new TwoWheeler();
		FourWheeler fourWheeler = new FourWheeler();
		twoWheeler.start();
		twoWheeler.stop();
		fourWheeler.start();
		fourWheeler.stop();
	}

}
