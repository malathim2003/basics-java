class Vehicle {
    String make;
    String model;
    int year;
    double price;

    Vehicle (String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: $" + price);
    }

    double calculateDepreciation(int currentYear) {
        int age = currentYear - year;
        return price - (age * 1000); 
    }
}

// Main class to test the Car class
public class Main {
    public static void main(String[] args) {
        
        Vehicle my Vehicle = new  Vehicle ("Toyota", "Camry", 2020, 30000);
        my Vehicle.displayDetails();
        double depreciationValue = my Vehicle.calculateDepreciation(2025);
        System.out.println("Depreciation Value: $" + depreciationValue);
    }
}


