// this program is checking for null pointer exception
public class Lab8 {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		}
		
		
		
		catch(NullPointerException e) {
			System.out.println(e +"cannot call the lenght method on a null value");
		}
		
	}

}
