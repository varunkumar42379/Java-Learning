public class ArmstrongAn {
    public static void main(String[] args) {
        int num=1324,sum=0,temp=num;
        while (temp != 0){
            int digit=temp % 10;
            sum +=Math.pow(digit,4);
            temp /=10;
        }
        System.out.println(num==sum);

    }
}
