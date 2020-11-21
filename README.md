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

   用户输入需要打开的学生作业的文件（文件名为学生姓名命名）和创建改存放改正作业后的文件
	
	File sourceFile = new File("E:\\java实验\\" + student.getName() + ".txt");
	File targetFile = new File("E:\\java实验\\" + student.getName() + "correct.txt");
	
   以下代码用于创建输入输出流，缓冲流，通过调用Student类中的student.getName()；student.getSex()；student.getAge()；student.getNumber()方法，得到学生的姓名，年龄，性别，学号。
   并存入字符串informat中，将学生的信息写入学生的修改作业的文件的第一行，并换行。
   
	Reader in = new FileReader(sourceFile);
	BufferedReader bufferReader = new BufferedReader(in);
	Writer out = new FileWriter(targetFile, true);
	BufferedWriter bufferWriter = new BufferedWriter(out);
	String information = "姓名:" + student.getName() + "		" + "性别:" + student.getSex() + "		" + "年齡："
	+ student.getAge() + "		" + "学号:" + student.getNumber();
	bufferWriter.write(information);
	bufferWriter.newLine(); 
	
   读取学生作业文件的每一行内容，并将学生作业内容储存在字符串变量s中。创建字符数组strone，将学生作业内容储存在字符数组strone中
	
  	 String str = null;
		while ((str = bufferReader.readLine()) != null) {
			s = s + str;
		}
		char strone[] = new char[s.length()];
		strone = s.toCharArray();
		
   对学生作业内容每七个汉字加一符号 ：汉字个数为奇数加“，”，汉字个数为偶数加“。”。并且十四个汉字占一行。
   
		for (int i = 1; i <= s.length(); i++) {
			bufferWriter.write(strone[i - 1]);
			if (i % 14 == 0) {
				bufferWriter.write("。");
				bufferWriter.newLine();
			} else if (i % 7 == 0) {
				bufferWriter.write(",");
			}
		}
   以下代码实现让用户输入想要查询作业中汉字字或词语,统计单个汉字在学生作业中出现的次数或两字词语在学生作业中出现的次数。
   
			Scanner search = new Scanner(System.in);
			String strFour = search.nextLine();
			if (strFour.length() == 1) {
				int t = 0;
				for (int i = 0; i < s.length(); i++) {
					char chr1 = s.charAt(i);
					if (strFour.charAt(0) == chr1) {
						t++;
					}
				}
				System.out.println(strFour + "出现的次数为：" + t);
			} else if (strFour.length() == 2) {
				int t = 0;
				for (int i = 0; i < s.length()-1; i++) {
					char chr2 = s.charAt(i);
					char chr3 = s.charAt(i + 1);
					if (strFour.charAt(0) == chr2 && strFour.charAt(1) == chr3) {
						t++;
					}
				}
				System.out.println(strFour + "出现的次数为：" + t);
			}
		}
## 五·实验结果
运行程序，用户输入学生的姓名，性别，年龄，学号基本信息，并输入想要查询的学生作业文件里的汉字或词语，控制台输出该汉字或词语在学生作业中出现的次数：

https://github.com/li2843645895/Last-Java-experiment/blob/main/b72fab6bf699d8dd6b67068370f01b6.png

程序运行后，指定文件路径中增加已修改过的学生作业的文件：

https://github.com/li2843645895/Last-Java-experiment/blob/main/1c3cf627e2e274c580041cc2d918f0a.png

批改后学生的作业样式：

https://github.com/li2843645895/Last-Java-experiment/blob/main/7538a456cb392c40819f80bb5f50439.png

## 六·实验感想
通过本次实验，我掌握了字符串String及其方法的使用，掌握文件的读取和使用方法，掌握异常处理结构。在此次实验中，我深刻体会到了在Java学习中自生知识的储备不足，我一定会更加用心专注Java语言的学习。
