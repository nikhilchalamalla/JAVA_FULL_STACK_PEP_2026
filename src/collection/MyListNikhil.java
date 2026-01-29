package collection;

public class MyListNikhil {

    int capacity = 8;
    int size = 0;
    int[] arr;

    public MyListNikhil() {
        arr = new int[capacity];
    }

    public void add(int value) {

        if(size == capacity) {
            resize();
        }

        arr[size++] = value;

    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];

        for(int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        System.out.println("Array resized to capacity: " + capacity);
    }

    public void printArray() {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println();
    }

}
