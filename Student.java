import java.util.*;

public class Student {
	//创建字符串变量，用于储存学生姓名
	String name;
	//创建字符串变量，用于储存学生年龄
	String age;
	//创建字符串变量，用于储存学生性别
	String sex;
	//创建字符串变量，用于储存学生学号
	String number;
	//创建setName()方法，用于给name变量赋值
	void setName() {
		System.out.println("请输入学生姓名：");
		Scanner readerOne = new Scanner(System.in);
		name = readerOne.nextLine();
	}
	//创建getName()方法返回学生姓名
	String getName() {
		return name;
	}
	//创建setName()方法，用于给变量sex赋值
	void setSex() {
		System.out.println("请输入学生性别：");
		Scanner readerTwo = new Scanner(System.in);
		sex = readerTwo.nextLine();
	}
	//创建getName()方法，用于返回学生性别
	String getSex() {
		return sex;
	}
	//创建setAge()方法，用于给变量age赋值
	 void setAge() {
		 System.out.println("请输入学生年龄：");
		 Scanner readerThree=new Scanner(System.in);
		age=readerThree.nextLine();
		}
	 //创建getAge()方法，用来返回age的值
	String getAge() {
		 return age;
	 }
	//创建setNumber()方法，用来给number变量赋值
	 void setNumber() {
		 System.out.println("请输入学生学号：");
		 Scanner readerFour=new Scanner(System.in);
		number=readerFour.nextLine();
		}
	 //创建getNumber()方法，用来返回number值
	 String getNumber() {
		 return number;
	 }
}
