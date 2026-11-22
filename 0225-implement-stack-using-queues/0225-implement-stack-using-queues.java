
import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    // Push operation
    public void push(int x) {

        q.add(x);

        int size = q.size();

        // Rotate previous elements
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    // Pop operation
    public int pop() {
        return q.remove();
    }

    // Top operation
    public int top() {
        return q.peek();
    }

    // Empty operation
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */