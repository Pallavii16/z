
public class LambdaHello {
    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Hello World");
        greeting.sayHello();
    }
}
