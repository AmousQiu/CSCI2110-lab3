import java.util.ArrayList;

public class GenericQueue<T> {
    private ArrayList<T> queue;
    int cursor;

    public GenericQueue() {
        queue = new ArrayList<>();
    }
    public void enqueue(T item) {
        queue.add(item);
    }
    public T getItem(int position){
        return  queue.get(position);
    }

    public T dequeue() {
        T item = queue.get(0);
        queue.remove(0);
        return item;
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void clear() {
        queue.clear();
    }

    public T peek() {
        return queue.get(queue.size()-1);
    }

    public int positionOf(T item) {
        for (int i = 0; i < queue.size(); i++) {
            if (item.equals(queue.get(i))) {
                return i;
            }
        }
        return 1;
    }
    public void remove(T item){
        queue.remove(item);
    }
    public void remove(int position){
        queue.remove(position);
    }

    public T first(){
        if(!queue.isEmpty()) {
            return queue.get(0);
        }
        return null;
    }
    public T next(){
        if(queue.size()>=2){
            return queue.get(1);
        }
        return null;
    }
}
