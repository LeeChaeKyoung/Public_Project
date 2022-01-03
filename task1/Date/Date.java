package task1;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Date {
 
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        
        System.out.println(day.format(today));

    }    
}
// 이거 솔직히 잘 모르겠습니다.
//현직자 친구랑 이러쿵저러쿵 하면서 여러가지 찾아봤는데 Date() 에 매개변수로 날짜 입력하면 되는거같았는데
//찾아보니 업데이트 되면서 이거 디프리케이트된거 같습니다. 이거 하나때문에 2시간 고민했는데 잘 모르겠습니다