import java.util.*;
import java.io.*;
public class ParseMethods {

    //****************************************************************************/
    //Method: main
    //Author: Wes
    //Description:
    //****************************************************************************/
	public static void main (String [] args)
	{
		String times = "";
		
		
		/*System.out.println("<mulop> tests");
		
		times = (mulop(" *   "))? "true" : "false";
		System.out.println("*: " + times);
		times = (mulop("/"))? "true" : "false";
		System.out.println("/: " + times);
		times = (mulop("%"))? "true" : "false";
		System.out.println("%: " + times);
		times = (mulop("helloworld"))? "true" : "false";
		System.out.println("helloworld: " + times);
		times = (mulop("("))? "true" : "false";
		System.out.println("(: " + times);
		
		System.out.println("");
		
		System.out.println("<addop> tests");
		
		times = (addop("  + "))? "true" : "false";
		System.out.println("+: " + times);
		times = (addop("-"))? "true" : "false";
		System.out.println("-: " + times);
		times = (addop("/"))? "true" : "false";
		System.out.println("/: " + times);
		times = (addop("whatup"))? "true" : "false";
		System.out.println("whatup: " + times);
		
		System.out.println("");
		
		System.out.println("<digit> tests");
		
		times = (digit("  0 "))? "true" : "false";
		System.out.println("0: " + times);
		times = (digit("8"))? "true" : "false";
		System.out.println("8: " + times);
		times = (digit("20"))? "true" : "false";
		System.out.println("20: " + times);
		times = (digit("whatup"))? "true" : "false";
		System.out.println("whatup: " + times);*/
		
		
		// Random char tests for <letter>
		
		/*String str = "hell";
		System.out.println(str.length());
		//String[] arr = str.split("");
		char c = str.charAt(0);
		System.out.println(c);
		//System.out.println((int) c);
		char a = 'A';
		System.out.println((int) a);
		a = 'B';
		System.out.println((int) a);
		a = 'Z';
		System.out.println((int) a);
		a = 'a';
		System.out.println((int) a);
		a = 'z';
		System.out.println((int) a);
		a = '_';
		System.out.println((int) a);
		
		System.out.println("<letter> tests:");
		
		times = (letter("  A "))? "true" : "false";
		System.out.println("A: " + times);
		times = (letter("Z"))? "true" : "false";
		System.out.println("Z: " + times);
		times = (letter("a"))? "true" : "false";
		System.out.println("a: " + times);
		times = (letter("z"))? "true" : "false";
		System.out.println("z: " + times);
		times = (letter("_"))? "true" : "false";
		System.out.println("_: " + times);
		times = (letter("&"))? "true" : "false";
		System.out.println("&: " + times);
		times = (letter("whatup"))? "true" : "false";
		System.out.println("whatup: " + times);*/
		
		
		//Random Integer shit
		
		/*String parseInt = "49988";
		char[] arr = new char[parseInt.length()];
		for (int i = 0; i < parseInt.length(); i++)
		{
			arr[i] = parseInt.charAt(i);
		}
		for (int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
		}
		StringTokenizer st = new StringTokenizer(parseInt);
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}*/
		
		/*
		System.out.println("<integer> tests:")
		times = (integer("  12 "))? "true" : "false";
		System.out.println("  1 2 : " + times);
		times = (integer("23"))? "true" : "false";
		System.out.println("23: " + times);
		times = (integer("2"))? "true" : "false";
		System.out.println("2: " + times);
		times = (integer("z"))? "true" : "false";
		System.out.println("z: " + times);
		times = (integer("_"))? "true" : "false";
		System.out.println("_: " + times);
		times = (integer("344j55"))? "true" : "false";
		System.out.println("344j55: " + times);
		times = (integer("34455"))? "true" : "false";
		System.out.println("34455: " + times);
		times = (integer("344.55"))? "true" : "false";
		System.out.println("344.55: " + times);*/
		
		
		/*System.out.println("<id> tests:");
		times = (id("  helloWorld "))? "true" : "false";
		System.out.println("  helloWorld : " + times);
		times = (id("hello5world"))? "true" : "false";
		System.out.println("hello5world: " + times);
		times = (id("hello/world"))? "true" : "false";
		System.out.println("hello/world: " + times);
		times = (id("4helloworld"))? "true" : "false";
		System.out.println("4helloworld: " + times);
		times = (id("A"))? "true" : "false";
		System.out.println("A: " + times);
		times = (id("5"))? "true" : "false";
		System.out.println("5: " + times);
		times = (id("A5"))? "true" : "false";
		System.out.println("A5: " + times);*/
		
		
		/*System.out.println("<factor> tests: ");
		
		times = (factor("A67"))? "true" : "false";
		System.out.println("A67: " + times);
		times = (factor("5"))? "true" : "false";
		System.out.println("5: " + times);
		times = (factor("-A5"))? "true" : "false";
		System.out.println("-A5: " + times);
		times = (factor("- 5h"))? "true" : "false";
		System.out.println("- 5h: " + times);
		times = (factor("-g4 5"))? "true" : "false";
		System.out.println("-g4 5: " + times);*/
		
		System.out.println("<term> test:");
		times = (term("A67"))? "true" : "false";
		System.out.println("A67: " + times);
		times = (term("5 * -3"))? "true" : "false";
		System.out.println("5 * -3: " + times);
		times = (term("hallo + world / 666"))? "true" : "false";
		System.out.println("hallo + world / 666: " + times);
		times = (term("-5h * hey % yo"))? "true" : "false";
		System.out.println("-5h * hey % yo: " + times);
		times = (term("-h5 * hey % yo"))? "true" : "false";
		System.out.println("-h5 * hey % yo: " + times);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	//****************************************************************************/
    //Method: mulop
    //Author: Wes
    //Description:
    //****************************************************************************/
	public static boolean mulop(String x)
	{
		// <mulop> -> * | / | %
		
		x = x.trim(); //trim leading and trailing whitespace
		
		
		//System.out.println(x);
		if (x.equals("*") || x.equals("/") || x.equals("%"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//****************************************************************************/
    //Method: addop
    //Author: Wes
    //Description:
    //****************************************************************************/
	public static boolean addop(String x)
	{
		// <addop> -> + | -
		
		//trim leading and trailing whitespace
		x = x.trim(); 
		
		if(x.equals("+") || x.equals("-"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
    //****************************************************************************/
    //Method: digit
    //Author: Wes
    //Description:
    //****************************************************************************/
	public static boolean digit(String x)
	{
		//<digit> -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
		
		//trim whitespace
		//x = x.trim(); //trim leading and trailing whitespace
		
		//System.out.println("Digit Test: " + x);
		
		if(x.equals("0") || x.equals("1") || x.equals("2") || x.equals("3") || 
		x.equals("4") || x.equals("5") || x.equals("6") || x.equals("7") || 
		x.equals("8") || x.equals("9"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
    //****************************************************************************/
    //Method: letter
    //Author: Wes
    //Description:
    //****************************************************************************/
	public static boolean letter(String x)
	{
		/*
		<letter>   ->  	A | B | C | D | E | F | G | H | I | J | K | L | M |
						N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
						a | b | c | d | e | f | g | h | i | j | k | l | m |
						n | o | p | q | r | s | t | u | v | w | x | y | z | _
						
		*/
		
		
		
		//x = x.trim(); //trim leading and trailing whitespace
		
		//System.out.println("Testing letter:" + x + ":");
		
		// a letter can only be one character and not a space
		if(x.length() > 1 || x.equals(" "))
		{
			
			return false;
		}
		else
		{
			char c = x.charAt(0); //convert to character
			int cnum = (int) c;   //convert to an int representing an ascii value
			// ASCII values: 65 - 90 (A-Z) , 97 - 122 (a - z) , 95 (_)
			if ((cnum > 64 && cnum < 91) || (cnum > 96 && cnum < 123) || cnum == 95)
			{
				return true;
			}
			else 
			{
				return false;
			}
			
		}

	}
	
    //****************************************************************************/
    //Method: integer
    //Author: Wes
    //Description:
    //****************************************************************************/
	public static boolean integer(String x)
	{
		//<integer> -> <digit> {<digit>}
		//			OR
		// <integer> -> <digit> | <digit> <integer>
		
		
		//x = x.trim(); //trim leading and trailing whitespace
		//System.out.println("Integer Test: " + x);
		
		if (x.length() == 1) //base case
		{
			return digit(x)? true: false;
		}
		else if(x.length() > 0) // recursive call
		{
			// the first character is a digit and the rest of the string is an integer
			if (digit(x.substring(0,1)) && integer(x.substring(1)))
			{
				return true;
			}
			else 
			{
				return false;
			}
			
		}
		else // length was 0
		{
			return false;
		}
		
	}

    //****************************************************************************/
    //Method: id
    //Author: Wes
    //Description:
    //****************************************************************************/
	public static boolean id(String x)
	{
		// <id> -> <letter> {<letter> | <digit>}
		
		x = x.trim(); //trim leading and trailing whitespace
		
		//System.out.println("Testing id:" + x);
		
		if (x.length() > 0)
		{
			if(letter(x.substring(0,1))) //first character is a letter
			{
				String x2 = x.substring(1);
				for (int i = 0; i < x2.length(); i++)
				{
					if(!letter(x2.substring(i,i+1)) && !digit(x2.substring(i,i+1)))
					{
						return false;
					}
				}
				return true;
			}
			else //first character is not a letter
			{
				return false;
			}
		}
		else // length of 0
		{
			return false;
		}
	}
	
	public static boolean factor(String x)
	{
		// <factor> -> <integer> | <float> | <id> | '(' <expr> ')' | [-] <factor>
		
		//TEMPORARY IMPLEMENTATION
		// <factor> -> <integer> | <id> | [-] <factor>
		
		
		
		x = x.trim();//trim leading and trailing whitespace
		
		//System.out.println("Testng factor:" + x);
		
		if (x.length() > 0)
		{
			// if the first char is a '-' then the rest of the string must match a factor
			if(x.substring(0,1).equals("-")) 
			{
				if(factor(x.substring(1)))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else if (integer(x) || id(x)) //no '-' then the whole strimg must match an integer or id
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else // String is empty somehow
		{
			return false;
		}
	}
	

    //****************************************************************************/
    //Method: term
    //Author: Wes
    //Description:
    //****************************************************************************/	
	public static boolean term(String x)
	{
		//<term> -> <factor> {<mulop> <factor>}
		//					OR
		//<term> -> <factor> | <term> <mulop> <factor>
		
		x = x.trim(); //trim leading and trailing whitespace
		
		
		//create a tokenizer thant splits on all mulops
		StringTokenizer st = new StringTokenizer(x, "*/%", true);
		
		if(st.countTokens() == 1) //must be only a factor if there are no multops
		{
			if(factor(x))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else // at least one mulop 
		{
			//create an array with a length of the amount of tokens 
			String[] arr = new String[st.countTokens()];
			
			//copy tokens into the array
			int count = 0;
			while (st.hasMoreTokens())
			{
				arr[count++] = st.nextToken();
			}
			
			//find the index of the last multop in the array
			int lastMulop = -1;
			for (int i = 0; i < arr.length; i++)
			{
				if(mulop(arr[i]))
				{
					lastMulop = i;
				}
				
			}
			
			
			//create an array for the expected term (everything before the last mulop)
			String[] termarr = Arrays.copyOfRange(arr, 0, lastMulop);
			
			// stuff the new term array into a string 
			String termcheck = "";
			for(int i = 0; i < termarr.length; i++)
			{
				termcheck += termarr[i];
			}
			//System.out.println ("Term: " + termcheck);
			
			// grab the alleged mulop
			String multop = arr[lastMulop];
			//System.out.println ("mulop: " + multop);
			
			// grab the contents of the last index for the factor
			String factorcheck = arr[lastMulop + 1];
			//System.out.println ("factor: " + factorcheck);
			
			if(term(termcheck) && mulop(multop) && factor(factorcheck))
			{
				return true;
			}
			else
			{
				return false;
			}
		
		}
		
		
	}

    //****************************************************************************/
    //Method: expr
    //Author: Jared
    //Description:
    //****************************************************************************/
	public static boolean expr( String x )
    {
        //expr -> <term> {<addop><term>}

        StringTokenizer st = new StringTokenizer(x, "+-", true);
        
        st.next
    }


    //****************************************************************************/
    //Method: 
    //Author: Wes
    //Description:
    //****************************************************************************/


}
