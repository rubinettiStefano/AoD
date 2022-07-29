package com.generation.aod.model.repository;

import java.util.ArrayList;
import java.util.List;

import com.generation.aod.model.entities.Race;

public interface RaceRepository
{
	List<Race> findAll();
	
	default Race findbyName(String name)
	{
		for(Race r:findAll())
			if(r.getName().equals(name))
				return r;
		
		return null;
	}
	
	
	default Race getRandomRace()
	{
		List<Race> list = findAll();
		return list.get((int)(Math.random()*list.size()));
	}
	
	
}
