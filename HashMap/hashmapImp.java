import java.util.HashMap;
import java.util.LinkedList;

public class hashmapImp {
    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }            
        }
        private int n; 
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for(var buck : oldBuckets){
                for(var node : buck){
                    put(node.key, node.value);
                }
            }
        }
        public int capacity(){
            return buckets.length;
        }
        public int size(){
            //Return the number of entrys
            return n;
        }


        private int HashFunc(K key){
            int hc = key.hashCode(); // HashCode naam ka function hota hai java main
            return (Math.abs(hc)) % buckets.length; // extract key and return
        }

        private int searchInBucket(LinkedList<Node> ll,K key){
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }


        public void put(K key, V value){
            //Insertion or updation
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];
            int ei = searchInBucket(currBuckets, key);
            if(ei == -1){ // Enter new Node if Key doesn't exists
                Node node = new Node(key, value);
                currBuckets.add(node);
                n++;
            } else{ //Update if Key exist
                Node currNode = currBuckets.get(ei);
                currNode.value = value;
            }

            if(n >= buckets.length * LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];
            int ei = searchInBucket(currBuckets, key);
            if(ei != -1){
                Node currNode = currBuckets.get(ei);
                return currNode.value;
            } 
                return null;
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];
            int ei = searchInBucket(currBuckets, key);
            if(ei != -1){
                Node currNode = currBuckets.get(ei);
                V val = currNode.value;
                currBuckets.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }
 public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("India", 120);
        map.put("US", 150);
        // map.put("China", 130);
        System.out.println("Size of Map is :- " + map.size());
        // map.put("China", 79);
        System.out.println("Size of Map is :- " + map.size());
        System.out.println(map.get("India"));
        System.out.println(map.get("US"));
        System.out.println(map.get("China"));
        System.out.println(map.get("Russia"));
        map.remove("China");
        System.out.println(map.size());
        System.out.println("CAPACITY:- " + map.capacity());
        map.put("Japan", 121);
        System.out.println("CAPACITY:- " + map.capacity());

 }   
}
