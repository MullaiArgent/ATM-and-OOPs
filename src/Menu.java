import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Menu extends Accounts{

	public void getlogin() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
		Scanner menuinput = new Scanner(System.in);
		HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

		try {
			data.put(987654, 2345);
			data.put(987653, 5432);
			
			System.out.println("Welcome to our Bank");
			audio_notify("src\\welcme.wav");
			System.out.println("Enter your Customer NUmber");
			SetCustomerNumber(menuinput.nextInt());
			System.out.println("Enter your Pin NUmber");
			SetPinNumber(menuinput.nextInt());
		}catch(Exception e) {
			System.out.println("Invalid Entry");
			getlogin();
		}
		int cn = GetCustomerNumber();
		int pn = GetPinNumber();
		
		if(data.containsKey(cn) && data.get(cn) == pn) {
			getAccountType();
		}else {
			System.out.println("Invalid Entry");
			audio_notify("src\\pswr_incrt.wav");
			getlogin();
		}
		
	}public void getAccountType() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
		Scanner menuinput = new Scanner(System.in);
		System.out.println("Select the account type");
		System.out.println("Press-1 for 'Current Account'");
		System.out.println("Press-2 for 'Saving Account' ");
		System.out.println("Press-3 to Exit");
		int selection = menuinput.nextInt();
		
		switch(selection) {
		case 1: getCurrent(); break;
		case 2: getSaving(); break;
		case 3: System.out.println("Betterluck nxt time"); break;
		default: System.out.println("Invalid Entry"); getAccountType();
		}
	}public void getCurrent() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
		Scanner menuinput = new Scanner(System.in);
		System.out.println("Select your Action");
		System.out.println("Press-1 to 'View Balance'   ");
		System.out.println("Press-2 to 'Withdraw funds' ");
		System.out.println("Press-3 to 'Deposit funds'  ");
		System.out.println("Press-4 to Exit");
		int selection = menuinput.nextInt();
		switch(selection) {
		case 1: 
			getCurrentviewbalance(); 
			getCurrent();
			break;
		case 2:
			System.out.println("Enter the amt to withdraw");
			double amtw = menuinput.nextDouble();
			getCurrentwithdrawfunds(amtw); 
			getCurrent();
			break;
		case 3: 
			System.out.println("Enter the amt to Deposite");
			double amtd = menuinput.nextDouble();
			getCurrentdepositfunds(amtd);
			getCurrent();
			break;
		case 4:
			System.out.println("Betterluck nxt time");
			audio_notify("src\\tq.wav");
			break;
		default: System.out.println("Invalid Entry"); getCurrent();
		}
	}public void getSaving() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
		Scanner menuinput = new Scanner(System.in);
		System.out.println("Select your Action");
		System.out.println("Press-1 to 'View Balance'   ");
		System.out.println("Press-2 to 'Withdraw funds' ");
		System.out.println("Press-3 to 'Deposit funds'  ");
		System.out.println("Press-4 to Exit");
		int selection = menuinput.nextInt();
		switch(selection) {
		case 1:
			getSavingviewbalance();
			getSaving();
			break;
		case 2:
			System.out.println("Enter the amt to withdraw");
			double amtw = menuinput.nextDouble();
			getSavingwithdrawfunds(amtw);
			getSaving();
			break;
		case 3:
			System.out.println("Enter the amt to Deposite");
			double amtd = menuinput.nextDouble();
			getSavingdepositfunds(amtd);
			getSaving();
			break;
		case 4:
			System.out.println("Thank You");
			audio_notify("src\\tq.wav");
			break;
		default: System.out.println("Invalid Entry"); getSaving();
		}
	}

}
