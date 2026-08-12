public class Factorial{
	public static int calculate(int n){
		int f=1;
		for(int i=1;i<=n;i++) f*=i;
		return f;
    }
    public static void main(String[] args){
        Factorial f=new Factorial();
        int n=5, ans=f.calculate(n);
        System.out.println("Factorial progress");
        System.out.println("Factorial of "+n+" is "+ans);
    }
}
