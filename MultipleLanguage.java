package abstractionpkg;

public abstract class MultipleLanguage implements Language, TestTool
{
	public void Python()
	{
		System.out.println("Language is Python");
	}
	public abstract void Ruby();
}
