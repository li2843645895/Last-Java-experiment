# Last-Java-experiment
The last experiment of java
第五次实验实验报告
# java实验报告
###  课程名称：Java程序语言设计
### 实验名称：模拟学生作业处理
### 班级： 计191
### 姓名： 李胜祥 
### 学号： 2019311326
### 教师： 张世博
## 一.实验目的
1.掌握字符串String及其方法的使用
2·掌握文件的读取和使用方法   
3·掌握异常处理结构   
## 二.业务要求
   在某课上，学生要提交实验报告结果，该结果储存在一个文本文件A中。  
   文件A包括两部分内容：  
   一 .学生的基本信息；  
   二 .学生处理后的作业信息，该作业的业务逻辑内容是：利用已学过的字符串知识编程完成《长恨歌》古诗的整齐对齐工作，写出功能方法
## 三·实验过程
  本次实验一共创建了两个文件，分别是TestLast.java和Student.java。在Student.java文件中有Student类，创建字符串变量name,age,sex,number分别用于储存学生姓名，年龄，性别，学号；创建setName()方法，用于给name变量赋值；
  创建getName()方法返回学生姓名；创建setName()方法，用于给变量sex赋值；创建getName()方法，用于返回学生性别；创建setAge()方法，用于给变量age赋值；创建getAge()方法，用来返回age
  的值； 创建setNumber()方法，用来给number变量赋值；创建getNumber()方法，用来返回number值。在TestLast.java文件中， 让用户输入需要打开的学生作业文件。通过输入流和随机流输读取学生作业文件的数据。
  创建学生对象，让用户输入的学生的信息，通过随机流和输入流将学生信息和修改后作业的内容写入学生作业修改的文件中。设计程序，让用户输入词语或汉字，统计该词语或汉字在学生作业中出现的次数。
## 四·核心方法
###  在Student.java中：  
  创建setName()方法，用于给name变量赋值
  
	void setName() {
		System.out.println("请输入学生姓名：");
		Scanner readerOne = new Scanner(System.in);
		name = readerOne.nextLine();
	}
  
   创建getName()方法返回学生姓名
   
	String getName() {
		return name;
    
   创建setName()方法，用于给变量sex赋值
   
	void setSex() {
		System.out.println("请输入学生性别：");
		Scanner readerTwo = new Scanner(System.in);
		sex = readerTwo.nextLine();
	}
  
   创建getName()方法，用于返回学生性别
   
	String getSex() {
		return sex;
	}
  
   创建setAge()方法，用于给变量age赋值
   
	 void setAge() {
		 System.out.println("请输入学生年龄：");
		 Scanner readerThree=new Scanner(System.in);
		age=readerThree.nextLine();
		}
    
   创建getAge()方法，用来返回age的值
   
	String getAge() {
		 return age;
	 }
   
   创建setNumber()方法，用来给number变量赋值
    
    void setNumber() {
		 System.out.println("请输入学生学号：");
		 Scanner readerFour=new Scanner(System.in);
		number=readerFour.nextLine();
		}
    
   创建getNumber()方法，用来返回number值
   
	 String getNumber() {
		 return number;
	 }
   	
### 在TestLast.java中：   
  
	
## 五·实验结果
程序会提示学生输入每一个月的工资，判断是否需要缴税，并计算出每一个月需要缴税金额：  
https://github.com/li2843645895/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201107210021.png  
当输入每一个月的工资不是双浮点型时，程序会出现报错，并要求学生重新输入：  
https://github.com/li2843645895/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201107210048.png  
学生输入十二个月的工资和学费后，控制台会输出学生该年需要交的税，该年的工资和该年的学费：
https://github.com/li2843645895/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201107210054.png
## 六·实验感想
通过本次实验，我掌握了java中抽象类和抽象方法的定义；掌握了java接口中的定义和接口的定义形式已经接口的实现方法；  
同了解了异常的使用方法，并可以在程序中根据输入情况做出异常处理；同时也更加巩固了Static和finally的使用；了解了  
Scanner语句的使用，在此次实验中，我深刻体会到了在Java学习中自生知识的储备不足，我一定会更加用心专注Java语言  
的学习。
