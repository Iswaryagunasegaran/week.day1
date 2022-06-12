package week1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 =8,firstNum=0,secNumber =1,sum,j;
		for (j=1; j<=r1;j++)
		{
			sum=firstNum + secNumber;
			firstNum = secNumber;
			secNumber = sum;
			System.out.println("Series"+sum);
		}
		
		

	}

}
