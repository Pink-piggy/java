package haha;

public class List9_6 {
	double radius;
	static int numberOfObjects = 0;
	
	List9_6(){
		radius =1 ;
		numberOfObjects++;
	}
	List9_6(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius * radius * Math.PI;
	}
}
