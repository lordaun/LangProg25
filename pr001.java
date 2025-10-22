class Gen<T> {
	//Обьявление переменной обобщенного типа
	T ob;
	//Определние конструктора, в качестве параметра указываем обьект обобщенного типа
	Gen(T o) {
		ob = o;
	}
	//метод возравщяющийобьект
	T getOb() {
		return ob;
	}
	//метод получающий иноф\рмацию об имени типа
	void showType() {
		System.out.println("Тип Т: " + ob.getClass().getName());
	}
}

class Pr001 {
	public static void main(String[] args) {
		//создаем обект типа integer
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение: " +v);

		System.out.println();
		Gen<String> strOb = new Gen<String>("Строка обобщенного класса");
		strOb.showType();
		String str = strOb.getOb();
		System.out.println("Значение в переменной str: " + str);
	}
	
}
