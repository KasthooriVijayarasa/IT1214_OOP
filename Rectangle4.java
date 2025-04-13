class Rectangle4{
	
	int height;
	int width;
	
	Rectangle4(int h, int w){
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

class Main4{
	public static void main(String[] args){
		Rectangle4 r1=new Rectangle4(5,4);		
		Rectangle4 r2=new Rectangle4(6,3);
		System.out.println("Height "+r1.height+" ,width "+r1.width);
	}
}
