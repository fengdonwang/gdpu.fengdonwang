package entities;

public class grade {
    private String cour_name;
    private int grade_no;
    private String stu_name;
	public grade() {
		super();
	}
	public grade(String cour_name, int grade_no, String stu_name) {
		super();
		this.cour_name = cour_name;
		this.grade_no = grade_no;
		this.stu_name = stu_name;
	}
	public String getCour_name() {
		return cour_name;
	}
	public void setCour_name(String cour_name) {
		this.cour_name = cour_name;
	}
	public int getGrade_no() {
		return grade_no;
	}
	public void setGrade_no(int grade_no) {
		this.grade_no = grade_no;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	
}
