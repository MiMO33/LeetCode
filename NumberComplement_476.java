public class NumberComplement{
	public static int NC(int num){
		return ~num & ((Integer.highestOneBit(num) << 1) - 1);
	}
}