package packone;

public class Accounts {

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
	public void getCurrentwithdrawfunds(double amt) {
		if (CurrentBalance >= amt) {
			CurrentBalance -= amt;
			System.out.println(CurrentBalance);
		}else {
			System.out.print("Funds Insufficient");
		}
		
	}public void getCurrentdepositfunds(double amt) {
		CurrentBalance += amt;
		System.out.println(CurrentBalance);
	}public void getSavingwithdrawfunds(double amt) {
		if (SavingBalance >= amt) {
			SavingBalance -= amt;
			System.out.println(SavingBalance);
		}else {
			System.out.print("Funds Insufficient");
		}
	}public void getSavingdepositfunds(double amt) {
		SavingBalance += amt;
		System.out.println(SavingBalance);
	}
}
