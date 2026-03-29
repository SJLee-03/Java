package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간

        // 배열 선언 첫 번째 방법
        //String[] coffees = new String[4];

        // 배열 선언 두 번째 방법
        //String coffees[] = new String[4];
        //coffees[0] = "아메리카노"; // 0부터 시작
        //coffees[1] = "카페모카";
        //coffees[2] = "라떼";
        //coffees[3] = "카푸치노";

        // 세번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = {1.2, 1.4, 4};
        boolean[] b = {true, false, true};
    }
}
