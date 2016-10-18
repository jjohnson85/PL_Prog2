import java.util.*;
import java.io.*;

class TokenTest
{
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
    
    public static Boolean expr( String x )
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
        
        while( !stParseQueue.isEmpty() )
        {
            token = stParseQueue.poll( );
            System.out.println(token);
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
    
    public static Boolean factor( String st )
    {
        if( st.startsWith("-") )
        {
            
        }
        return true;
    }
}