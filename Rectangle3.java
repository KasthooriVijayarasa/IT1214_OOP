class Rectangle3{
	
	int height;
	int width;
	
	Rectangle3(int h, int w){
		height=h;
		width=w;
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

class Main3{
	public static void main(String[] args){
		Rectangle3 r1=new Rectangle3(5,4);		
		Rectangle3 r2=new Rectangle3(6,3);
		
	}
}
