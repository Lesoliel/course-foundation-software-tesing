package lww.class7;

public class Person {
	protected String  name;
    private String sex;
    private int age;
    public Person() {
		System.out.println("Person���޲εĹ��췽��");
	}
    public Person(String name) {
    	this.name = name;
		System.out.println("Person�ĺ������Ĺ��췽��");
	}
    //set��get����ʡ��
    
    public void display(){
    	System.out.println("Person��display����");
    }
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
