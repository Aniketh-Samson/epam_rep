public class Interest
{
    public double SimpleInterest(int principle,int rate,int time)
    { 
	   return principle*rate*time/100;
    }
    public double CompoundInterest(int principle,int rate,int time)
    { 
	return principle *(Math.pow((1 + rate / 100),time));  
    }
}   
