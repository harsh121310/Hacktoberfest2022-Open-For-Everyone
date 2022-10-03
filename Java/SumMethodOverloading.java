public class SumMethodOverloading {

    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    int add(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static void main(String[] args) {

        SumMethodOverloading obj = new SumMethodOverloading();

        int sum = obj.add(10, 20);

        System.out.println("The Sum of Two Numbers   = " + sum);

        System.out.println("The Sum of Three Numbers = " + obj.add(10, 20, 40));

        System.out.println("The Sum of Four Numbers  = " + obj.add(15, 25, 49, 66));

        System.out.println("The Sum of Five Numbers  = " + obj.add(11, 19, 16, 72, 66));

    }

}
