package noofsides;

public class main123 {
	public static void main(String []args) {
		shape abcd;
		triangle t=new triangle();
		hexagon h=new hexagon();
		trapezium tr=new trapezium();
		abcd=t;
        abcd.numberofsides();
		abcd=h;
		abcd.numberofsides();
	    abcd=tr;
		abcd.numberofsides();
	}
}
