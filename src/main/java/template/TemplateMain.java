package template;

public class TemplateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay display = new CharDisplay();
		display.display();
		
		display = new StringDisplay("String Display");
		display.display();

	}

}
