import java.util.*;
import java.io.*;
public class ParseMethods {

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
		
		/*System.out.println("<term> test:");
		times = (term("A67"))? "true" : "false";
		System.out.println("A67: " + times);
		times = (term("5 * -3"))? "true" : "false";
		System.out.println("5 * -3: " + times);
		times = (term("hallo + world / 666"))? "true" : "false";
		System.out.println("hallo + world / 666: " + times);
		times = (term("-5h * hey % yo"))? "true" : "false";
		System.out.println("-5h * hey % yo: " + times);
		times = (term("-h5 * hey % yo"))? "true" : "false";
		System.out.println("-h5 * hey % yo: " + times);*/
		
		
		
		/*System.out.println("<float> tests:");
		
		times = (isfloat("344j55"))? "true" : "false";
		System.out.println("344j55: " + times);
		times = (isfloat("34455"))? "true" : "false";
		System.out.println("34455: " + times);
		times = (isfloat("344.55"))? "true" : "false";
		System.out.println("344.55: " + times);*/
		
		
		// User Input loop to test <term>
		
		//*********************************************************************************
		/*Scanner input = new Scanner(System.in);
		String again = "";
		String exp = "";
		while(true)
		{
			System.out.print("Enter an expression: ");
			exp = input.nextLine();
			System.out.println("");
			System.out.print(exp + ": ");
			System.out.println("");
			if(term(exp))
				System.out.println(" is an expression");
			else
				System.out.println(" is not an expression");
			
			
			
			
			System.out.println("again? (y/n)");
			again = input.nextLine();
			if(again.equals("n"))
				break;
			
		}*/
		//*********************************************************************************
		
		
		
		//*********************************************************************************
		Scanner input = new Scanner(System.in);
		String again = "";
		String exp = "";
		while(true)
		{
			System.out.print("Enter an expression: ");
			exp = input.nextLine();
			System.out.println("");
			
			if(expr(exp))
				System.out.println( "[" + exp + " is an expression]");
			else
				System.out.println("[" + exp + " is not an expression]");
			
			
			//TOKENS
			/*for (int i = 0; i < args.length; i++)
				System.out.println("args[" + i + "]: " +  args[i]);*/
		
			if (args.length > 0 && args[0].equals("-t"))
			{
				StringTokenizer st = new StringTokenizer(exp, "+-/%*() ", true);
				System.out.println("Tokens: ");
				while(st.hasMoreTokens())
				{
					String token = st.nextToken();
					if (!token.equals(" "))
					{
						System.out.print(token);
						if(st.hasMoreTokens())
						{
							System.out.print(" , ");
						}
					}
				}
				
				
			}
			
			System.out.println("\nagain? (y/n)");
			again = input.nextLine();
			if(again.equals("n"))
				break;
			
		}
		//*********************************************************************************
		
		
		//System.out.println(term("B* (C+ (C+B*A) ) / 6")? "yes": "no");
	}
	
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
		
		
		
		x = x.trim();//trim leading and trailing whitespace
		
		//System.out.println("Testng factor:" + x);
		
		if (x.length() > 0)
		{
			// if the first char is a '-' then the rest of the string must match a factor
			if(x.substring(0,1).equals("-")) 
			{
				return factor(x.substring(1));
			}
			else if(x.substring(0,1).equals("("))
			{
				if(x.substring(x.length() - 1).equals(")"))
				{
					String sub = x.substring(1, x.length() - 1);
					
					//nothing inside parenthesies
					if (sub.length() < 1)
					{
						return false;
					}
					
					
					return expr(sub);
				}
				else // no closing parenthesis
				{
					return false;
				}
			}
			else if (integer(x) || id(x) || isfloat(x)) //no '-' then the whole strimg must match an integer or id
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
	
	
	public static boolean term(String x)
	{
		//<term> -> <factor> {<mulop> <factor>}
		//					OR
		//<term> -> <factor> | <term> <mulop> <factor>
		
		x = x.trim(); //trim leading and trailing whitespace
		
		
		//create a tokenizer thant splits on all mulops
		StringTokenizer st = new StringTokenizer(x, "*/%", true);
			String token = "";
			LinkedList<String> stList = new LinkedList<String>();
			
		while(st.hasMoreTokens())
		{
			token = st.nextToken();
			//System.out.println(token);
			if (!token.contains("("))
			{
				stList.add(token);
			}
			else
			{
				String newToken = "";
				int parenCount = 0;
				while (true)
				{
					parenCount += count(token, '(');
					parenCount -= count(token, ')');
					newToken += token;
					if (parenCount == 0 || !st.hasMoreTokens())
					{
						stList.add(newToken);
						break;
					}
					token = st.nextToken();
				}
			}
		}
			
		
		String[] arr = new String[stList.size()];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = stList.get(i);
		}
		
		//((?<=;)|(?=;))
		//String[] arr = x.split("((?<=([\\*/%]+(?![^\\(]*\\))))|(?=([\\*/%]+(?![^\\(]*\\))))))//[\\*/%]+(?![^\\(]*\\)");
		
		
		
		System.out.println("evaluating term: [");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("]");
		
		
		if(arr.length == 1) //must be only a factor if there are no multops ARR.LENGTH
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
			//String[] arr = new String[st.countTokens()]; //DELETE
			
			//copy tokens into the array
			/*int count = 0;
			while (st.hasMoreTokens())
			{
				arr[count++] = st.nextToken();
			}*/
			
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
			
			// no term before mulop
			if (termarr.length == 0)
				return false;
			
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
			
			// no factor
			if (lastMulop == arr.length - 1)
				return false;
			
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
	
	public static boolean isfloat(String x)
	{
		// <float> -> <integer> . <integer>
		
		if(x.contains("."))
		{		
			//split on '.' ( must escape because split takes a regex expression)
			String[] parts = x.split("\\.");
			
			// more than one '.' not allowed
			if (parts.length > 2)
			{
				return false;
			}
			else
			{
				// strings before and after period must be integers
				if (integer(parts[0]) && integer(parts[1]))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		else // no period
		{
			return false;
		}
		
	}
	
	// WES
	/*public static boolean expr(String x)
	{
		//<expr> -> <term> { <addop> <term>}
		//				OR
		//<expr> -> <term> | <expr> <addop> <term>
		
		StringTokenizer st = new StringTokenizer(x, "[+-\\(\\),]", true);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		//[+-]+(?![^\\(]*\\))
		String[] arr = x.split("((?<=([\\+-]+(?![^\\(]*\\))))|(?=([\\+-]+(?![^\\(]*\\)))))");
		//((?<=([+-]+(?![^\\(]*\\))))|(?=([+-]+(?![^\\(]*\\)))))
		System.out.println("evaluating expr: [");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("]");
		
		if (arr.length == 1) //only one means term
		{
			if(term(x))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			int lastAddop = -1;
			for (int i = 0; i < arr.length; i++)
				{
					if(addop(arr[i]))
					{
						lastAddop = i;
					}
					
				}
				
				String[] exprarr = Arrays.copyOfRange(arr, 0, lastAddop);
				
			// no expr before mulop
			if (exprarr.length == 0)
				return false;
			
			// stuff the new expr array into a string 
			String exprcheck = "";
			for(int i = 0; i < exprarr.length; i++)
			{
				exprcheck += exprarr[i];
			}
			//System.out.println ("Expr: " + exprcheck);
			
			// grab the alleged addop
			String addopcheck = arr[lastAddop];
			//System.out.println ("mulop: " + multop);
			
			// no term
			if (lastAddop == arr.length - 1)
				return false;
			
			// grab the contents of the last index for the term
			String termcheck = arr[lastAddop + 1];
			//System.out.println ("term: " + termcheck);
			
			if(expr(exprcheck) && addop(addopcheck) && term(termcheck))
			{
				return true;
			}
			else
			{
				return false;
			}
				
		}
		
	}*/
	
	
	//HALF JARED HALF WES
	/*public static Boolean expr( String x )
    {
        StringTokenizer st = new StringTokenizer(x, "+-", true);
        StringTokenizer db = new StringTokenizer(x, "+-", true);
        
        Queue<String> stParseQueue = new LinkedList<String>();
        Queue<String> stQueue = new LinkedList<String>();
        
        String token = new String( );
        String lastToken = new String( );
        Integer count = new Integer(0);
        Integer parenCount = new Integer(0);
        
        Boolean concatNext = new Boolean(false);
        
        //debug
        while( db.hasMoreTokens() ){ System.out.println(db.nextToken());}
        //enddebug
        
        //handle parethesis token work
        while( st.hasMoreTokens() )
        {
            token = st.nextToken( );
            

            
            if( token.contains("("))
            {
                parenCount += count( token, '(');
            }
            
            if( token.contains(")") )
            {
                parenCount -= count( token, ')');
            }
            
            if( concatNext )
            {
                token = lastToken.concat(token);
            }
            
            if( parenCount != 0 )
            {
                concatNext = true;
                lastToken = token;
            }
            else
            {
                concatNext = false;
            }
            
            lastToken = token;
            if( parenCount == 0 || !st.hasMoreTokens() )
            {
                stQueue.add(token);
            }
        }
        
        
        System.out.println( "---------------------------------------------");
        concatNext = false;
        //handle "-"'s that are signs rather that operators
        token = stQueue.poll();
        //System.out.println("Debug "+token);
        if(token.equals("-"))
        {
            concatNext = true;
            lastToken = token;
        }
        else
        {
            stParseQueue.add(token);
            lastToken = token;
        }
        
        //System.out.println(concatNext);
        while( !stQueue.isEmpty() )
        {
            token = stQueue.poll();
            token = token.trim();
            if( token.equals(""))
            {
                //System.out.println( "nope");
                continue;
            }
            //System.out.println("Debug" +concatNext);
            //System.out.println("Debug "+token);

            if( concatNext == true )
            {
                token = lastToken.concat(token);
                lastToken = token;
                concatNext = false;
            }
            
            if( token.equals("-") )
            {
                //System.out.println("Got here");
                if( lastToken.endsWith("-") || lastToken.endsWith("+") )
                {
                    concatNext = true;
                    lastToken = token;
                    continue;
                }
                else if( lastToken.endsWith("*") || lastToken.endsWith("/") ||
                         lastToken.endsWith("%"))
                {
                    concatNext = true;
                    //token = lastToken.concat(token);
                    lastToken = token;
                    continue;
                }
            }
            
            
            lastToken = token;
            stParseQueue.add(token);
        }
        // *******************************************************************************************
        //pop fist
        String[] arr = new String[stParseQueue.size()];
		int read = 0;
        while( !stParseQueue.isEmpty() )
        {
            token = stParseQueue.poll( );
            System.out.println(token);
			arr[read] = token;
			read++;
        }
		System.out.println("arr length: " + arr.length);
		
        if (arr.length <= 1)
		{
			return term(arr[0]);
		}
		else
		{
			int lastAddop = -1;
			for (int i = 0; i < arr.length; i++)
				{
					if(addop(arr[i]))
					{
						lastAddop = i;
					}
					
				}
				
				String[] exprarr = Arrays.copyOfRange(arr, 0, lastAddop);
				
			// no expr before mulop
			if (exprarr.length == 0)
				return false;
			
			// stuff the new expr array into a string 
			String exprcheck = "";
			for(int i = 0; i < exprarr.length; i++)
			{
				exprcheck += exprarr[i];
			}
			//System.out.println ("Expr: " + exprcheck);
			
			// grab the alleged addop
			String addopcheck = arr[lastAddop];
			//System.out.println ("mulop: " + multop);
			
			// no term
			if (lastAddop == arr.length - 1)
				return false;
			
			// grab the contents of the last index for the term
			String termcheck = arr[lastAddop + 1];
			//System.out.println ("term: " + termcheck);
			
			if(expr(exprcheck) && addop(addopcheck) && term(termcheck))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		// *************************************************************************************
        
    }*/
	
	
	//JAREDS COMPLETE
	 public static Boolean expr( String x )
    {
        StringTokenizer st = new StringTokenizer(x, "+-", true);
        StringTokenizer db = new StringTokenizer(x, "+-", true);
        
        Queue<String> stParseQueue = new LinkedList<String>();
        Queue<String> stQueue = new LinkedList<String>();
        
        String token = new String( );
        String token2 = new String( );
        String lastToken = new String( );
        Integer count = new Integer(0);
        Integer parenCount = new Integer(0);
        
        Boolean concatNext = new Boolean(false);
        
        //debug
        while( db.hasMoreTokens() ){ System.out.println(db.nextToken());}
        //enddebug
        
        //handle parethesis token work
        while( st.hasMoreTokens() )
        {
            token = st.nextToken( );
            

            
            if( token.contains("("))
            {
                parenCount += count( token, '(');
            }
            
            if( token.contains(")") )
            {
                parenCount -= count( token, ')');
            }
            
            if( concatNext )
            {
                token = lastToken.concat(token);
            }
            
            if( parenCount != 0 )
            {
                concatNext = true;
                lastToken = token;
            }
            else
            {
                concatNext = false;
            }
            
            lastToken = token;
            if( parenCount == 0 || !st.hasMoreTokens() )
            {
                stQueue.add(token);
            }
        }
        
        
        System.out.println( "---------------------------------------------");
        concatNext = false;
        //handle "-"'s that are signs rather that operators
        token = stQueue.poll();
        System.out.println("Debug "+token);
        if(token.equals("-"))
        {
            concatNext = true;
            lastToken = token;
        }
        else
        {
            stParseQueue.add(token);
            lastToken = token;
        }
        
        //System.out.println(concatNext);
        while( !stQueue.isEmpty() )
        {
            token = stQueue.poll();
            token = token.trim();
            if( token.equals(""))
            {
                //System.out.println( "nope");
                continue;
            }
            //System.out.println("Debug" +concatNext);
            //System.out.println("Debug "+token);

            if( concatNext == true )
            {
                token = lastToken.concat(token);
                lastToken = token;
                concatNext = false;
            }
            
            if( token.equals("-") )
            {
                //System.out.println("Got here");
                if( lastToken.endsWith("-") || lastToken.endsWith("+")  )
                {
                    concatNext = true;
                    lastToken = token;
                    continue;
                }
                else if( lastToken.endsWith("*") || lastToken.endsWith("/") ||
                         lastToken.endsWith("%"))
                {
                    concatNext = true;
                    token = lastToken.concat(token);
                    lastToken = token;
                    continue;
                }
            }
            
            System.out.println(token);
            lastToken = token;
            stParseQueue.add(token);
        }
        
        //pop fist
        token = stParseQueue.poll();
        if( !term(token))
        {
            return false;
        }
        
        while( !stParseQueue.isEmpty() )
        {
            token = stParseQueue.poll( );
            
            try
            {
                token2 = stParseQueue.poll( );
            }
            catch( Exception ex )
            {
                return false;
            }
            
            if( !addop(token) || !term(token2) )
            {
                return false;
            }
            System.out.println(token);
            System.out.println(token2);
        }
        
        return true;
    }
	
	public static Integer count( String st, char c )
    {
        Integer i = new Integer(0);
        Integer count = new Integer(0);
        
        for(i = 0; i < st.length(); i++)
        {
            
            if( st.charAt(i) == c )
            {
                count++;
            }
        }
        return count;
    }


}