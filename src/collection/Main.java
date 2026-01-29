package collection;

public class Main {
    public static void main(String[] args) {

        MyListNikhil list = new MyListNikhil();

        for (int i = 1; i <= 32; i++) {
            list.add(i);
        }

        list.printArray();

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(100);
//
//        list.get(1);
//
//        list.remove(100);
//
//        list.set(1, 100);
    }
}
