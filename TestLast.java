import java.io.*;
import java.util.*;
import java.lang.*;

public class TestLast {

	public static void main(String[] args) {
		//创建学生对象
		Student student = new Student();
		student.setName();
		student.setAge();
		student.setSex();
		student.setNumber();
		//打开学生作业文件
		File sourceFile = new File("E:\\java实验\\" + student.getName() + ".txt");
		File targetFile = new File("E:\\java实验\\" + student.getName() + "correct.txt");
		//创建空字符串，用于储存作业内容
		String s = "";
		//创建试错程序
		try {//创建输入流
			Reader in = new FileReader(sourceFile);
			//创建输入缓冲流，指向输入流
			BufferedReader bufferReader = new BufferedReader(in);
			//创建输出流
			Writer out = new FileWriter(targetFile, true);
			//创建输出缓冲流，指向输出流
			BufferedWriter bufferWriter = new BufferedWriter(out);
			//将学生信息储存在information中
			String information = "姓名:" + student.getName() + "		" + "性别:" + student.getSex() + "		" + "年齡："
					+ student.getAge() + "		" + "学号:" + student.getNumber();
			//将学生信息写入修改文件中的第一行
			bufferWriter.write(information);
			//换行
			bufferWriter.newLine();
			//创建空字符串，用于储存学生作业的每一行
			String str = null;
			//读取学生作业文件的每一行内容，将学生作业内容储存在字符串变量s中
			while ((str = bufferReader.readLine()) != null) {
				s = s + str;
			}
			//创建字符数组
			char strone[] = new char[s.length()];
			//将学生作业内容储存在字符数组strone中
			strone = s.toCharArray();
			//每七个汉字加一符号，汉字个数为奇数加“，”，汉字个数为偶数加“。”
			for (int i = 1; i <= s.length(); i++) {
				bufferWriter.write(strone[i - 1]);
				if (i % 14 == 0) {
					bufferWriter.write("。");
					bufferWriter.newLine();
				} else if (i % 7 == 0) {
					bufferWriter.write(",");
				}
			}
			bufferWriter.flush();
			bufferWriter.flush();
			bufferWriter.close();
			bufferReader.close();
			// 统计作业中某个词语或汉字出现的次数
			System.out.println(
					"----------------------------------请输入您想查询学生作业中汉字字或词语,统计出学生作业中该字或词语出现次数------------------------------------");
			//用户输入想要查询作业中汉字字或词语,将会统计出学生作业中该字或词语出现次数
			Scanner search = new Scanner(System.in);
			String strFour = search.nextLine();
			//统计单个汉字在学生作业中出现的次数
			if (strFour.length() == 1) {
				int t = 0;
				for (int i = 0; i < s.length(); i++) {
					char chr1 = s.charAt(i);
					if (strFour.charAt(0) == chr1) {
						t++;
					}
				}
				System.out.println(strFour + "出现的次数为：" + t);
				//统计词语在学生作业中出现的次数
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
		// 若出现错误则指出错误
		catch (Exception e) {
			System.out.println("出现错误：" + e);
		}
	}

}
