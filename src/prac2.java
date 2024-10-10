import java.util.Scanner;

class prac2 {         //최댓값 구하기
    static int max(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }


        public static void main (String[]args){
            Scanner stdIn = new Scanner(System.in);
            System.out.print("정수 a :");
            int a = stdIn.nextInt();
            System.out.print("정수 b :");
            int b = stdIn.nextInt();
            System.out.print("정수 c :");
            int c = stdIn.nextInt();
            System.out.println("입력한 수 중 최댓값은 " + max(a, b, c) + "입니다.");


        }
    }


