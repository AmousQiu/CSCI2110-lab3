import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public int getSize() {
        return stack.size();
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public T pop() {
        T thing = this.peek();
        stack.remove(stack.size() - 1);
        return thing;
    }

    public void push(T thing) {
        stack.add(thing);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }


}
