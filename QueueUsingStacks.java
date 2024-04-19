class Stack {
    private int[] arr;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow.");
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow.");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class QueueUsingStacks {
    private Stack stack1;
    private Stack stack2;
    private int maxSize;

    public QueueUsingStacks(int size) {
        maxSize = size;
        stack1 = new Stack(maxSize);
        stack2 = new Stack(maxSize);
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {

    }
}

