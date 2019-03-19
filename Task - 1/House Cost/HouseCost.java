public class HouseCost
{	
	public double estimate(char material,double area, boolean auto) {
		int cost = 0;
		if(material =='A')
			cost = 1200;
		else if(material =='B')
			cost = 1500;
		else if(material =='C')
			cost = 1800;
		else if(material =='C' && auto)
			cost = 2500;
		 
		return area*cost;
	}
}