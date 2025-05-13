import java.util.HashMap;
import java.util.LinkedList;


public class hashmapImplimatation {
    static class Node<K, V>{
        K key;
        V value;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    static class HashMap<K, V>{
    private int n;
    private int N;
    private LinkedList<Node> buckets[];

    // For Warnings
    @SuppressWarnings("unchecked")
    public HashMap() {
        this.N = 4;
        this.buckets = new LinkedList[4];
        for(int i =0 ; i < 4; i++){
            this.buckets[i] = new LinkedList<>();
        }
    }
    private int hashFunction(K key){
         int bi = key.hashCode();
         return Math.abs(bi) % N;
    }
    private int searchInLL(K key, int bi){
        LinkedList<Node> ll = buckets[bi];
        for(int i = 0; i <ll.size(); i++){
            if(ll.get(i).key == key){
                return i;
            }
        }
        return -1;
    }
    private void rehash(){
        LinkedList<Node> oldBucket[] = buckets;
        buckets = new LinkedList[N+2];
        for(int i = 0; i<N*2; i++){
            buckets[i] = new LinkedList<>();
        }
        for(int i = 0; i < oldBucket.length; i++){
            LinkedList<Node> ll = oldBucket[i];
            for(int j = 0; j<ll.size(); j++){
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value){
        int bi = hashFunction(key); // this will give bucket index
        int di = searchInLL(key, bi); // this will give data index if di = -1 key does'n exists

        if(di == -1) {
            buckets[bi].add(new Node(key, value));
            n++;
        } else {
            //Key Exists
            Node node = buckets[bi].get(di);
            node.value = value;
        }
        double lembda = (double)N/n;
        if(lembda > 2.0){
            // rehashing
            rehash();
        }
    }
}
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 150);
        map.put("China", 130);
        System.out.println(map);
    }
}
