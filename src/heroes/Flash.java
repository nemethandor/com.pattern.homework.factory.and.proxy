package heroes;

import java.io.IOException;

import interfaces.HeroInfoInterface;

public class Flash implements HeroInfoInterface{

	@Override
	public void introduceHero(String heroInfo) {
		
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(heroInfo));
		}catch(IOException ex) {
			System.out.println("404 - Website is not found. Please check the URL in the given txt file.");
		}
		
		System.out.println("THE FLASH\nMy name is Barry Allen and I am the fastest man alive.");
		
	}

}