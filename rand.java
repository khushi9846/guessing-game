import java.util.*;
import java.util.Random;
public class rand{
	public static void main(String[] args){

	System.out.println("Do you want to play the guessing game?");
	System.out.println("If yes press 0 ,if no press 1");
	Scanner sc1 = new Scanner(System.in);
	int b = sc1.nextInt();
	

System.out.println("Here the system would guess a number");
	System.out.println("And the guessed number is ");
	//Math.random() generate from 0.0-1.0;
 	Random obj = new Random(); 
	//obj of class

	int no1= obj.nextInt(100);
	System.out.println(no1);

	

switch(b){
	case 0:
	int count=5;
	while(count!=0 ){
	 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no.");
	 int a=sc.nextInt();
	if(count >= 1){
	if(a == no1){
	 System.out.println("true");

	}
	else {
	System.out.println("your ans is wrong");

	count--;
	 }
	}
	else{
	System.out.println("You'r chances are over");
	}
	 }
	break;

case 1 :
	System.exit(1);
	break;
	}

}
}