package test;

public class Test {
	public static void main(String[] args)   
    {  
		String s1="/images/2017_8_23_20_7_46_375_52.jpg,/images/2017_8_23_20_7_46_375_52.jpg,/images/2017_8_23_20_7_46_375_52.jpg";
        int index = 0;  
        int count = 0;  
        while((index = s1.indexOf(",",index))!=-1)  
        {  
      
            index = index + ",".length();  
            count++;  
        }  
        System.out.println("@@@@"+count);
//        int count = getCount(s1,s2);  
//        int count2 = getCount2(s1,s2);  
//        System.out.println("count = "+count);  
//        System.out.println("count2 = "+count2);  
  
    }  
  
    /*第一种方法 
    获取abc字符串在整个字符串中出现的次数。 
    "wabcerabctyabcuiabcabcqq" 
    */  
    public static int getCount(String str,String sub)  
    {  
        int index = 0;  
        int count = 0;  
        while((index = str.indexOf(sub,index))!=-1)  
        {  
      
            index = index + sub.length();  
            count++;  
        }  
        return count;  
    }  
          /*第二种方法*/  
    public static int getCount2(String str,String sub)  
    {  
        int index = 0;  
        int count = 0;  
  
        while((index=str.indexOf(sub))!=-1)  
        {  
            str = str.substring(index+sub.length());  
            count++;  
        }  
        return count;  
    }  
}  

