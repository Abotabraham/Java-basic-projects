package ClassesAndObjects_OOP.car_dealership;

public class Employee {









    public void handleCustomer (Customer customer, boolean finance, Vehicle vehicle){
     if (finance == true){

         double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
         runCreditHistory (customer, loanAmount);


     } else if (vehicle.getPrice() <= customer.getCashOnHand()){

         processTransaction (customer,  vehicle);


     } else {
         System.out.println("The customer will need more money to purchase the " + vehicle.toString());
     }
    }

    public void runCreditHistory(Customer customer, double loanAmount) {
         System.out.println("Run credit history for the customer....");

         System.out.println ("The customer has been approved to purchased the vehicle!");
    }
    public void processTransaction (Customer customer, Vehicle vehicle){
        System.out.println("The customer has purchased the vehicle " + vehicle + " at the price " + vehicle.getPrice());
    }
}
