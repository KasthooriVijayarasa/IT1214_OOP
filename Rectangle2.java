class Rectangle2{
	int height;
	int width;

	void print(int width, int height){
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Main2{
	public static void main(String[] args){
		Rectangle2 r1=new Rectangle2();
		r1.print(3,4);		
	}
}