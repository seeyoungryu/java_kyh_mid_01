package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id; //사용자 번호

    public UserV2(String id) {
        this.id = id;
    }

/*
    @Override
    public boolean equals(Object obj).idea/workspace.xml
   UserV2 user = (UserV2) obj;
        return id.equals(user.id);     //String 비교 -> equals() 써야함
    }


   (참고: UserV2 user = (UserV2) obj; -> obj 를 UserV2로 다운캐스팅)

*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserV2 userV2)) return false;
        return Objects.equals(id, userV2.id);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }


}
