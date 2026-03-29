package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외: 장학금 대상 아님

        // if문 이용 (여러 조건 또는 범위에 해당하는 조건)
        int ranking = 1; // 1등
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch-Case문 이용
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // case 외의 경우 실행
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2와 3을 통합 (명확한 case가 있는 경우)
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // break 없으면 다음으로 넘어감
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // case 외의 경우 실행
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");
    }
}
