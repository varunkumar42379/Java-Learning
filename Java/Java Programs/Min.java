class Min1 {
    public static void main(String[] args) {

        AdvanceCalculator ac=new AdvanceCalculator();

        System.out.println(ac.mul(1,2));
    }

}


class Calculator{

    // Overloading
//    public  int add(int a,int b,int c){
//        return a+b+c;
//    }

    public int add(int a,int b){
        return a+b;
    }

    public  int sub(int a,int b){
        return a-b;

    }

    public int mul(int a,int b){
        return a*b;
    }
}

class AdvanceCalculator extends Calculator{

    @Override
    public int mul(int a,int b) {
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
