import java.util.*;
public class LLpractice2 {

    static static class Node {
        String data;;
        Node next;
        Node(String data){
         this.data = data;
         this.next = null;   
        }
    }




    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // list.addFirst("Hayy");
        // list.addFirst("Hello");
        // System.out.print(list.size() + " ->  ");

        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(list.get(i) + " -> ");
        // }
        // System.out.print("null");

        // // list.removeFirst();
        // // System.out.print(list);

        // System.out.println(list.getFirst());

        list.add("BMW");
        list.add("AUDI");
        list.add("TATA");
        list.add("SUZUKI");

        Collections.sort(list);
        for(String i : list){
            System.out.println(i);
        }

            ArrayList<Integer> num = new ArrayList<Integer>();
            num.add(23);
            num.add(13);
            num.add(53);
            num.add(33);
            num.add(26);

            Collections.sort(num); // It will sort in arranging order
            Collections.sort(num, Collections.reverseOrder()); // Use to Arrange in Descending Order
            for(int i : num){
                System.out.println(i);
            }

    }
}
