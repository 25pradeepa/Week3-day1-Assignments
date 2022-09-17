package abstractionpkg;

public class Automation extends MultipleLanguage
{
	public void Java() {
		System.out.println("Language is Java");
		
	}

	public void Selenium() {
		System.out.println("Language is Selenium");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Language is Ruby");
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Automation tools = new Automation();
tools.Java();
tools.Selenium();
tools.Ruby();
tools.Python();
	}

	

}
