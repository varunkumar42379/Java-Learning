class Calculator{
    public int add(int a,int b){
        return a+b ;
    }
}


class Advanced extends Calculator {

    public int subtract(int a,int b){
        return a - b ;

    }
}

public class Inheritence {
    public static void main(String[] args) {
        Advanced ac=new Advanced();

        System.out.println("Add:"  +ac.add(5,10));
        System.out.println("Subtract: "+ac.subtract(4,2));
    }
}


