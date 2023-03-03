package polymorphism;

class Shape{
	 
	public float calculateArea (float radius) {
		return 3.14f * radius * radius;
	}
	
	public float calculateArea (float length,float breadth) {
		return length*breadth;
	}
}

class Tester{
	
	
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		
		float circleArea = shape.calculateArea(3.14f);
		float circleRectangle = shape.calculateArea(14.0f, 20.3f);
		
		System.out.println(circleArea);
		System.out.println(circleRectangle);
	}
}