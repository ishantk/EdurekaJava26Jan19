package co.edureka.model;

// CB is Child of CA
// CB is subclass to CA
public class CB extends CA{
	
	Integer b; // id and a shall be inherited from CA
	
	public CB() {
	
	}

	public CB(Integer b) {
		this.b = b;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "CB [b=" + b + ", id=" + id + ", a=" + a + "]";
	}
	
}
