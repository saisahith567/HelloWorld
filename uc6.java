public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World! - uc6.java:4");
            return;
        }
        String names = "";
        for (String name : args) {
            if (name == null) {
                continue;
            }
            name = name.trim();
            if (name.isEmpty()) {
                continue;
            }
            names += name + ", ";
        }
        if (names.isEmpty()) {
            System.out.println("Hello, World! - uc6.java:19");
            return;
        }
        names = names.substring(0, names.length() - 2);
        System.out.println("Hello, - uc6.java:23" + names + "!");
    }
}
