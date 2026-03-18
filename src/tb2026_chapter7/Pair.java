package tb2026_chapter7;

public class Pair<T> {
	private T first;
	private T second;
	
	public Pair() { 
		first = null; 
		second = null; 
	}
	public Pair(T _first, T _second) { 
		this.first = _first; 
		this.second = _second; 
	}
	
	public T getFirst() { 
		return first; 
	}
	
	public T getSecond() { 
		return second; 
	}
	
	public void setFirst(T _first) { 
		first = _first; 
	}
	
	public void setSecond(T _second) { 
		second = _second; 
	}
}
