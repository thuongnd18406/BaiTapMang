package dangthuongngo.com;

import java.util.Random;
import java.util.Scanner;

public class TestMang {

	public static void main(String[] args) 
	{
		System.out.println("Nhập số phần tử của mảng:");		
		int soPT= new Scanner(System.in).nextInt();
		int []M=new int[soPT];	
		String mang="";
		Random rd =new Random();
		for (int i = 0; i < soPT; i++) {
			M[i]=rd.nextInt(100);	
			mang+=M[i]+"  ";
		}
		System.out.println("Mảng là: "+ mang);
		System.out.println();
		
		/**
		 * Hiện các số lẻ
		 * Tổng các số lẻ
		 */
		String mangLe="";
		int tongLe=0;
		for (int i = 0; i < M.length; i++) 
		{
			if (M[i]%2!=0) 
			{
				mangLe+=M[i] +"  ";
				tongLe+=M[i];
			}
		}
		System.out.println("Mảng các số lẻ là: "+mangLe);
		System.out.println("Tổng các số lẻ là: "+tongLe);
		System.out.println();
		/**
		 * Hiện các số chẳn
		 * TỔng chẳn
		 */
		String mangChan="";
		int tongChan=0;
		for (int i = 0; i < M.length; i++) 
		{
			if (M[i]%2==0) 
			{
				mangChan+=M[i] +"  ";
				tongChan+=M[i];
			}
		}
		System.out.println("Mảng các số chẳn là: "+mangChan);
		System.out.println("Tổng chẳn: "+tongChan);
		System.out.println();
		/**
		 * Hiện các số nguyên tố
		 * TỔng số nguyên tố
		 */
		String mangSoNT="";
		String mangKoSoNT="";	
		
		
		for (int i = 0; i < M.length; i++) 
		{
			int dem=0;
			for (int j = 1; j <= M[i]; j++) 
			{
				if (M[i]%j==0)  dem++;				
			}
			if (dem==2) 
			{
				mangSoNT+=M[i] + "  ";					
			}
			else mangKoSoNT+=M[i]+ "  " ;			
		}
		System.out.println("Mảng các số nguyên tố là: "+mangSoNT);
		System.out.println("Mảng các số không phải nguyên tố là: "+mangKoSoNT);
		
		
	}

}
