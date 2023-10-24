package chap14_objectarray.objectarray;

public class _02_InterfaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceArray[] ia = new InterfaceArray[3];
		ia[0] = new English("영어", 15, 30);
		ia[1] = new Methmethics("수학", 10, 50);
		ia[2] = new Programming("자바", 10, 45);
		ia[3] = new InterfaceArray() {
			
			@Override
			public void proceedLacture() {
				// TODO Auto-generated method stub
				System.out.println("11111");
			}
			
			@Override
			public void learn() {
				// TODO Auto-generated method stub
				System.out.println("22222");
			}
		};
		
		for (InterfaceArray i : ia)	{
			i.proceedLacture();
			i.learn();
		}
	}

}