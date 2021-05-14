package dessertshop;

public class IceCream extends DessertItem {
	float quant;
	public IceCream(float q)
	{
		quant= q;
	}

	@Override
	public float getcost() {
		float cost = quant*60f;
		float taxamount= (5f/100f)*cost;
		float totalcost= cost + taxamount;
		return totalcost;
	}

}
