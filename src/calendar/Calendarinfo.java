/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.Calendar;

/**
 *
 * @author yangmi
 */
public class Calendarinfo
{
//	private MyCallinterface mc;
//	public void doCall(){  
//		MyCallinterface.fun(int[] b);  
//    }
//	public void setMyCallback(MyCallinterface myCallback) {  
//        this.mc = myCallback;  
//    }
	static String [] mo={"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER","DECEMBER"};
	public static int[] rtinf(Calendar c){
		int month=c.get(Calendar.MONTH)+1;
		int year=c.get(Calendar.YEAR);
		int week=c.get(Calendar.DAY_OF_WEEK)-1;   
		int day=0;   
        
		int []info=new int[42];
	   //判断大月份  
	   if(month==1||month==3||month==5||month==7 
		 ||month==8||month==10||month==12)   
	   {   
		   day=31;   
	   }   
		 
	   //判断小月  
	   if(month==4||month==6||month==9||month==11)   
	   {   
		   day=30;   
	   }   
		 
	   //判断平年与闰年  
	   if(month==2)   
	   {   
		   if(((year%4==0)&&(year%100!=0))||(year%400==0))   
		   {   
			   day=29;   
		   }   
			 
		   else   
		   {   
			   day=28;   
		   }   
		}
		//System.out.println(mo[month-1]+" "+year);
		//System.out.println("Su Mo Tu We Th Fr Sa");
		//System.out.println(day);
		for(int i=1,n=1;i<=day+week;i++)   
	   {   
			if(i>week){
				info[i-1]=n;
				n++;
			}
			else{
				info[i-1]=0;
			}
			
	   }
		return	info;
	}	
}