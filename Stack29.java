public class Stack29 {
    private int[] data;
    private int size;
    private int top;

    public Stack29(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    

    public void push(int dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang dikeluarkan dari stack: " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas stack: " + data[top]);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            top = -1;
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
