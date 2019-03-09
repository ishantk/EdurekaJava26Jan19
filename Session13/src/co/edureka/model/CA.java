package co.edureka.model;

public class CA {

	// Attributes
	Integer id;
	Integer a;
	
	public CA() {
	
	}

	public CA(Integer id, Integer a) {
		this.id = id;
		this.a = a;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "CA [id=" + id + ", a=" + a + "]";
	}
	
	
	
}
