// C. Check if the input is pangram or not.(Pangram is a sentence that contains all the alphabet from a-z)

class PangramString
{  
public static void containAllLetters(String string)  
{    
string = string.toLowerCase();  
boolean allLetterPresent = true;   
for (char ch = 'a'; ch <= 'z'; ch++)   
{   
if (!string.contains(String.valueOf(ch)))   
{  
allLetterPresent = false;  
break;  
}  
}   
if (allLetterPresent)   
System.out.println("String is Pangram");  
else   
System.out.println("String is not a Pangram");  
}  
public static void main(String args[])  
{  
String string = "Abcdefghijklmnopqrstuvwxyz12";  
containAllLetters(string);  
}  
} 













