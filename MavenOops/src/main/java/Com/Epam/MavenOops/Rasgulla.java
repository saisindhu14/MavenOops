package Com.Epam.MavenOops;

public class Rasgulla extends Chocolates {
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
	public Rasgulla(float weights, float quality) {
		super();
		this.weights = weights;
		this.quality = quality;
	}
	public Rasgulla() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	float calculate(float weights,float quantity) {
		return weights * quantity;
	}
}
