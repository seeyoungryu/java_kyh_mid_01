package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {
        //문제 상황
        throw new MyCheckedException("ex");    //예외도 객체이기 때문에 new 로 생성하고 예외 발생시켜야함
    }
}
