package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}


/*
System.identityHashCode(grade): 이 부분은 객체의 고유 식별자(해시 코드)를 반환합니다.
identityHashCode는 객체의 메모리 주소와 관련된 고유한 정수 값을 반환합니다.
이 값은 Object 클래스의 hashCode 메서드와 비슷하지만, 오버라이딩된 hashCode 메서드의 영향을 받지 않습니다.

Integer.toHexString(...): 이 부분은 정수 값을 16진수 문자열로 변환합니다. 예를 들어, 정수 값 255는 16진수로 "ff"가 됩니다.
 */
