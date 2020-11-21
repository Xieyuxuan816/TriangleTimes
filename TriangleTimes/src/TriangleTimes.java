import java.util.Scanner;

public class TriangleTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[3];
		for (int i=0;i<3;i++) {
			ar[i]=sc.nextInt();
		}
		if (ar[0]+ar[1]+ar[2]!=180) {
			System.out.println("Error");
		}
		else if (ar[0]==60 && ar[1]==60 && ar[2]==60) {
			System.out.println("Equilateral");
		} 
		else if (ar[0]==ar[1] || ar[0]==ar[2] || ar[1]==ar[2]) {
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scalene");
		}
	}

}
