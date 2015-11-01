import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Salad {
	private List<Vegetables> vegetablesForSalad = new ArrayList<Vegetables>();

	public List<Vegetables> getVegetablesForSalad() {
		return vegetablesForSalad;
	}

	public void addVegetable(Vegetables vegetable) {
		this.vegetablesForSalad.add(vegetable);
	}

	public void sortVegetablesByName() {
		Collections.sort(vegetablesForSalad, new Comparator<Vegetables>() {
			@Override
			public int compare(Vegetables first, Vegetables second) {
				return first.getName().compareTo(second.getName());
			}
		});
	}

	public void sortVegetablesByCalory() {
		Collections.sort(vegetablesForSalad, new Comparator<Vegetables>() {
			@Override
			public int compare(Vegetables first, Vegetables second) {
				return Double.compare(first.getCalory(), second.getCalory());
			}
		});
	}

	public void sortVegetablesByWeight() {
		Collections.sort(vegetablesForSalad, new Comparator<Vegetables>() {
			@Override
			public int compare(Vegetables first, Vegetables second) {
				return Double.compare(first.getWeight(), second.getWeight());
			}
		});
	}

	public double calculateCalory() {
		double saladCalory = 0;
		for (int i = 0; i < vegetablesForSalad.size(); i++) {
			saladCalory += vegetablesForSalad.get(i).getWeight() * vegetablesForSalad.get(i).getCalory();
		}
		return saladCalory;
	}

	public List<Vegetables> findCaloryVegetables(double firstRange, double secondRange) {
		List<Vegetables> findVegetables = new ArrayList<Vegetables>();
		for (int i = 0; i < vegetablesForSalad.size(); i++) {
			if (vegetablesForSalad.get(i).getCalory() > firstRange
					&& vegetablesForSalad.get(i).getCalory() < secondRange) {
				findVegetables.add(vegetablesForSalad.get(i));
			}
		}
		return findVegetables;
	}
}