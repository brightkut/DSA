package data_structure.array;

public class ArrayMain {
    public static void main(String[] args) {
        // Dynamic Array
        Array<String> stringArray = new Array<>(3);

        //add O(1) not shrink array size
        stringArray.add("A");
        stringArray.add("B");
        stringArray.add("C");
        stringArray.traverse();

        //add O(n) shrink array size
        stringArray.add("D");
        stringArray.add("E");
        stringArray.add("F");
        stringArray.traverse();

        //Size O(1)
        System.out.println(stringArray.size());

        //isEmpty O(1)
        System.out.println(stringArray.isEmpty());

        //Random Access (Get) O(1)
        System.out.println(stringArray.get(2));

        //Remove O(n) Fix size
        System.out.println(stringArray.remove("E"));
        System.out.println(stringArray.size());
        stringArray.traverse();

        //Search O(n)
        System.out.println(stringArray.contain("F"));
        System.out.println(stringArray.contain("E"));
    }
}
