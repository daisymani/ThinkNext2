package k.com.day2.package1;



public class StaticKeyword2 {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = StaticKeyword2.add(5, 7);
        System.out.println(result);  // Output: 12
    }
}
