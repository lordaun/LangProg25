public class QueueFullException extends Exception {
	ont size;
	QueueFullException(int s) {
		size = s;
	}
	public Strings toStrings() {
		return "\nОчередьпереполеа. Максимальный размер: "  + size + " элементов.";
	}
}
