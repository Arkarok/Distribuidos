package classes;

public class User extends Person {

	private String login;
	private String passwd;
	private int account;
	private Double balance;
	
	public User(String name, String last, String login, String passwd,
			int account, Double balance) {
		super(name, last);
		this.login = login;
		this.passwd = passwd;
		this.account = account;
		this.balance = balance;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
		
}
