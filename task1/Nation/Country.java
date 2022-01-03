package task1;

import java.security.Principal;

public class Country {

    public static void main(String[] args) {
        
    }

class nation{

    String nationname;
    int nationarea;
    int nationPop;

    void Changename(String nationname){
        this.nationname = nationname;
    }

    void Changearea(int nationarea){
        this.nationarea = nationarea;
    }

    void ChangePop(int nationPop){
        this.nationPop = nationPop;
    }
}

class nation1 extends nation{
    String armyname;

    void Changename(String armyname){
        this.armyname = armyname;
    }
}

class nation2 extends nation{
    boolean warState;

    void WarProclamation(boolean warState){
        this.warState = !warState;
    }
}

class nation3 extends nation{
    int GDP;
    
    void PrintGDP(){
    System.out.println("이 나라의 GDP는 "+GDP+"이다");
    }
}
   

}

class nation_3{
    private String nation_3Name;
    public int nation_3Area;
    public int nation_3Pop;

   static String planetname = "지구";
// public static String planetname = "지구";
}