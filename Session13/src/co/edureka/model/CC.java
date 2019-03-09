package co.edureka.model;

//CC is Child of CB and grand child of CA
//CC is subclass to CA
public class CC extends CB{
	
	Integer c; // id and a will be inherited from CA and b will be inherited from CB
	
	public CC() {
		// TODO Auto-generated constructor stub
	}

	public CC(Integer c) {
		this.c = c;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CC [c=" + c + ", b=" + b + ", id=" + id + ", a=" + a + "]";
	}
	
}
