package task1;

public class Rotto {
    
    public static void main(String[] args) {
        RunRotto n1 = new RunRotto();
        System.out.println("이번주 로또 추첨 번호");
        for(int i = 1; i < 6; i++){
            System.out.print(i+"번째 : ");
            n1.Run();
        }

    }

}

class RunRotto{
    int[] num = new int[6];

    void Run(){
        for(int i=0; i < num.length; i++){
            num[i] = (int)(Math.random()*45+1);
    }
        for(int i = 0; i < num.length; i++) {
            for(int j = 0 ; j < i; j++){
                if(num[i]== num[j]){
                    num[i] = (int)(Math.random()*45+1);
                }

            }
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
}
}