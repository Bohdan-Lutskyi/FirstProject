package java8;

public class Lambdas {
    public static void main(String[] args) {
        //code has been write without lambdas
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        //code with lambdas
        Runnable runnable1 = ()-> System.out.println("hello");
        Runnable runnable2 = ()-> {
            System.out.println("hello");
            System.out.println("hello");
        };

    }
}
