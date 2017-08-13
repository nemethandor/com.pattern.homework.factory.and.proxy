package com.pattern.homework.heroes;

public class RealHero implements HeroInterface{
	
	private String fileName;
	private String heroInfo;
	
	public RealHero(String fileName) {
		this.fileName = fileName;
		loadFromFile(fileName);
	}


	@Override
	public String getHero() {
		
		return heroInfo;
		
	}
	
	private void loadFromFile(String fileName) {
		ReadFromFile file = new ReadFromFile();
		heroInfo=file.readWithScanner(fileName);
	}

}
