package StudentInfo;

public class Student {
	private String name;
	private int ch;
	private int math;
	private int eng;
	private int sum;
	
	public Student(String name, int ch, int math, int eng) {
		super();
		this.name = name;
		this.ch = ch;
		this.math = math;
		this.eng = eng;
		this.sum = this.ch+this.math+this.eng;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	
	public String toString(){
		return name+","+ch+","+math+","+eng+","+sum;
	}
	
}
