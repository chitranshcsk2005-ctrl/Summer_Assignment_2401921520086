interface test {
    int square(int n);
}

class Arithmetic implements test {

    public int square(int n) {
        return n * n;
    }
}

public class ToTestInt {
    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();

        int num = 8;
        System.out.println("Number = " + num);
        System.out.println("Square = " + obj.square(num));
    }
}
