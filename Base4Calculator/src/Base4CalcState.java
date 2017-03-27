
public class Base4CalcState {
	private int value; // value of current calculation
	
	Base4CalcState() { value = 0; }
	
	// invoked when the "Clear" button is pressed--is there any other time it should be invoked?
	void clear() { value = 0; }

	int currentValue() { return value; }
	
	// What other methods will you need?
}
