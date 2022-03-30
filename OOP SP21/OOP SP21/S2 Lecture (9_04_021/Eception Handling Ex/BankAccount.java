package exceptionss;

public class BankAccount {

	int withdrawAmount;
	int transferAmount;
	
	public void setTransferAmount(int transferAmount) {
		this.transferAmount = transferAmount;
	}
	
	public int getTransferAmount() {
		return transferAmount;
	}
	
	public void setWithdrawAmount(int withdrawAmount) {
		
		if (withdrawAmount < 0) {
			throw new IllegalArgumentException("Please enter amount greater than 0. ");
		}else {
			this.withdrawAmount = withdrawAmount;
		}
		
	}
	
	public int getWithdrawAmount() {
		return withdrawAmount;
	}
	
}
