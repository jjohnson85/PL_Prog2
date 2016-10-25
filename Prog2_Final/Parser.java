//Parser//
import java.util.*;
import java.io.*;

class Parser
{
     /**
     * Main function for the Parser Class.                           (1)
     * <p>
     * Longer description. If there were any, it would be    (2)
     * here.
     * <p>
     * And even more explanations to follow in consecutive
     * paragraphs separated by HTML paragraph breaks.
     *
     * @param  variable Description text text text.          (3)
     * @return Description text text text.
     */
    public static void main( String [] args )
    {
        Scanner sc = new Scanner( System.in );
        String toParse = new String();
        Boolean result = new Boolean( false );
        


        while( sc.hasNextLine( ) )
        {
            toParse = sc.nextLine( );

            if( toParse.equals( "Q" ) )
            {
                return;
            }
            else
            {
                result = expr( toParse );
                System.out.println( "Result: " + result );
            }
        }
    }
    
    /**
     * expr method for tokenizing and parsing an expression.                           (1)
     * <p>
     * Longer description. If there were any, it would be    (2)
     * here.
     * <p>
     * And even more explanations to follow in consecutive
     * paragraphs separated by HTML paragraph breaks.
     *
     * @param  variable Description text text text.          (3)
     * @return Description text text text.
     */
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
                    token = lastToken.concat(token);
                    lastToken = token;
                    continue;
                }
            }
            
            //System.out.println(token);
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
    
    /**
     * factor method for parsing a factor.                           (1)
     * <p>
     * Longer description. If there were any, it would be    (2)
     * here.
     * <p>
     * And even more explanations to follow in consecutive
     * paragraphs separated by HTML paragraph breaks.
     *
     * @param  variable Description text text text.          (3)
     * @return Description text text text.
     */
    public static Boolean factor( String st )
    {
        
        if( st.startsWith("-") )
        {
            return factor( st.substring( 1, st.length() ));
        }
        else if( st.startsWith( "(") )
        {
            if( st.endsWith(")"))
            {
                return expr( st.substring(1, st.lastIndexOf(")")-1) );
            }
            else
            {
                return false;
            }
        }
        
        if( intgr(st) || flt(st) || id(st) )
        {
            return true;
        }
        
        return false;
    }
    
        /**
     * Short one line description.                           (1)
     * <p>
     * Longer description. If there were any, it would be    (2)
     * here.
     * <p>
     * And even more explanations to follow in consecutive
     * paragraphs separated by HTML paragraph breaks.
     *
     * @param  variable Description text text text.          (3)
     * @return Description text text text.
     */
    public static Boolean flt( String str )
    {
        StringTokenizer st = new StringTokenizer(str, ".", true);
        String inttoken = new String();
        String inttoken2 = new String( );
        
        while( st.hasMoreTokens() )
        {
            inttoken = st.nextToken();
            
            try
            {
                st.nextToken();
                inttoken2 = st.nextToken();
            }
            catch( Exception ex )
            {
                return false;
            }
        }
        
        if( integer(inttoken) && integer(inttoken2) )
        {
            return true;
        }
        return false;
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