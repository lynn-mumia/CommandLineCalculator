	public class CommandLineCalculator{
	  public static void main(String[]args){
		if(args[0].equals("add")){
		  double one=Double.parseDouble(args[1]);
		  double two=Double.parseDouble(args[2]);
		  System.out.print(one+two);
		  System.out.print("");
		}    
		else if(args[0].equals("subtract")){
		  double one=Double.parseDouble(args[1]);
		  double two=Double.parseDouble(args[2]);
		  System.out.print(one-two);
		}
		else if(args[0].equals("multiply")){
		  double one=Double.parseDouble(args[1]);
		  double two=Double.parseDouble(args[2]);
		  System.out.print(one*two);
		}
		}
	  }
	}