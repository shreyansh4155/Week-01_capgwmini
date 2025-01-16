public class SplitWord {
    public static void main(String[] args) {
        String str = "Hello,world!How,are,you?";
        String[] parts = str.split(" ");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
