package Stack_Queue.Stack;

public class MyStack {
    private int[] arr;
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

//    Chèn phần tử mới vào stack
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

//    Xoá phần tử khỏi stack
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

//    Trả về số phần tử hiện tại của stack
    public int size() {
        return index;
    }

//    Kiểm tra xem stack có rỗng không
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

//    Kiểm tra stack có đầy không
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
