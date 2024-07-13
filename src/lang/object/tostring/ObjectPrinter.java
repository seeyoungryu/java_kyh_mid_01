package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }

    /* static
    자바에서 static 키워드는 특정 메서드나 변수를 클래스의 인스턴스가 아닌 클래스 자체에 속하게 합니다.
    즉, 클래스의 객체를 생성하지 않고도 해당 메서드를 사용할 수 있다는 의미입니다.
     */


}
