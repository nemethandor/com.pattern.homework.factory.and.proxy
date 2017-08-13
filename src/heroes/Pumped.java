package heroes;

import java.io.IOException;

import com.pattern.homework.heroes.HeroInfoInterface;

public class Pumped implements HeroInfoInterface{

	@Override
	public void introduceHero(String heroInfo) {
		
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(heroInfo));
		}catch(IOException ex) {
			System.out.println("404 - Website is not found. Please check the URL in the given txt file.");
		}
		
		System.out.println("PUMPED GABÓ\nA SOUND hõse");
		
	}

	
}
