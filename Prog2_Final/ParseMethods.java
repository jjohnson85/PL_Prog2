import java.util.*;
import java.io.*;
/**
* <p>
* The ParseMethods program implements a recursive decent parser that
* examines a user provided string and determines if it is
* a valid expression in the language defined by the following grammar:
* <br>
* {@literal <expr> -> <term> { <addop> <term>}}<br>
* {@literal <term> -> <factor> {<mulop> <factor>} } <br>
* {@literal <factor> -> <integer> | <float> | <id> | '(' <expr> ')' | [-] <factor> } <br>
* {@literal <integer> -> <digit> {<digit>} } <br>
* {@literal <float> -> <integer> . <integer> } <br>
* {@literal <id> -> <letter> {<letter> | <digit>} } <br>
* {@literal <letter> -> A | B | C | D | E | F | G | H | I | J | K | L | M | } <br>
* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
*	          {@literal N | O | P | Q | R | S | T | U | V | W | X | Y | Z | } <br>
* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
*	          {@literal a | b | c | d | e | f | g | h | i | j | k | l | m | } <br>
* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
*	          {@literal n | o | p | q | r | s | t | u | v | w | x | y | z | _ } <br>
* {@literal <digit> -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 } <br>
* {@literal <addop> -> + | - } <br>
* {@literal <mulop> -> * | / | % } <br><br>
* Examples of BNF (recursive) rules:<br>
* {@literal <expr> -> <term> | <expr> <addop> <term> } <br>
* {@literal <term> -> <factor> | <term> <mulop> < factor> } <br>
* etc.
* </p>
* @author  Wesley Adams
* @author  Jared Johnson
* @version 1.0 
*/
public class ParseMethods {

    /**
    * The main method eveluates expressions until an empty string is entered.<br>
    * If the show tokens mode is specified with a command line argument of '-t' then 
    * a list of tokens for each expression will be displayed.<br>
    * Author: Wesley Adams
    *
    * 
    * @param args An array of the command line arguments
    */
    public static void main (String [] args)
    {
        //*********************************************************************************
        Scanner input = new Scanner(System.in);
        String exp = "";
        while(true)
        {
            System.out.print("Enter an expression: ");
            exp = input.nextLine();

            if(exp.equals("") || exp.matches("\\s+"))
            {
                System.out.println("(end of input)");
                break;
            }

            if(expr(exp))
                System.out.println( "\"" + exp + "\" is an expression\n");
            else
                System.out.println("\"" + exp + "\" is not an expression\n");

            if (args.length > 0 && args[0].equals("-t"))
            {
                StringTokenizer st = new StringTokenizer(exp, "+-/%*() ", true);
                System.out.print("Tokens:[ ");
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
                System.out.println(" ]\n");
            }
        }
        //*********************************************************************************
    }
	
    /**
    * This method evaluates if a string is a mulop.<br>
    * Author: Wesley Adams<br><br>
    * mulop:<br>
    * {@literal <mulop> -> * | \ | %}
    * @param x The string to be evaluated
    * @return boolean : This returns true if x is a mulop and false otherwise
    * 
    */
    public static boolean mulop(String x)
    {
        // <mulop> -> * | / | %

        x = x.trim(); //trim leading and trailing whitespace
        return (x.equals("*") || x.equals("/") || x.equals("%"));
    }

    /**
    * This method evaluates if a string is an addop.<br>
    * Author: Wesley Adams<br><br>
    * addop:<br>
    * {@literal <addop> -> - | +}
    * @param x - The string to be evaluated
    * @return boolean: This returns true if x is an addop and false otherwise
    * 
    */
    public static boolean addop(String x)
    {
        // <addop> -> + | -

        x = x.trim(); 
        return (x.equals("+") || x.equals("-"));
    }
	
    /**
    * This method evaluates if a string is a digit.<br>
    * Author: Wesley Adams<br><br>
    * digit:<br>
    * {@literal <digit> -> 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 } 
    * @param x The string to be evaluated
    * @return boolean: This returns true if x is a digit and false otherwise
    * 
    */
    public static boolean digit(String x)
    {
            //<digit> -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
        
            return(x.equals("0") || x.equals("1") || x.equals("2") || x.equals("3") || 
            x.equals("4") || x.equals("5") || x.equals("6") || x.equals("7") || 
            x.equals("8") || x.equals("9"));

    }
	
    /**
    * This method evaluates if a string is a letter.<br>
    * Auhtor: Wesley Adams<br><br>
    * letter:<br>
    * {@literal <letter> -> A | B | C | D | E | F | G | H | I | J | K | L | M | } <br>
    * &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    *	          {@literal N | O | P | Q | R | S | T | U | V | W | X | Y | Z | } <br>
    * &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    *	          {@literal a | b | c | d | e | f | g | h | i | j | k | l | m | } <br>
    * &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    *	          {@literal n | o | p | q | r | s | t | u | v | w | x | y | z | _ } <br>
    * @param x The string to be evaluated
    * @return boolean: This returns true if x is a letter and false otherwise
    * 
    */
    public static boolean letter(String x)
    {
        /*
        <letter>   ->  	A | B | C | D | E | F | G | H | I | J | K | L | M |
                                        N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
                                        a | b | c | d | e | f | g | h | i | j | k | l | m |
                                        n | o | p | q | r | s | t | u | v | w | x | y | z | _

        */

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
	
    /**
    * This  recursive method evaluates if a string is an integer.<br>
    * Author: Wesley Adams<br><br>
    * integer:<br>
    * {@literal <integer> -> <digit> {<digit>} }<br><br>
    * digit (recursive/BNF): <br>
    *{@literal <integer> -> <digit> | <digit> <integer>}
    * @param x The string to be evaluated
    * @return boolean: This returns true if x is a integer and false otherwise
    * 
    */
    public static boolean integer(String x)
    {
        //<integer> -> <digit> {<digit>}
        //			OR
        // <integer> -> <digit> | <digit> <integer>



        if (x.length() == 1) //base case
        {
                return digit(x);
        }
        else if(x.length() > 0) // recursive call
        {
                // the first character is a digit and the rest of the string is an integer
                return (digit(x.substring(0,1)) && integer(x.substring(1)));

        }
        else // length was 0
        {
                return false;
        }
    }
	
    /**
    * This method evaluates if a string is an id.<br>
    * Author: Wesley Adams<br><br>
    * id:<br>
    * {@literal <id> -> <letter> {<letter> | <digit> } }<br>
    * @param x The string to be evaluated
    * @return boolean: This returns true if x is an id and false otherwise
    * 
    */
    public static boolean id(String x)
    {
        // <id> -> <letter> {<letter> | <digit>}
        x = x.trim(); //trim leading and trailing whitespace

        if (x.length() > 0)
        {
            if(letter(x.substring(0,1))) //first character is a letter
            {
                String xTail = x.substring(1); // index 1 to length - 1
                for (int i = 0; i < xTail.length(); i++)
                {
                    if(!letter(xTail.substring(i,i+1)) && !digit(xTail.substring(i,i+1)))
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

    /**
    * This method evaluates the factor rewrite rule.<br>
    * Author: Jared Johnson<br><br>
    * factor:<br>
    * {@literal <factor> -> <id> | <integer> | <float> | '('<expr>')' | [-]<factor> <br><br>}
    *
    * @param st The string to be evaluated
    * @return boolean: This returns true if x is a factor and false otherwise
    * 
    */
    public static boolean factor( String st )
    {
        st = st.trim();
        if( st.startsWith("-") )
        {
            return factor( st.substring( 1, st.length() ));
        }
        else if( st.startsWith( "(") )
        {
            if( st.endsWith(")"))
            {
                String test = st.substring(1, st.length()-1);

                //nothing inside parenthesies
                if(test.length() < 1)
                {
                        return false;
                }
                return expr( test );
            }
            else
            {
                return false;
            }
        }
        
        if( integer(st) || isfloat(st) || id(st) )
        {
			
            return true;
        }
        
        return false;
    }
	
    /**
    * This recursive method evaluates if a string is a term.<br>
    * Author: Wesley Adams<br><br>
    * term:<br>
    * {@literal <term> -> <factor> {<mulop> <factor>} } <br><br>
    * term (recursive/BNF): <br>
    *{@literal <term> -> <factor> | <term> <mulop> <factor>}
    * @param x The string to be evaluated
    * @return boolean: This returns true if x is a term and false otherwise
    * 
    */
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
            else //treat parenthesised expressions as single tokens
            {
                // Form the entire parenthesised expression
                String newToken = "";

                int parenCount = 0;
                while (true)
                {
                    parenCount += count(token, '(');
                    parenCount -= count(token, ')');

                    //concatonate each token
                    newToken += token;

                    //if parenCount has a net of 0, the newToken is complete
                    //if there are no more tokens, the newToken is complete
                    if (parenCount == 0 || !st.hasMoreTokens())
                    {
                        stList.add(newToken);
                        break;
                    }

                    token = st.nextToken();
                }
            }
        }


        // convert list into array
        String[] arr = new String[stList.size()];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = stList.get(i);
        }

        if(arr.length == 1) //must be only a factor if there are no multops 
        {
            return factor(x);
        }
        else // at least one mulop 
        {
            //find the index of the last multop in the array. Right side derivation
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


            // grab the alleged mulop
            String multop = arr[lastMulop];


            // if the lastMulop is the last in the array, there is no factor
            if (lastMulop == arr.length - 1)
                return false;

            // grab the contents of the last index for the factor
            String factorcheck = arr[lastMulop + 1];

            return (term(termcheck) && mulop(multop) && factor(factorcheck));
        }
    }
	
    /**
    * This method evaluates the float rewrite rule.<br>
    * Author: Jared Johnson<br><br>
    * term:<br>
    * {@literal <float> -> <integer> '.' <integer>} <br><br>
    * @param st The string to be evaluated
    * @return boolean: This returns true if x is a float and false otherwise
    * 
    */
    public static boolean isfloat( String st )
    {
        StringTokenizer sto = new StringTokenizer(st, ".", true);
        String inttoken = new String();
        String inttoken2 = new String( );
        while( sto.hasMoreTokens() )
        {
            inttoken = sto.nextToken();
            
            try
            {
                sto.nextToken();
                inttoken2 = sto.nextToken();
            }
            catch( Exception ex )
            {
                return false;
            }
        }
        return (integer(inttoken) && integer(inttoken2));
    }

    /**
    * This method evaluates the expr rewrite rule.<br>
    * Author: Jared Johnson<br><br>
    * term:<br>
    * {@literal <expr> -> <term> {<addop> <term>} } <br><br>
    * term (recursive/BNF): <br>
    * {@literal <expr> -> <term> | <expr> <addop> <term>}
    * @param x The string to be evaluated
    * @return boolean: This returns true if x is a term and false otherwise
    * 
    */
    public static boolean expr( String x )
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
        
        //Build groups of tokens that fall between parenthesis
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

        //Reset concat flag and get first token for '-' & mulop handling
        concatNext = false;
        token = stQueue.poll();
        token = token.trim();
        
        //If we have a negative or if our token ends with a mulop
        //begin building a group for term evaluation
        if(token.equals("-") || token.endsWith("*") || 
            token.endsWith( "/") || token.endsWith("%"))
        {
            concatNext = true;
            lastToken = token;
        }
        else
        {
            stParseQueue.add(token);
            lastToken = token;
        }
        
        //If we have an empty queue at this point, simply evaluate the last
        //token as a term
        if( stQueue.isEmpty() )
        {
            stParseQueue.add(token);
            return term(token);
        }
        
        //Check the rest of the tokens in the queue
        //Add constructed groups to a parse queue for final
        //parsing with the rewrite rules term and addop
        while( !stQueue.isEmpty() )
        {
            token = stQueue.poll();
            token = token.trim();
            
            //Ignore empty string that may have
            //appeared during the tokenization and trimming process
            if( token.equals(""))
            {
                if( !stQueue.isEmpty( ) )
                {
                    continue;
                }
            }

            if( concatNext == true )
            {
                token = lastToken.concat(token);
                lastToken = token;
                concatNext = false;
            }
            
            
            if( token.endsWith("-") )
            {
                if( lastToken.endsWith("-") || lastToken.endsWith("+") )
                {
                    concatNext = true;
                    lastToken = token;
                    
                    if( !stQueue.isEmpty() )
                    {
                        continue;
                    }
                }
                else if( lastToken.endsWith("*") || lastToken.endsWith("/") ||
                         lastToken.endsWith("%"))
                {
                    concatNext = true;
                    token = lastToken.concat(token);
                    lastToken = token;
                    
                    if( !stQueue.isEmpty() )
                    {
                        continue;
                    }
                }
            }
            
            if( token.endsWith("*") || token.endsWith("/") ||
                token.endsWith("%") )
            {
                if( !stQueue.isEmpty( ))
                {
                    continue;
                }
            }

            lastToken = token;
            stParseQueue.add(token);
        }
        
        	
        //Test first item from parse queue as a term
        token = stParseQueue.poll();
        if( !term(token))
        {
            return false;
        }
        
        //Test addop and term as repeating pairs
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
        }
        
        return true;
    }
	
    /**
    * This method counts the occurances of a character in a string.<br>
    * Author: Jared Johnson<br><br>
    * 
    * @param st The string to be examined
    * @param c The character to be counted
    * @return int: This returns the count of the characters c in the string st
    * 
    */
    public static int count( String st, char c )
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