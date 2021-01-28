
public class LearningActivity1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.Add(2,2));
	}

}


class Calculator{
	
	private float result;
	
	public float Add(float a, float b) {
		result = a + b;
		return result;
		
	}
	
}
