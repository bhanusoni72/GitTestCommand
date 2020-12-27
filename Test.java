import java.util.Scanner;
class Test{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you are hungry or not in true or false");
		boolean hungry=sc.nextBoolean();
		if(hungry){
			System.out.println("i am hungry");		
			System.out.println("Eat Samosa");
		}
		else{
			System.out.println("i am not hungry");
			System.out.println("Do your home work");
		}
	}
}