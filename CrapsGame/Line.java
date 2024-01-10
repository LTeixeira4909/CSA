public class Line {
	private Point end1;
	private Point end2;
	
	public Line(double x1, double y1, double x2, double y2)
	{
		end1 = new Point(x1,y1);
		end2 = new Point(x2,y2);
		
	}
	public Line()		// default constructor
	{
		end1 = new Point();
		end2 = new Point();
	}
	
	public double distance(){
	 double xAxis = Math.pow(end2.getX() - end1.getX(),2);
     double yAxis = Math.pow(end2.getX() - end1.getX(),2);
	 double length = Math.sqrt(xAxis + yAxis);
    return length;
	}
	public Point midpoint(){
		double x = (end1.getX()+end2.getX())/2;
        double y = (end1.getY()+end2.getY())/2;
        Point point = new Point(x, y);
        return point;
	
	}
	
	public boolean sameLength(Line otherLine){
		double d1 = otherLine.distance();
        double d2 = Math.sqrt(Math.pow(end2.getX()-end1.getX(), 2)+Math.pow(end2.getY()-end1.getY(), 2));
        return Math.abs(d1-d2)<=0.001;
		
	}
	
	public double slope()
	{
		double m;
		m = (end2.getY()-end1.getY())/(end2.getX()-end1.getX());
		return m;
		
	}
	public String toString()
	{
		String s = "Line with endpoints " + end1 + " and " + end2;
		return s;
	}
	
	public boolean parallel(Line otherLine)
	{
		double m1 = this.slope();
		double m2 = otherLine.slope();
		
		//return m1==m2;
		//because of roundoff error, it is not recommended that you compare 
		//two floats for equality, but that their difference is small
		return Math.abs(m1-m2)<=.0001;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l1 = new Line(-1,-3, 2,1);
		
		double m = l1.slope();
		System.out.println(l1);
		System.out.println("Slope = " + m);
		
		Line l2 = new Line(0,0,3,4);
		System.out.println(l2);
		System.out.println("Slope = " + l2.slope());
		System.out.println("Parallel? " + l1.parallel(l2));
		
		
		double dist = l1.distance();
		Point p1 = l1.midpoint();
		
		System.out.println("distance = " + dist);
		System.out.println("Midpoint = " + p1);
		
		System.out.println("distance = " + l2.distance());
		System.out.println("Same length? " + l1.sameLength(l2));

	}

}