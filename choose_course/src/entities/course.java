package entities;

public class course {
    private int cour_no;
    private String Cour_name;
    private int cour_all;
    private String tea_name;
	public course(int cour_no, String cour_name,  String tea_name) {
		super();
		this.cour_no = cour_no;
		Cour_name = cour_name;
		this.tea_name = tea_name;
	}
	
	public course() {
		// TODO Auto-generated constructor stub
	}

	public int getCour_no() {
		return cour_no;
	}
	public void setCour_no(int cour_no) {
		this.cour_no = cour_no;
	}
	public String getCour_name() {
		return Cour_name;
	}
	public void setCour_name(String cour_name) {
		Cour_name = cour_name;
	}
	public int getCour_all() {
		return cour_all;
	}
	public void setCour_all(int cour_all) {
		this.cour_all = cour_all;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}
	

   
}
