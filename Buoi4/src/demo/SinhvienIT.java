package demo;

public class SinhvienIT extends Student {
  private String nganh;
  



public SinhvienIT() {
	super();
}



public SinhvienIT(String name, String gPA, String nganh) {
	super(name, gPA);
	this.nganh = nganh;
}

public String getNganh() {
	return nganh;
}

public void setNganh(String nganh) {
	this.nganh = nganh;
}

@Override
public String toString() {
	return "SinhvienIT [nganh=" + nganh + ", toString()=" + super.toString() + "]";
}
  
}
