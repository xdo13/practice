import java.util.Scanner;
//점수를 입력받고 그 평균을 구하는 프로그램
public class prac1 {
    //main 함수
    public static void main(String[] args) {
        //Scanner 클래스를 이용해 키보드로 입력받는 코드
        Scanner stdIn = new Scanner(System.in);
        //4개의 과목을 각각 키보드로 입력받는 구문 생성
        System.out.print("국어 점수를 입력하세요 : "); int a = stdIn.nextInt();
        System.out.print("수학 점수를 입력하세요 : "); int b = stdIn.nextInt();
        System.out.print("사회 점수를 입력하세요 : "); int c = stdIn.nextInt();
        System.out.print("과학 점수를 입력하세요 : "); int d = stdIn.nextInt();
        
        //0~100이 아닌 수가 입력되었을때 평균을 구하지않고 즉시 프로그램을 종료
        if ((a<0 || a >100) | (b<0 || b >100) | (c<0 || c >100) | (d<0 || d >100))
            System.out.println("잘못된 입력입니다. 다시 입력하세요");
            System.exit(0);


        //과목합계를 입력받는 sum을 double의 자료형으로 저장
        double sum = a+b+c+d;
        //printf문을 사용해 소수점 둘째자리에서 반올림하여 평균을 출력
        System.out.printf("입력하신 과목 점수의 평균은 : %2.1f",  (sum/4));
    }
}
