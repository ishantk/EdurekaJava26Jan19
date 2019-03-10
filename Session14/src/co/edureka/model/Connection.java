package co.edureka.model;

// BEAN or MODEL or POJO
public class Connection {

	String driver;
	String url;
	String user;
	String password;
	
	public Connection() {
		System.out.println(">> Connection Object Constructed");
	}

	public Connection(String driver, String url, String user, String password) {
		System.out.println(">> Connection Object Constructed");
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Connection [driver=" + driver + ", url=" + url + ", user=" + user + ", password=" + password + "]\n"+super.toString(); //super.toString() -> give us the HashCode for Object
	}
	
	// Below methods can be any name of your choice
	public void myInit(){
		System.out.println(">> myInit Executed");
	}
	
	public void myDestroy(){
		System.out.println(">> myDestroy Executed");
	}
	
}
