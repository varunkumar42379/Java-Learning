
class CalculatorPo{
    public int add(int a,int b) {
        return a + b;
    }

    public int add(int a,int b,int c){
         return a+b+c;
        }

}


class AdvancedPo extends CalculatorPo {

    public int subtract(int a,int b) {
        return a - b;
    }
    public int add(int a,int b){
            return a + b ;

    }
}

public class Polymorphism {
    public static void main(String[] args){
        AdvancedPo ac=new AdvancedPo();
        System.out .println("Add:" +ac.add(5,10));
        System.out .println("Add:" +ac.add(5,10,88));

    }
}



