public class value_referance {


    // Pass by reference
    static class Car {
        String name;
        float mileage;
        int cost;
    }
    
        
    
    public static void main(String[] args) {

        // Passs by referance
        Car a = new Car();
        a.name = "BMW";
        a.mileage = 5.5f;
        a.cost = 90;
        System.out.println(a.name);
        System.out.println(a.mileage);
        System.out.println(a.cost);
        Car b;
        b = a;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);


        b.name = "Tata";
        b.mileage = 6.5f;
        b.cost = 100;

        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        System.out.println(a.name);
        System.out.println(a.mileage); // It will give same Out put of b  
        System.out.println(a.cost);
        //One object may have many name



        // Pass by value


        // int a = 1000;
        // System.out.println(a);
        // int b;
        // b = a;
        // System.out.println(b);
        // b = 2000;
        // System.out.println(b);
        // System.out.println(a);

        // Value inside one variable can be assigned to Another
        // But change inside one variable doesn't effect other
    }    
}
