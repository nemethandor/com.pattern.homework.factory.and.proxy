package com.pattern.homework.heroes;

import heroes.Batman;
import heroes.Flash;
import heroes.Pumped;
import heroes.Spiderman;
import interfaces.HeroInfoInterface;

public class HeroFactory {

	public HeroInfoInterface showHero(String heroName) {
		if (heroName == null) {
			return null;
		}
		if (heroName.equals("Batman")) {			
			return new Batman();
			
		} else if (heroName.equals("Flash")) {
			return new Flash();

		} else if (heroName.equals("Spiderman")) {
			return new Spiderman();
		}else if (heroName.equals("Pumped")) {
			return new Pumped();
		}			
		return null;
	}
}
