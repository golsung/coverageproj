package sig.oss.simplecalculator;

public class SimpleCalculator {
	private int res=0;

	public void add(int x, int y) {
		res=x+y;
	}
	public void sub(int x, int y) {
		res=x-y;
	}
	public void inc(int d) {
		res+=d;
	}
	public int getResult() {
		return res;
	}
}