//This is a presentation example for VarArgs


public class VarArgsPres {

	public int noVarArg(int i, int j) {

		return i + j;

	}
	
//	public int VarArg(int ... j) {
//		int sum =0;
//		for(int i : j) {
//			sum = sum + 1;
//		}
//		
//		
//		return sum;
//		
//	}

	public static void main(String[] args) {
		VarArgsPres object = new VarArgsPres();
	//	VarArgsPres object2 = new VarArgsPres();

		System.out.println(object.noVarArg(4, 8));
		// System.out.println(object2.VarArg(4, 8, 12));
	}

}
