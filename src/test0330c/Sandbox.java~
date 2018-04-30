package test0330c;

import java.io.*;
import java.lang.reflect.*;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Method;
import java.util.*;


public class Sandbox extends SandAbst implements SandInter{
	String s = "abc";
	
	public static String staticMethod(){
		return "abc";
	}
	
	private String privateMethod(){
		return "abc";
	}
	
	private static String prstMethod(){
		return "abc";
	}
	
	public String listMethod(ArrayList<String> a){
		return a.get(0);
	}
	public String listbaseMethod(List<String> a){
		return a.get(0);
	}
	public String arrayMethod(String[] a){
		return a[0];
	}
	
	public String basicMethod(String s){
		int b = 0;
		double a = 5;
		return "s";
	}
	
	public String basicMehotd2(String s){
		return s;
	}
	public String noArgMethod(){
		return "abc";
	}
	
	public String listArrayMethod(ArrayList<String>[] a){
		return a[0].get(0);
	}
	
	public String arrayListMethod(ArrayList<String[]> a){
		return a.get(0)[0];
	}
	
	public String listObjectMethod(ArrayList<Sandbox> a){
		return a.get(0).s;
	}
	
	public String arrayObjectMethod(Sandbox[] a){
		return a[0].s;
	}
	
	public static void main(String[] args){
		try{

		Sandbox s = new Sandbox();
		Method[] ms = s.getClass().getDeclaredMethods();
		for(int i = 0; i < ms.length; i++){
			//System.out.println(ms[i]);
			if(ms[i].toString().contains("listArray")){
				Type[] ts = ms[i].getGenericParameterTypes();
				System.out.println(ts[0]);
				System.out.println(ms[i].getParameterTypes()[0].toString());
				Class cs = (Class)ts[0];
				System.out.println(cs.getComponentType());
				ParameterizedType gt = (ParameterizedType)ts[0];
				//System.out.println(gt.getRawType());
				Type t = gt.getRawType();
				//System.out.println(t);
				if(t instanceof Class){
					System.out.println("Class: " + t);
				}
				if(java.util.List.class.isAssignableFrom((Class)t)){
					System.out.println("List");	
					Type[] type3 = gt.getActualTypeArguments();
					System.out.println(type3[0].getTypeName());
					if(type3[0] instanceof Class){
						System.out.println("this is class");
						System.out.println(type3[0].getTypeName());
						System.out.println(type3[0].toString());
						Class c4 = (Class)type3[0];
						System.out.println(c4.getClass().getName());
						System.out.println(c4.toString());
					}else{
						System.out.println("this is not class");
						
						                      
					}
				}
				
				
			}
		}
		}catch(Exception e){
			
		}
	}
	
	@Override
	public String abstMethod(){
		return "This Method is created by Sandbox";
	}
	
	@Override
	public String dammyMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String interMethod(){
		return "This Method is created by Sandbox";
	}
	@Override
	public String dammyMethodI() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int testMethod(int a, String b, double[] c){
		return 0;
	}

}
