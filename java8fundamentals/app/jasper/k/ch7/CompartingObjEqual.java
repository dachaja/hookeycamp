package jasper.k.ch7;

import java.awt.Point;

public class CompartingObjEqual {
	public static void main(String[] args) {
		Point pt1 = new Point(10,10);
		Point pt2 = new Point(10,20);
		Point pt3 = new Point(12,19);
		Point pt4 = pt1;
		
		System.out.println("pt1==pt1:"+(pt1==pt1));
		System.out.println("pt1.equals(pt1):"+pt1.equals(pt1));
		System.out.println("pt1==pt2:"+(pt1==pt2));
		System.out.println("pt1.equals(pt2):"+pt1.equals(pt2));
		System.out.println("pt1==pt3:"+(pt1==pt3));
		System.out.println("pt1.equals(pt3):"+pt1.equals(pt3));
		System.out.println("pt1==pt4:"+(pt1==pt4));
		System.out.println("pt1.equals(pt4):"+pt1.equals(pt4));
	}
}
