package lang.immutable.change;

public class ImmutableObj {

    private final int value; //final 키워드 붙으면 setter 만들 수 없음

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
