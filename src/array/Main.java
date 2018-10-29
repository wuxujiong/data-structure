package array;

/**
 * Created by DELL on 2018/10/19.
 */
public class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for (int i=0;i<10;i++){
            arr.addLast(i);
        }

        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

//        arr.remove(2);
//        System.out.println(arr);
    }
}
