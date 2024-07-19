package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3; //바깥 클래스의 클래스 멤버
    private int outInstanceValue = 2;  //바깥 클래스의 인스턴스 멤버

    /* outInstanceValue 가 인스턴스 멤버인 이유
       1. static 키워드가 없음
       2. 인스턴스를 생성하지 않으면 이 변수에 접금할 수 없음(클래스의 각 인스턴스마다 개별적으로 존재)
       - outInstanceValue는 static 키워드가 없기 때문에 클래스 멤버가 아닌 인스턴스 멤버입니다.
       - 이 변수는 NestedOuter 클래스의 인스턴스가 생성될 때마다 각각의 인스턴스에 대해 별도로 존재합니다.
     */


    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없다.
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
