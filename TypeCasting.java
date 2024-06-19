package javaprograms;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=234;
        double num2=234.43;
        double sum=(double)(num1+num2); //Widening of typecasting
        System.out.println(sum);
        int res=(int)(num1+num2);//Narrowing of typecasting
        System.out.println(res);
        double d2=num1;//Implicitly converting from int to double
        int i1=(int)num2;//Explicit typecasting
        System.out.println(i1);
        System.out.println(d2);
        
	}

}
