package javaprograms;

public class Student {
	int rollno;
	String name;
	float fee;
	/*
	Student(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	*/
	
	Student(int rno,String na,float fe){
		rollno=rno;
		name=na;
		fee=fe;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
	public static void main(String[] args) {
		
		Student s1=new Student(123,"durga",5600f);
		Student s2=new Student(124,"bhavani",6000f);
		s1.display();
		s2.display();

	}
}

