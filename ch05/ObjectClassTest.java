package lww.class6;

public class ObjectClassTest {
	public static void main(String[] args){
		Person person = new Person("Lucy", 20);
		Person lily;
		lily = new Person("Lily", 21);
		person = lily;
//		lily = person;
		Person[] persons = {new Person("Lilei",20), new Person("HMM",19)};
		
	}
}

class Person{
	//�������
	public String name;//����
	public int age;//����
	//��ķ���
	/*Person(){
		name = "";
		age = 0;
	}*/
	public Person(String name){
		this.name = name;
	}
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void displayPerson(){
		System.out.println("������" + name);
		System.out.println("���䣺" + age);
	}

	public void displayPerson(int age){
		System.out.println("������" + age + "��");
	}
	public void displayPerson(String name, int age){
		displayPerson();
		System.out.println(name + "��������" + age + "��");
	}
}
