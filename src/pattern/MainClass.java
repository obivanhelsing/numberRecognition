package pattern;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.naming.BinaryRefAddr;
import javax.swing.text.html.Option;
//yapılacaklar:
//her class ın her  test resmi için sonuçları bi yerde toplamak lazım 
public class MainClass {
	Digit[] classes = new Digit[10];
	
	static double temp[]= new double[10];
	public void classify(){
		
	}
	public MainClass() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < classes.length; i++) {
			classes[i]= new Digit(i);
		}
		
	}
	public int  max(){

		double max=temp[0];
		int counter=0;
		for( int i=1;i<10;i++){
			
			if(temp[i]>max){
				max=temp[i];
				counter=i;	
			}
			
			//System.out.println(results[i]);
		}
		return counter;
		
	}
	public void testZero(){
		System.out.println("Results for class 0");
		System.out.println("====== Test results for class 0 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[0].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testOne(){
		System.out.println("Results for class 1");
		System.out.println("====== Test results for class 1 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[1].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testTwo(){
		System.out.println("Results for class 2");
		System.out.println("====== Test results for class 2 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[2].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testThree(){
		System.out.println("Results for class 3");
		System.out.println("====== Test results for class 3 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[3].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testFour(){
		System.out.println("Results for class 4");
		System.out.println("====== Test results for class 4 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[4].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testFive(){
		System.out.println("Results for class 5");
		System.out.println("====== Test results for class 5 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[5].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testSix(){
		System.out.println("Results for class 6");
		System.out.println("====== Test results for class 6 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[6].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testSeven(){
		System.out.println("Results for class 7");
		System.out.println("====== Test results for class 7 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[7].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testEight(){
		System.out.println("Results for class 8");
		System.out.println("====== Test results for class 8 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[8].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	public void testNine(){
		System.out.println("Results for class 9");
		System.out.println("====== Test results for class 9 test images =====");
		for(int k=0 ; k<9;k++)	{
			for(int i=0;i<10;i++){
				temp[i]= classes[i].discriminant(classes[9].test, k);
			}
			System.out.println("Image "+(k+1)+"  classification ==> "+max());
		}	
		
	}
	
	
	public static void main(String[] args){
		
		MainClass mc = new MainClass();
		
		mc.testZero();
		mc.testOne();
		mc.testTwo();
		mc.testThree();
		mc.testFour();
		mc.testFive();
		mc.testSix();
		mc.testSeven();
		mc.testEight();
		mc.testNine();
		

}
}
