package entities;

public class teacher {
    private int tea_no;
    private String tea_name;
    private int cour_no;
    private String tea_user;
    private String tea_passwd;
    private String cour_name;
	
	public teacher() {
		super();
	}
	public int getTea_no() {
		return tea_no;
	}
	public void setTea_no(int tea_no) {
		this.tea_no = tea_no;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}
	public int getCour_no() {
		return cour_no;
	}
	public void setCour_no(int cour_no) {
		this.cour_no = cour_no;
	}
	public String getTea_user() {
		return tea_user;
	}
	public void setTea_user(String tea_user) {
		this.tea_user = tea_user;
	}
	public String getTea_passwd() {
		return tea_passwd;
	}
	public void setTea_passwd(String tea_passwd) {
		this.tea_passwd = tea_passwd;
	}
	public String getCour_name() {
		return cour_name;
	}
	public void setCour_name(String cour_name) {
		this.cour_name = cour_name;
	}
	
}
