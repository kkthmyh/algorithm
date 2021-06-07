package array;

/**
 * @Author kkthmyh
 * @Date 2021/6/7 10:36
 * @Version 1.0
 * @Description
 */
public class Main {

    public static void main(String[] args) {
        Array<String> arr = new Array<String>(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i + "");
        }
        System.out.println(arr.toString());

        arr.add(1, "100");
        System.out.println(arr.toString());

        arr.addFirst("-1");
        System.out.println(arr.toString());

        arr.remove(2);
        System.out.println(arr.toString());

        arr.removeFirst();
        System.out.println(arr.toString());


        Array<Integer> arr2 = new Array<Integer>();
        for (int i = 0; i < 10; i++) {
            arr2.addLast(i);
        }
        System.out.println("=========================");
        System.out.println(arr2.toString());
        arr2.addLast(1000);
        System.out.println(arr2.toString());

    }
}
