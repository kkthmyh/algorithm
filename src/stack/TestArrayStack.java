package stack;

/**
 * 测试栈
 *
 * @Author kkthmyh
 * @Date 2021/6/7 15:34
 * @Version 1.0
 * @Description
 */
public class TestArrayStack {

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayStack.push(i);
        }
        System.out.println(arrayStack.toString());

        Integer pop1 = arrayStack.pop();
        System.out.println(pop1);
        System.out.println(arrayStack.toString());
        Integer pop2 = arrayStack.pop();
        System.out.println(pop2);
        System.out.println(arrayStack.toString());


        int capacity = arrayStack.getCapacity();
        System.out.println(capacity);

        int size = arrayStack.getSize();
        System.out.println(size);

        boolean empty = arrayStack.isEmpty();
        System.out.println(empty);

    }
}
