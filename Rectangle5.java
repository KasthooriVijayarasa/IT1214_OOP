class Rectangle5{
	
	int height;
	int width;
	
	Rectangle5(int height, int width){
		this.height=height;
		this.width=width;
		System.out.println("Just Created a rectangle object with size (h*w) "+height+"*"+width);
		print(width,height);
	}
	
	void print(int width, int height){
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Main5{
	public static void main(String[] args){
		Rectangle5 r1=new Rectangle5(5,4);		
		Rectangle5 r2=new Rectangle5(6,3);
		Rectangle5 r3=r1;
		//Scanner to input values when running
		System.out.println("r1: Height "+r1.height+" ,width "+r1.width);
		System.out.println("r2: Height "+r2.height+" ,width "+r2.width);
		System.out.println("r3: Height "+r3.height+" ,width "+r3.width);
	}
}