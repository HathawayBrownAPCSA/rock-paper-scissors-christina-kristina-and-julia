
/**
 * Write a description of class RPSMatch here.
 *
 * @Christina Bencin
 * @version 21.10.06
 */
public class RPSMatch
{
    //constructor
    private int hWins;
    private int cWins;
    private int ties;
    private int hPlay;
    private int cPlay;
    private int x; 
    private int cheating;
    private int result;
    
    public RPSMatch()
    {
        hWins = 0;
        cWins = 0;
        ties = 0;
    }
    
    //accessor
    public void setHumanPlay(int humanPlay)
    {
      hPlay = humanPlay;
      
    }
    
    public String getComputerPlay()
    {
        cheating = (int)(Math.random()*9);
        if (cheating >= 2)
        {
           if (hPlay == 0)
            {
                cPlay = 1;
            }
            else if (hPlay == 1)
            {
                cPlay = 2;
            }
            else
            {
                x = (int)(Math.random()*3);
                result = x;
                if (x == 0)
                {
                    return "Rock";
                }
                else if (x ==1)
                {
                    return "Paper";                
                }
                else 
                {
                    return "Scissors";
                }
            }
        }
        else
        {
            x = (int) (Math.random()*3);
            cPlay = x;
            if (cPlay == 0)
                {
                    return "Rock";
                }
            else if (cPlay ==1)
            {
                return "Paper";                
            }
            else 
            {
                return "Scissors";
            }
        }
        return " ";
    }   
    
    public String getResult()
    {
        if (hPlay == cPlay)
        {
            ties ++;
            return "Tied";
        }
        else if (hPlay == 0 && cPlay == 1)
        {
            cWins ++;
            return "I win!";
        }
        else if (hPlay == 0 && cPlay == 2)
        {
            hWins ++;
            return "You win!";
        }
        else if (hPlay == 1 && cPlay == 2)
        {
            cWins++;
            return "I win!";
        }
        else if (hPlay == 1 && cPlay == 0)
        {
            hWins++;
            return "You win!";
        }
        else if (hPlay == 2 && cPlay == 0)
        {
            cWins++;
            return "I win!";
        }
        else 
        {
            hWins++;
            return "I win!";
        }
    }
    
    public int getHumanWins()
    {
        return hWins;
    }
    
    public int getComputerWins()
    {
        return cWins;
    }
    
    public int getTies()
    {
        return ties;
    }
}

   