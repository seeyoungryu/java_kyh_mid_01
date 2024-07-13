package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {
        //1. 다형적 참조의 특성*
        //  매개변수로 Object 타입 obj 객체를 받는 메서드이므로 car, dog 등 모든 객체 다 받을 수 있음
        //2. 메서드 오버라이딩*
        //  Object 는 모든 클래스의 부모임 -> Dog, Car 등의 구체적인 클래스는 Object 가 가지고 있는 메서드 (toString 등)를 오버라이딩 할 수 있음
        //  -> 추상적인 타입에 의존하면서 런타임에(프로그램 실행할 때) 각 인스턴스의 toStirng() 을 호출할 수 있음
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }

    /* static
    자바에서 static 키워드는 특정 메서드나 변수를 클래스의 인스턴스가 아닌 클래스 자체에 속하게 합니다.
    즉, 클래스의 객체를 생성하지 않고도 해당 메서드를 사용할 수 있다는 의미입니다.
     */


}
