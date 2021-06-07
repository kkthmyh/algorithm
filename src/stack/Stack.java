package stack;

/**
 * 栈的基本实现
 *
 * @Author kkthmyh
 * @Date 2021/6/7 14:56
 * @Version 1.0
 * @Description
 */
public interface Stack<E> {
    /**
     * 获取元素个数
     *
     * @return
     */
    int getSize();

    /**
     * 判断是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 向栈中压入数据
     *
     * @param e
     */
    void push(E e);

    /**
     * 出栈
     *
     * @return
     */
    E pop();

    /**
     * 获取栈顶数据
     *
     * @return
     */
    E peek();
}
