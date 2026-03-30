package chap_06;

public class _01_Method {
    // 메소드 정의
    public static int power(int number) {
        int result = number * number;
        return result;
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println(power(2));
    }
}
