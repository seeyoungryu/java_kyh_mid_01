package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        //obj.move(); //컴파일 오류, Object는 move()가 없다.

        //객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }

        /*
        타입 캐스팅 (Type Casting):

        obj는 Object 타입이기 때문에, 컴파일러는 obj가 sound()나 move() 메서드를 가지고 있다고 인식하지 않는다.
        instanceof 연산자를 사용하여 obj의 실제 타입을 확인하고, 해당 타입으로 안전하게 캐스팅한다.
         */

    }
}
