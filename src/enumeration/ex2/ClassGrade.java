package enumeration.ex2;


 // < 타입 안정성 열거형 패턴 >
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자 명시 (기본생성자 없으므로 .. 결국 이 클래스 객체 생성 못하게 됨)
    private ClassGrade() {}


}
