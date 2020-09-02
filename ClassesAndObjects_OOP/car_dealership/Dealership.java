package ClassesAndObjects_OOP.car_dealership;

public class Dealership {
    public static void main(String[] args) {
     Customer customer = new Customer("Tom", "123 any St. ", 12000);
     Employee employee = new Employee();
     Vehicle vehicle = new Vehicle("Honda", "Accord", 15000, "Black");

     customer.purchaseCar(vehicle, employee, false);
    }
}
