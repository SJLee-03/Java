package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 15;

        if (hour < 14) System.out.println("아이스 아메리카노 +1");

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        hour = 10;
        boolean morningCoffee = false; // 모닝 커피
        // if (hour < 14 && morningCoffe == false) {
        if (hour < 14 && !morningCoffee){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");
    }
}
