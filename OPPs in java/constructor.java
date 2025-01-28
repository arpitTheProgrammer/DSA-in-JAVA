public class constructor {
    public static class Students{
        String name;
        int RollNo;
        double percentage;
    public Students(String naam, int roll, double per){
        name = naam;
        RollNo = roll;
        percentage = per;
    }
}
    public static void main(String[] args) {
        Students students = new Students("Arpit", 32, 89.76);
        System.out.println(students.name);
        System.out.println(students.RollNo);
        System.out.println(students.percentage);
        Students students2 = new Students("Aman", 23, 56.43);
        System.out.println(students2.name);
        System.out.println(students2.RollNo);
        System.out.println(students2.percentage);
    }
}
    

