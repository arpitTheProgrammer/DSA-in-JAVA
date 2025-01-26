public class opps {

    // Creating a new data type
    public static class Students{
        String name;
        int RollNo;
        double precentage;
    }

    public static class  Car{
        String name;
        double milage;
        String color;
        int prize;
    }
    public static void main(String[] args) {
        Students students = new Students(); // Creating a box in which we store data
        students.name = "Arpit";
        students.RollNo = 12;
        students.precentage = 64.4;
        System.out.println (students.name);
        System.out.println (students.RollNo); 
        System.out.println (students.precentage);

        Students s = new Students();
        s.name = "Saksham";
        s.RollNo = 23;
        s.precentage = 53.3;
        System.out.println(s.name);
        System.out.println(s.RollNo);
        System.out.println(s.precentage);

        Car c1 = new Car();
        c1.name = "Belano";
        c1.milage = 35.5;
        c1.color= "Gray"; 
        c1.prize = 900000;
        System.out.println(c1.name + " " + c1.milage + " " + c1.color + " " + c1.prize+"Rs");
        c1.name = "Scorpio";
        c1.milage = 30.5;
        c1.color= "White"; 
        c1.prize = 2100000;
        System.out.println(c1.name + " " + c1.milage + " " + c1.color + " " + c1.prize+"Rs");
    } 
}
