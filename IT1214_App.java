class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name="Default Name";
	}
	
	Student(String n,int m){	
		System.out.println("Creating a Student Object with name "+n+" and marks "+m);
		name=n;
		marks=m;
	}
}

class App{
	public static void main(String[] ar){		
		System.out.println("Welcome to Demo Class App");				
		Student s1=new Student();				
		System.out.println("Name of the Student s1 = "+s1.name);
		System.out.println("Marks of the Student s1 = "+s1.marks);
		s1.marks=100;
		s1.name="Kasthoori";
		System.out.println("Name of the Student s1 = "+s1.name);
		System.out.println("Marks of the Student s1 = "+s1.marks);
		
		Student s2=new Student("Manimegalai",50);
		//s2.marks=100;
		//s2.name="Saliny";
		System.out.println("Name of the Student s2 = "+s2.name);
		System.out.println("Marks of the Student s2 = "+s2.marks);
	}
}







