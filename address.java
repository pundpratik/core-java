package ifstatements;

public class address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String add="Ahmednagar,India";
		if(add.endsWith("India")) {
			if(add.contains("Ahmednagar"))
			 {
				System.out.println("your city is ahmednagar");
			}
			else {
				System.out.println("your city is pune");
			}
		}
		else {
			System.out.println("you are not indian");
		}

	}

}
