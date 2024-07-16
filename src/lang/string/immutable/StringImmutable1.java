package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        String strTest =str.concat(" java"); //문자열 합치는 메서드
        System.out.println("str = " + strTest);
    }

//    public static void main(String[] args) {
//        String str = "hello";
//        str.concat(" java"); //문자열 합치는 메서드
//        System.out.println("str = " + str);
//    }


    /*
        String 클래스와 불변성
                String 클래스는 불변 객체의 대표적인 예입니다.
                String 객체가 한번 생성되면 그 내부의 문자열 값은 변경할 수 없습니다.
                이는 String 클래스의 모든 메서드가 새로운 문자열 객체를 반환하기 때문입니다.
     */
}
