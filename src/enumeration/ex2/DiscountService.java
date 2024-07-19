package enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        /*
        각각의 참조값이 있음
        public static final ClassGrade BASIC = new ClassGrade(); //x001
        new 로 생성해버리면 다른 참조값을 가지게 되어 == 비교시 false 값이 나옴
                                                               */


        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
