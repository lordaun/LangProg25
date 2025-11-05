interface Contaiment<T> {
	boolean contains(T o);
}
class NumFns<T extends Numder> {
	T num;
	NumFns(T n) {
		num = n;
	}
	double inverse() {
		return 1/num.doubleValue();
	}
	int whole() {
		return num.intValue();
	}
	double dr() {
		return num.doubleValue() - num.intValue();
	}
	boolean absEqual (NumFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}


class Pr001 {
	public static void main (String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная связь iOb " + iOb.inverse());

		System.out.println("Целая часть iOb " + iOb.whole());

		System.out.println("Дробная часть iOb " + iOb.dr());

		NumFns<Double> dOb = new NumFns<Double>(10.14);

		System.out.println("Обратная связь iOb " + dOb.inverse());

		System.out.println("Целая часть iOb " + dOb.whole());

		System.out.println("Дробная часть iOb" + dOb.dr());

	}
}


class Summation {
	private int sum;
	<T extends Number> Summation(T arg) {
		sum = 0;

		for(int i=0; i<= arg.ingValue(); i++)
			sum += i;
	}

	int getSum() {
		return sum
	}
}

class ClassGenInt<T> implements Containment<T> {
	T[] arrayRef;
	ClassGenInt(T[] o) {
		arrayRef = o;
	}

	public boolean contains(T o) {
		for(T x:arrayRef)
			if (x.equals(o)) return true;
		return false;
	}
}
class Pr002 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная связь iOb " + iOb.inverse());
		
		System.out.println("Целая часть iOb " + iOb.whole());
		
		System.out.println("Дробная часть iOb " + iOb.dr());
		
		NumFns<Double> dOb = new NumFns<Double>(10.14);
		
		System.out.println("Обратная связь iOb " + dOb.inverse());
		
		System.out.println("Целая часть iOb " + dOb.whole());
		
		System.out.println("Дробная часть iOb" + dOb.dr());

	}
}

