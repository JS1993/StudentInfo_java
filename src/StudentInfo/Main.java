package StudentInfo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	/**
	 * 需求：键盘录入5个学生的信息（姓名，语文成绩，数学成绩，英语成绩），按照总分从高到低输出
	 */
	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩格式：姓名，语文成绩，数学成绩，英语成绩");
		//创建 TreeSet 集合对象，在构造方法中传入比较器，按照总分比较
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>(){
			@Override
			public int compare(Student s1,Student s2){
				int num = s2.getSum()-s1.getSum();
				return num == 0? 1: num;//如果相等返回1来保留，不等返回差值即可
			}
		});
		
		//录入5个学生
		while(ts.size()<5){
			String line = sc.nextLine();
			String[] arr = line.split(",");//字符串切割成数组
			int ch = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int eng = Integer.parseInt(arr[3]);
			ts.add(new Student(arr[0],ch,math,eng));
		}
		
		System.out.println("排序后的学生信息为：");
		for(Student s : ts){
			System.out.println(s);
		}
	}
}
