public class Add{
    public static void main(String[] args) {
        int a=4,b=5,sum,mul;
        sum = a+b;
        System.out.println("Summation is" +" " +sum);
        mul=multiplication(a,b);
        System.out.println("Multiplication of two nubmers is "+mul);
    }

    static int multiplication(int x,int y){
        return x*y;
    }
}