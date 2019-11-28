import java.util.*;

class Car { private String make; 
    private String model; 
    private String regNo; 
    private int deposit; 
    private int rate;

    public Car(String newMake, String newModel, String newRegNo,
                    int newDeposit, int newRate) {
            make = newMake;
            model = newModel;
            regNo = newRegNo;
            deposit = newDeposit;
            rate = newRate;
    }

    public String getMake() {
            return make;
    }

    public String getModel() {
            return model;
    }

    public String getRegNo() {
            return regNo;
    }

    public int getDeposit() {
            return deposit;
    }

    public int getRate() {
            return rate;
    }

}

public class TestProject {
    public static void main(String args[]) {
    Queue<Car> cl = new LinkedList<Car>();
    cl.add(new Car("Toyota", "Altis", "AkN 460", 100, 60));
    cl.add(new Car("Toyota", "Vios", "AYG 214", 100, 50));
    cl.add(new Car("Nissan", "Latio", "AAA 111", 100, 50));
    cl.add(new Car("Murano", "Nissan", "ADA 222", 300, 150));

    cl.add(new Car("Honda", "Jazz", "AAA 444", 100, 60)); 
    cl.add(new Car("Honda", "Civic", "AAA 555", 120, 70)); 
    cl.add(new Car("Honda", "Stream", "AAA 666", 120, 70)); 
    cl.add(new Car("Honda", "Odyssey", "AAA 777", 200, 150)); 
    cl.add(new Car("Subaru", "WRX", "AAA 888", 300, 200));
    cl.add(new Car("Subaru", "Imprezza", "AAA 999", 150, 80));
    Scanner input = new Scanner(System.in);
    System.out.print("Enter model to rent: ");
    String model = input.nextLine();
    for(Car s : cl){
        if ( model.equals(s.getModel())) {
            System.out.println("Model " + model + " is available");
            System.out.print("Enter number of days: ");
            int days = input.nextInt();
            System.out.println("****Details****");
            int cost = (days * s.getRate()) + s.getDeposit();
            System.out.println("Deposit DailyRate Duration TotalCost"); 
            System.out.println(s.getDeposit() + " " + s.getRate()+ " " + days + " " + cost);
            System.out.print("Proceed to rent?( y/n ): ");
            String dec = input.next();
            if (dec.equals("y")) {
                System.out.println("Enter Customer Name: "); 
                String name = input.next(); 
                System.out.println("Enter CNIC Number: ");
                int num = input.nextInt();
                System.out.println("***Receipt****");
                System.out.println("Name CNIC No Car RegNo Duration TCost");
                System.out.println(name + " " + num + " " + model + " " + s.getRegNo() + " " + days + " "+cost);
                System.out.println("Serving Next Customer ");
                } 
                else if (dec.equals("n")) {
                    System.out.println("Serving Next Customer: ");
                    } 
                    }
                    }
                    } 
                    }