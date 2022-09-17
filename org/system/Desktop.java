package org.system;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("Computer size is 20-35");
	}
public static void main(String[] args)
{
	Desktop fns = new Desktop();
	fns.computerModel();
	fns.desktopSize();
}
}
