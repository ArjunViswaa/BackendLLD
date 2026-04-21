import java.util.*;

public class Client {
    public static void main(String[] args) {
        // Collection: Container , Group of objects
        // List set queue
        // List : Ordered collection : insertion order
        // index : insert, search, random access
        // Duplicate elements allowed

        // array : dynamic / growable
        // random : O(1) : index But Not Thread safe
        List<String> list1 = new ArrayList<>();

        // random : O(N) - discontinuous memory & Not Thread safe
        // Implemented by default as a doubly linked list
        List<Integer> list2 = new LinkedList<>();

        // ArrayList + Synchronized thread safe
        // Do not use it in a single thread environment - not even in multi thread because of sync function
        List<Integer> list3 = new Vector<>();

        // Stack - LIFO - Legacy code and not recommended to use - Instead you can use linked list
        List<Integer> list4 = new Stack<>();

        // Set interface : no duplicate elements are allowed - Generally not ordered
        // Fast searching & NO order - TC = avg O(1)
        // Internally implemented using Hashmap
        Set<String> set1 = new HashSet<>();

        // Doubly LL + HashSet -- insertion Order + searching
        // TC - Avg O(1)
        Set<String> set2 = new LinkedHashSet<>();

        // Natural sorting order
        // TC - O(log2N)
        // Uses balanced BST -> Red black tree
        Set<Integer> set3 = new TreeSet<>();

        // Queue : DS to hold items before processing
        // Typical FIFO
        // Implemented by another interface Deque - Directly implemented by PQ
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(16);
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

//        while(pq.size() > 0){
//            System.out.println(pq.peek());
//            pq.poll();
//        }

        /*
        Deque
           Pronounced as 'Deck'
        A linear collection that supports element insertion and removal at both ends. The name deque is short
        for "double ended queue" and is usually pronounced "deck".
*/
        Deque<Integer> deque = new ArrayDeque<>();

//        LinkedList/**/
//        deque.
        Queue<Integer> queue = new LinkedList<>();

//        Map

        // Map : key, value
        Map<Integer,String> map = new HashMap<>();

        // DoublyLL (insertion ORder)+ HashSet(Searching)
        // insertion Order
//        T.C. avg O(1)
        Map<Integer,String> map2 = new LinkedHashMap<>();


        // Natural Sorting Order
//        T.C. O(log2n)
        // BBST : Balanced Binary Search Tree -> Red Black Tree
        Map<Integer,String> map3 = new TreeMap<>();


        Map<Integer,String> map4 = new Hashtable<>();

        List<Student> ll = new ArrayList<>();
//        Student st = new Student(25 , 65.0 , "Mohit" , 10.0);
//        System.out.println(st);
        ll.add(new Student(25 , 65.0 , "Mohit" , 10.0));
        ll.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        ll.add(new Student(28 , 20.0 , "Rohan" , 90.0));

        System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);

        Comparator<Student> c1 = (o1,o2)->{
            return (int)(o1.psp-o2.psp);
        };

//        Collections.sort(ll,new StudentPSPComparator());
//        Collections.sort(ll,c1);
        Collections.sort(ll,(o1,o2)->{
            return (int)(o1.psp-o2.psp);
        });
        System.out.println(ll);
    }
}
