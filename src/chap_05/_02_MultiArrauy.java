package chap_05;

public class _02_MultiArrauy {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열 위주)

        String[] setA = {"A1", "A2", "A3", "A4", "A5"};
        String[] setB = {"B1", "B2", "B3", "B4", "B5"};
        String[] setC = {"C1", "C2", "C3", "C4", "C5"};
        // 배열의 배열 필요

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        // 접근법
        System.out.println(seats[1][2]);

        String[][] seats2 = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        // System.out.println(seats2[0][3]); // 크기 초과로 에러 발생

        // 3차원 배열 만들기 (가로 x 세로 x 높이)
        String[][][] marray = new String[][][] {
                {{/*2차원 배열*/}, {}, {}},
                {{}, {}, {}},
                {{}, {}, {}},
        };
    }
}
