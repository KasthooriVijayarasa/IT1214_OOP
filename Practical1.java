class Paper{
	int length;
	int width;
	String text;
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a document object d");
		d.name="My first Document";
		System.out.println("Name of the document d is "+d.name);
		
		d.p=new Paper();
		d.p.text="This is the text in the paper of document My first document";
		System.out.println("Text value of the paper of document: "+d.p.text);
		d.p.length=100;
		d.p.width=50;
		System.out.println("Size (l*w) of the paper of the document d is "+d.p.length+"*"+d.p.width);
		
		Document d2=new Document();
		System.out.println("Created a document object d2");
		d2.name="My second Document";
		System.out.println("Name of the document d2 is "+d2.name);
	}
}


/* to avoid system.out.println again and again
class Printer{
	void print(String s){
		System.out.println(s); 
	}
}

class App{
	public static void main(String[] ar){	
		Printer p=new Printer();
		p.print("Welcome to Demo Class App");				
		Student s1=new Student();
		s1.marks=100;
		s1.name="Kasthoori";
		p.print("Name of the Student s1 = "+s1.name);
		
	}
}
*/


















