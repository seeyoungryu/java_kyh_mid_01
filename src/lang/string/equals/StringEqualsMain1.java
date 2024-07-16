package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2)); //인스턴스 비교 (동등성 비교 실패)
        System.out.println("new String() equals 비교:" + (str1.equals(str2)));  //value 값 비교 (동일성 비교 성공)

        String str3 = "hello"; //x003
        String str4 = "hello"; //x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));  //True -> String 안에 문자열(문자열 리터럴) 생성해놓음.. 문자열 Pool (공용 자원..)
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
