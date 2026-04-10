public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World! - uc7.java:4");
            return;
        }

        String names = String.join(", ", args);

        if (names.trim().isEmpty()) {
            System.out.println("Hello, World! - uc7.java:11");
            return;
        }

        System.out.println("Hello, - uc7.java:15" + names + "!");
    }
}
