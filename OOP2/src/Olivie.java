public class Olivie extends Salad {
	static final String name = "Оливье";

	public String getName() {
		return name;
	}

	Olivie(double potatoWeight, double tomatoWeight, double onionWeight) {
		Vegetables potato = new Potato(potatoWeight);
		super.addVegetable(potato);
		Vegetables tomato = new Tomato(tomatoWeight);
		super.addVegetable(tomato);
		Vegetables onion = new Onion(onionWeight);
		super.addVegetable(onion);
	}
}