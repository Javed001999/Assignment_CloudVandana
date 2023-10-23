// B. Enter a Roman Number as input and convert it to an integer.(ex IX=9)

import java.util.HashMap;
class RomanToInteger
{
public static void main(String args[])
{
String romanNum="XII";
int result=convertNum(romanNum);
System.out.println("Roman number "+romanNum+" = "+result);
}
public static int convertNum(String str)
	{
	HashMap<Character,Integer> rm=new HashMap<>();
	rm.put('I',1);
	rm.put('V',5);
	rm.put('X',10);
	rm.put('L',50);
	rm.put('C',100);
	rm.put('D',500);
	rm.put('M',1000);
	
	int result=0;
	int preVal=0;
	for(int i=str.length()-1;i>=0;i--)
	{
	int currentVal=rm.get(str.charAt(i));
	if(currentVal<preVal)
		{
		result-=currentVal;
		}
	else
		{
		result+=currentVal;
		}
	preVal=currentVal;
	} 
	return result;
	}
}


















