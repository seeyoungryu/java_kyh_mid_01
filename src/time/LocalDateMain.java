package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜=" + nowDate);
        System.out.println("지정 날짜=" + ofDate);

            //계산(불변) -> 모든 날짜 클래스는 불변이므로, 변경이 발생하는 경우에는 새로운 객체를 생성해서 반환함, 그래서 반환값 꼭 받아야함
            ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d = " + ofDate);
    }
}

// now() : 현재 시간을 기준으로 생성
// of(..) : 특정 날짜를 기준으로 생성