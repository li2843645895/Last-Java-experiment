import java.util.*;

public class Student {
	//�����ַ������������ڴ���ѧ������
	String name;
	//�����ַ������������ڴ���ѧ������
	String age;
	//�����ַ������������ڴ���ѧ���Ա�
	String sex;
	//�����ַ������������ڴ���ѧ��ѧ��
	String number;
	//����setName()���������ڸ�name������ֵ
	void setName() {
		System.out.println("������ѧ��������");
		Scanner readerOne = new Scanner(System.in);
		name = readerOne.nextLine();
	}
	//����getName()��������ѧ������
	String getName() {
		return name;
	}
	//����setName()���������ڸ�����sex��ֵ
	void setSex() {
		System.out.println("������ѧ���Ա�");
		Scanner readerTwo = new Scanner(System.in);
		sex = readerTwo.nextLine();
	}
	//����getName()���������ڷ���ѧ���Ա�
	String getSex() {
		return sex;
	}
	//����setAge()���������ڸ�����age��ֵ
	 void setAge() {
		 System.out.println("������ѧ�����䣺");
		 Scanner readerThree=new Scanner(System.in);
		age=readerThree.nextLine();
		}
	 //����getAge()��������������age��ֵ
	String getAge() {
		 return age;
	 }
	//����setNumber()������������number������ֵ
	 void setNumber() {
		 System.out.println("������ѧ��ѧ�ţ�");
		 Scanner readerFour=new Scanner(System.in);
		number=readerFour.nextLine();
		}
	 //����getNumber()��������������numberֵ
	 String getNumber() {
		 return number;
	 }
}
