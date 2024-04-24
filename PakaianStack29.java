public class PakaianStack29 {
    int size;
    int top;
    Pakaian29 data[];

    public PakaianStack29(int size) {
        this.size = size;
        data = new Pakaian29[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Pakaian29 pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public Pakaian29 pop() {
        if (!isEmpty()) {
            Pakaian29 x = data[top];
            top--;
            return x;
        } else {
            System.out.println("Stack masih kosong");
            return null;
        }
    }

    public Pakaian29 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack masih kosong");
            return null;
        }
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
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

    public Pakaian29 getMax() {
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
            return null;
        }

        Pakaian29 maxPakaian = data[0];
        for (int i = 1; i <= top; i++) {
            if (data[i].harga > maxPakaian.harga) {
                maxPakaian = data[i];
            }
        }
        return maxPakaian;
    }
}
