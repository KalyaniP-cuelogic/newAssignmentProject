public class Add{
    public static void main(String[] args) {
        int a=4,b=5,sum,mul,sub;
        sum=add(a,b);
        sub=subtraction(a,b);
        mul=multiplication(a,b);
        System.out.println("Addition of two numbers is : "+sum);
        System.out.println("Subtraction of two numbers is: "+sub);
        System.out.println("Multiplication of two nubmers is "+mul);
    }

static int add( int x, int y){
	return x+y;
}
static int subtraction(int x,int y){
    return Math.abs(y-x);
}

static int multiplication(int x,int y){
        return x*y;
}
}