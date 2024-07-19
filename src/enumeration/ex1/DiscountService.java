package enumeration.ex1;

public class DiscountService {

    //StringGrade를 참고하세요.
    // public static final String BASIC = "BASIC"; -> BASIC 이 static 으로 선언되어있기 때문에 객체 생성 없이도 다른 클래스에서 클래스명.으로 접근 가능함


    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }

        return price * discountPercent / 100;
    }
}
