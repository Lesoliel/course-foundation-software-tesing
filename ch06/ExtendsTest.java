package lww.class7;

public class ExtendsTest {
	public static void main(String[] args) {
		Person p1;// = new Person();
		Teacher teacher = new Teacher("JavaSE");
		teacher.displayEx();
		p1 = teacher;
		p1.display();
//		p1.displayEx();
//		teacher.display();
		//˽�г�Ա�Ƿ��ܱ��̳е�����
		teacher.setSex("Femail");
		System.out.println(teacher.getSex());
	}
}

class Teacher extends Person{
	private String  address;
    private String major;
    private double salary;
    /*public Teacher() {
		System.out.println("Teacher�Ĺ��췽��");
	}*/

    public Teacher(String major) {
    	super("Lily");
    	super.name = "Lilei";
    	this.major = major; 
		System.out.println("Teacher�Ĺ��췽��");
	}
    //set��get����ʡ��
    public void displayEx(){
    }
    public void display(){
    	System.out.println("Teacher��display����");
    }

}