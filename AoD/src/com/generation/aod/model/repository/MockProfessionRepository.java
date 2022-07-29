package com.generation.aod.model.repository;

import java.util.ArrayList;
import java.util.List;

import com.generation.aod.model.entities.Profession;

public class MockProfessionRepository implements ProfessionRepository
{
	List<Profession> content = new ArrayList<Profession>();
	
	public MockProfessionRepository()
	{
		Profession grunt = 
			new Profession(1, "Grunt", "Cannon fooder", 0, 10, 0);
		Profession blackguard = 
				new Profession(2, "Blackguard", "Armored soldier", 20, 100, 1);
		Profession wizard =
				new Profession(3, "Wizard", "Binario 9 3/4", 50, 500, 2 );
		Profession shaman = 
				new Profession(4, "Shaman", "For the Tribe!", 50, 200, 2 );
		Profession archer = 
				new Profession(5, "Archer", "I have a bow", 10, 30, 1 );
		
		content.add(grunt);
		content.add(blackguard);
		content.add(wizard);
		content.add(shaman);
		content.add(archer);
	}

	@Override
	public List<Profession> findAll()
	{
		return content;
	}

	@Override
	public List<Profession> findByLevel(int level)
	{
		List<Profession> res = new ArrayList<Profession>();
		for(Profession p:content)
			if(p.getLevel()==level)
				content.add(p);
		
		return res;
	}
	
	
	
	
	
}
