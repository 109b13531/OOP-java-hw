package homework;

class Cbbb{
	double x;
	double y;

}


public class Class02 {

	public static void main(String[] args) {
		Cbbb obj1 =new Cbbb();	//a
		Cbbb obj2 =new Cbbb();	//a
		Cbbb avg =new Cbbb();	//a
		
		int obj1x,obj1y,obj2x,obj2y,avgx,avgy; //a
		
		obj1.x= 5.2 ;//b
		obj1.y= 3.9 ;//b
		obj2.x= 6.5 ;//c
		obj2.y= 4.6 ;//c
		avg.x=(obj1.x+obj2.x/2) ;//d
		avg.y=(obj1.y+obj2.y/2);//e
		System.out.println("obj1="+"("+obj1.x+" , "+obj1.y+")");//f
		System.out.println("obj2="+"("+obj2.x+" , "+obj2.y+")");//f
		System.out.println("avg="+"("+avg.x+" , "+avg.y+")");//f
	}
	

}
