package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        //date1=x001, date2=x001
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);  //year
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date1);

/*
    참고 : withXxx()
    불변 객체에서 값을 변경하는 경우 관례처럼 사용함
     - 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 의미

        public ImmutableMyDate withYear(int newYear) {        //newYear로 받기 (변경 위함)
            return new ImmutableMyDate(newYear, month, day);
        }

 */

        System.out.println("2025 - > date1");
        //date1.setYear(2025);
        date1 = date1.withYear(2025); ////date1=x002, date2=x001         //newYear
        System.out.println("date1 = " + date1); //x002
        System.out.println("date2 = " + date2); //x001
    }
}
