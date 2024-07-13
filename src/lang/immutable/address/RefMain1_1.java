package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        /*
        참조형 변수는 하나의 인스턴스를 공유할 수 있다. (참조형 변수들은 같은 참조값을 통해 같은 인스턴스를 참조할 수 있다)

        이유: 자바에서 모든 값 대입은 변소가 가지고 있는 값을 복사해서 전달함
            ㄴ 변수가 int 같은 숫자값을 가지고 있으면 숫자값을 복사해서 전달하고,
            참조값을 가지고 있으면 참조값을 복사해서 전달한다.
             ㄴ참조값을 복사해서 전달하므로 결과적으로 a,b 는 같은 인스턴스(객체)  를 참조한다.

         */


        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // -> bd의 주소만 부산으로 변경했는데, a의 주소도 함께 부산으로 변경됨
    }
}
