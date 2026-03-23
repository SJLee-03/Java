package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int score = 93 + 98.8; 에러발생 정수형 변수에 실수형 값을 대입하려 했기 때문d

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((double)score); // 93.0
        System.out.println((double)score); // 93.0

        // float double to int
        float score_f = 93.3F;
        double score_d = 98.3;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = (double)93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0 자동형변환
        // int -> long -> float -> double (자동형변환)

        int convertedScoreInt = (int)score_d; //191.8 -> 191
        // double -> float -> long -> int (수동형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // String 클래스가 제공하는 valueOf 매서드를 이용하여 정수를 문자열로 바꿈
        s1 = Integer.toString(93); // Integer 클래스가 제공하는 toString 매서드를 이용하여 정수를 문자열로 바꿈
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // 반드시 매서드 안에 들어가는 값의 자료형은 맞아야한다.
    }
}
