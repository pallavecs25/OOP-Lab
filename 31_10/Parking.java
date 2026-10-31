interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String number, String type, int hours) {
        this.vehicleNumber = number;
        this.vehicleType = type;
        this.parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    double charge;

    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    @Override
    public void calculateCharge() {
        if (parkingHours <= 2) {
            charge = parkingHours * 20;
        } else {
            charge = (2 * 20) + (parkingHours - 2) * 10;
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: Rs. " + charge);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    double charge;

    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    @Override
    public void calculateCharge() {
        if (parkingHours <= 2) {
            charge = parkingHours * 50;
        } else {
            charge = (2 * 50) + (parkingHours - 2) * 30;
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: Rs. " + charge);
    }
}

public class Parking {
    public static void main(String[] args) {
        ParkingCharge p;

        p = new TwoWheeler("KA01AB1234", 4);
        p.calculateCharge();
        p.displayParkingDetails();

        System.out.println();

        p = new FourWheeler("KA03CD5678", 5);
        p.calculateCharge();
        p.displayParkingDetails();
    }
}
