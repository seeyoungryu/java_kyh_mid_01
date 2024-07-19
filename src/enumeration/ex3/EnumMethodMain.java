package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //모든 ENUM 반환하는 방법 (enum을 사용하여 상수를 정의하고, 이를 순회하며, 문자열을 enum으로 변환하는 방법)
        //Grade 집합 만들어서 for-each 돌리기


        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal());
        }
        /*
        Grade.values()는 Grade 열거형 타입의 모든 상수를 배열로 반환합니다.
        Arrays.toString(values)는 배열을 문자열로 변환하여 출력합니다.
        예를 들어, [BRONZE, SILVER, GOLD, PLATINUM]와 같이 출력됩니다.

       -

       for-each 문을 사용하여 Grade 배열의 각 요소를 순회합니다.
       value.name()은 열거형 상수의 이름을 문자열로 반환합니다.
       value.ordinal()은 열거형 상수가 선언된 순서(0부터 시작하는 인덱스)를 반환합니다.
        예를 들어, name=BRONZE, ordinal=0와 같이 출력됩니다.
         */


        //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); //toString() 오버라이딩 가능
    }
}
