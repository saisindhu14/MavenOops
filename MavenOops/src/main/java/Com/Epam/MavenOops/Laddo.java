package Com.Epam.MavenOops;

public class Laddo extends Chocolates{
	float weights;
	float quality;
	public float getWeights() {
		return weights;
	}
	public void setWeights(float weights) {
		this.weights = weights;
	}
	public float getQuality() {
		return quality;
	}
	public void setQuality(float quality) {
		this.quality = quality;
	}
	public Laddo(float weights, float quality) {
		super();
		this.weights = weights;
		this.quality = quality;
	}
	public Laddo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	float calculate(float weights,float quantity) {
		return weights * quantity;
	}
}
