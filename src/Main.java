public class Main {
    public static void main(String[] args) {
        System.out.println("Hello \0 world!");
        some();
    }
    public static void some(){
        int a = 2;
        System.out.println(a);
    }
}