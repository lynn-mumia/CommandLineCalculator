public class Calc{
 
  public static void main(String[] args){
  
  String symbol = args[0];
  double num1 = Integer.parseInt(args[1]);
  double num2 = Integer.parseInt(args[2]);

if(symbol.equals("add")){
  System.out.println();
  System.out.println(" ***********Simple calculator********");
System.out.println("The sum is " + (num1 + num2));
   }
   if(symbol.equals("subtract")){
  System.out.println();
  System.out.println(" ***********Simple calculator********");
System.out.println("The difference is " + (num1 - num2));
   }
   }