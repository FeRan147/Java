public class Cezar extends Salad {
	static final String name = "������";

	public String getName() {
		return name;
	}

	Cezar(double potatoWeight, double tomatoWeight) {
		Vegetables potato = new Potato(potatoWeight);
		super.addVegetable(potato);
		Vegetables tomato = new Tomato(tomatoWeight);
		super.addVegetable(tomato);
	}
}