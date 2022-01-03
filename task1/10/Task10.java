package task1;

//  만들다가 막힌것 저장

public class Task10 {
    public static void main(String[] args) {
        soccer game = new soccer();
        game.gamerun();
        
    }
}

class soccer{
    String[] ch = {"가위","바위","보"};
    human1 human1 = new human1();
    human2 human2 = new human2();
    

    void gamerun(){
        human1.setTeam1();
        human2.setTeam2();

    }
}

class team1 extends soccer{

}
// 팀1에 있는 사람
class human1 extends team1{

    int x = (int)(Math.random()*3);
    String a = ch[x];

    void setTeam1(){
        System.out.println("A 측 : "+ a);
    }
    
}

class team2 extends soccer{

}
// 팀 2에 있는 사람
class human2 extends team2{

    int x = (int)(Math.random()*3);
    String b = ch[x];

    void setTeam2(){
        System.out.println("B 측 : "+ b);
    }
}

