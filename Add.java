public class Add{
    public static void main(String[] args) {
        int a=4,b=2,sum,sub,div;
        sum=add(a,b);
        sub=subtraction(a,b);
        div=division(a,b);
        System.out.println("Addition of two numbers is : "+sum);
        System.out.println("Subtraction of two numbers is: "+sub);
        System.out.println("Division of numbers is: "+div);
	}
static int add( int x, int y){
	return x+y;
}
static int subtraction(int x,int y){
    return Math.abs(y-x);
    }
    static int division(int x,int y){
        return y/x;
    }
}