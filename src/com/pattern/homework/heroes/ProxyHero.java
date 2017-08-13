package com.pattern.homework.heroes;

public class ProxyHero implements HeroInterface {

	private RealHero realHero;
	private String fileName;
	
	
	public ProxyHero(String fileName) {
		this.fileName = fileName;
	}


	@Override
	public String getHero() {
		if (realHero==null){
			realHero = new RealHero(fileName);
		}
		return realHero.getHero();
	}
	
	
	
	
}
