package Com.Epam.MavenOops;

public class MilkyBar extends Chocolates {
	float weights;
	float quantity;
	public float getWeights() {
		return weights;
	}
	public void setWeights(float weights) {
		this.weights = weights;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public MilkyBar(float weights, float quantity) {
		super();
		this.weights = weights;
		this.quantity = quantity;
	}
	public MilkyBar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	float calculate(float weights,float quantity) {
		return weights * quantity;
	}
}
