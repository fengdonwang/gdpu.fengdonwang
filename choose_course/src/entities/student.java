package entities;

public class student {
    private int stu_no;
    private String stu_name;
    private int cour_no;
    private String stu_user;
    private String ttu_passwd;
    private int grade;
	public student(int stu_no, String stu_name, int cour_no, String stu_user, String ttu_passwd, int grade) {
		super();
		this.stu_no = stu_no;
		this.stu_name = stu_name;
		this.cour_no = cour_no;
		this.stu_user = stu_user;
		this.ttu_passwd = ttu_passwd;
		this.grade = grade;
	}
	public student() {
		super();
	}
	public int getStu_no() {
		return stu_no;
	}
	public void setStu_no(int stu_no) {
		this.stu_no = stu_no;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getCour_no() {
		return cour_no;
	}
	public void setCour_no(int cour_no) {
		this.cour_no = cour_no;
	}
	public String getStu_user() {
		return stu_user;
	}
	public void setStu_user(String stu_user) {
		this.stu_user = stu_user;
	}
	public String getTtu_passwd() {
		return ttu_passwd;
	}
	public void setTtu_passwd(String ttu_passwd) {
		this.ttu_passwd = ttu_passwd;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
   
}