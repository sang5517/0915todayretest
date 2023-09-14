package Exam2.java;

public class Exam2 {
    public static void main(String[] args) {

        // 함수를 사용하거나 Scanner를 사용해서 별그리는 코드를 중복없이 한번만 사용했으면 모두 정답 인정(만점)
        // 별 그리기는 다 그렸으나 코드가 중복된 경우는 -5
        // 별 그리기는 다 그렸으나 반복문을 사용하지 않고 하드 코딩했으면 -5
        // 별을 그리지 못했다면 -5
        // 아무것도 적지 않았으면 -5


        // 높이를 입력해주세요 : 3                // 출력

        /*

         *

         ***

         *****

         */
        printstar(3);
        // 높이를 입력해주세요 : 5

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이를 입력해주세요 : 7

        // 출력
        printstar(5);
        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */
        printstar(7);

    }

    public static void printstar(int idx)
    {
        int line = 0;
        for(int i = 1; i <= idx; i++)
        {
            for(int j = 1; j <= idx * 2; j++)
            {
                line = idx - i;
                if(line < j && j < (idx*2) - line)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}