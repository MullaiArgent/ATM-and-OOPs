import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Accounts extends dummy {

	private Integer customernumber;
	private Integer pinnumber;
	private Double CurrentBalance = 0.0;
	private Double SavingBalance = 0.0;
	
	public void SetCustomerNumber(Integer  customernumber) {
		this.customernumber  = customernumber;
	}
	public void SetPinNumber(Integer pinnumber) {
		this.pinnumber = pinnumber;
	}
	public int GetCustomerNumber() {
		return customernumber;
	}
	public int GetPinNumber() {
		return pinnumber;
	}
	public void getCurrentviewbalance() {
		System.out.println(CurrentBalance);
	}
	public void getSavingviewbalance() {
		System.out.println(SavingBalance);
	}
	public void getCurrentwithdrawfunds(double amt) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
		if (CurrentBalance >= amt) {
			CurrentBalance -= amt;
			System.out.println(CurrentBalance);
			audio_notify("src\\wthdrwl_sussfl.wav");
		}else {
			System.out.print("Funds Insufficient");
			audio_notify("src\\insuf_bal.wav");
		}
		
	}public void getCurrentdepositfunds(double amt) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
		CurrentBalance += amt;
		System.out.println(CurrentBalance);
		audio_notify("src\\sudfly_depo.wav");
	}public void getSavingwithdrawfunds(double amt) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
		if (SavingBalance >= amt) {
			SavingBalance -= amt;
			System.out.println(SavingBalance);
			audio_notify("src\\wthdrwl_sussfl.wav");

		}else {
			System.out.print("Funds Insufficient");
			audio_notify("src\\insuf_bal.wav");
		}
	}public void getSavingdepositfunds(double amt) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
		SavingBalance += amt;
		System.out.println(SavingBalance);
		audio_notify("src\\sudfly_depo.wav");
	}
}
