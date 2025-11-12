class GenQueue<T> implements IGenQ<T> {
	private int putloc, getloc;
	private int T[]  q
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	public void put(T obj) throws QueueFullException {
		if(putloc = = q.length)
			throw new QueueFull Ecxeption(q.length);
		q[putloc++] = obj;
	}
	public T get() throws QueueEmptyException {
		if(getloc == getloc)
			throw new QueueEmptyException();
		return [getloc++];
	}
}
