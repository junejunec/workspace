
public class Main1 {

	public static void main(String[] args) {
		double triangeleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangeleArea + "cm²");

		double circleArea =calcCircleArea(5.0);
		System.out.println("円の面積：" + circleArea + "cm²");
	}
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;//return bottom*height/2; でも可
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;// return 3.14 * radius * radius;でも可
	}

}
