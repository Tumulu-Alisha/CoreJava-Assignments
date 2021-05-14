package dessertshop;

public class Cookies extends DessertItem{
	float quant;
	public Cookies(float q)
	{
		quant= q;
	}

	@Override
	public float getcost() {
		float cost = quant*3f*7;
		float taxamount= (5f/100f)*cost;
		float totalcost= cost + taxamount;
		return totalcost;
	}

}
