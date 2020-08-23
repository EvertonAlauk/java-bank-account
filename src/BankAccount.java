public class BankAccount {
	private double amount;
	private String owner;
	private String agency;
	private String account;

	public double getAmount() {
		return this.amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "BankAccount: [ amount=" + amount + " | owner=" + owner + " | agency=" + agency + " | account=" + account + " ]";
	}
}