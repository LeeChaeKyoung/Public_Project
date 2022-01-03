package task1;

public class RCP {
    public static void main(String[] args) {
        RunRCP game = new RunRCP();
        game.RRR();
        
    }
    
}

class RunRCP{
    String[] ch = {"가위","바위","보"};

    int x = (int)(Math.random()*3);
    int y = (int)(Math.random()*3);
    String a = ch[x];
    String b = ch[y];

    void RRR(){
        System.out.println("A 측 : "+a);
        System.out.println("B 측 : "+b);
       if(x == 0){
           if( y== 0){
               System.out.println("비겼습니다");
           }else if( y == 1){
               System.out.println("B가 이겼습니다");
           }else{
               System.out.println("A가 이겼습니다");
           }
       }
       else if( x == 1){
        if( y== 0){
            System.out.println("A가 이겼습니다");
        }else if( y == 1){
            System.out.println("비겼습니다");
        }else{
            System.out.println("B가 이겼습니다");
        }
       }
       else{
        if( y== 0){
            System.out.println("B가 이겼습니다");
        }else if( y == 1){
            System.out.println("A가 이겼습니다");
        }else{
            System.out.println("비겼습니다");
       }


    }
}
}