package lww.class9;

public class Test {
	public static void main(String[] args) {
		TestOverLoad test = new TestOverLoad();
		/*//�����������ͺͶ�Ӧ�İ�װ�������ǲ�ͬ����������
		short s = 5; 
		test.go(s); */
		/*
		//��ͬ�İ�װ�����Ͳ����ڼӿ��˵���������ǲ�ͬ���͵�
		int i = 5;
	 	test.go(i);*/
		
		short s1 = 5; 
	    short s2 = 6; 
		test.go(s1,s2);
/*
		//�����ڲ����е�display()����
		//ʵ�����ⲿ��Ķ���
		OutClass outClass = new OutClass();
		//ʵ�����ڲ���Ķ���
		OutClass.InnerClass innerClass = outClass.new InnerClass();
		//�ڲ���Ķ����������ڲ���ĳ�Ա����
		innerClass.display();
		
		new OutClass().new InnerClass().display();*/
	}
}
class TestOverLoad {
	/*void go(int x){
		System.out.println("int");
	}
	void go(Short s){
		System.out.println("Short");
	}*/
/*
	void go(short x){
		System.out.println("short");
	}
	void go(Integer x){
		System.out.println("Integer");
	}*/
	void go(Long x){
		System.out.println("Long");
	}

/*
	void go(short s){
		System.out.println("short");
	}*/
	/*void go(short x, short y){
		System.out.println("short,short");
	}*/
     /*void go(short  ...x){
		System.out.println("short��");
	}*/
     void go(int  ...x){
		System.out.println("int��");
	}
	/*void go(Short x, Short y){
		System.out.println("Short,Short");
	}*/
	void go(Object x, Object y){
		System.out.println("Object,Object");
	}

}

