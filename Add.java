public class Add{
    public static void main(String[] args) {
        int a=4,b=5,sum,sub;
        sum=add(a,b);
        sub=subtraction(a,b);
        System.out.println("Addition of two numbers is : "+sum);
        System.out.println("Subtraction of two numbers is: "+sub);
	}
static int add( int x, int y){
	return x+y;
}
static int subtraction(int x,int y){
    return y-x;
    }
}