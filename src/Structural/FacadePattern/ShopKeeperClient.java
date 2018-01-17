package Structural.FacadePattern;
/**
 * Event Manager Food,Invitations,Music,games,Decoration
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Facade hides who you are talking to whereas proxy hides the location of the callee
public class ShopKeeperClient {
public static void main(String[] args) {
	System.out.print("            1. IPHONE.              \n");  
    System.out.print("            2. SAMSUNG.              \n");  
    System.out.print("Enter your choice: ");  
    int choice=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    try {
		choice=Integer.parseInt(br.readLine());
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
    ShopKeeper sk=new ShopKeeper(); 
    switch (choice) {
	case 1:
		sk.getAppleDetails();
		break;
	case 2:
		sk.getSamsungDetails();
		break;
	default :
		break;
	}
}
}
