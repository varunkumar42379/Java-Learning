public class Main {
    public static void main(String[] args) {
        int[] numbers={1,2,3};

        try {
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught:" +e);
        }
        finally{
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues...");
        }
    }
