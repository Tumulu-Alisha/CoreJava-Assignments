package dessertshop;

public class Candy extends DessertItem {
	float quant;
	public Candy(float q)
	{
		quant=q;
	}

	@Override
	public float getcost() {
		float cost = quant*2f*60;
		float taxamount= (5f/100f)*cost;
		float totalcost= cost + taxamount;
		return totalcost;
	}

}
