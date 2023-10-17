package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		
		Point2D p1 =new Point2D();
		p1.acceptPoint();
        System.out.println("First Point Details:"+p1.getDeatils());
        
        Point2D p2= new Point2D();
        p2.acceptPoint();
        System.out.println("Second Point Details:"+p2.getDeatils());
        
        if(p1.equal(p2))
        {
        	System.out.println("Points are equal");	
        }
        else
        {
        System.out.println("Distance Is:"+p1.distance(p2));
	
        }
        
	}
}
