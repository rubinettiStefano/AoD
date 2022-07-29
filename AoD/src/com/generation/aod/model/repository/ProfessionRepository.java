package com.generation.aod.model.repository;

import java.util.List;

import com.generation.aod.model.entities.Profession;

// dopo lo farà spring... noi ora facciamo in altro modo
public interface ProfessionRepository
{
	List<Profession> findAll();
	
	List<Profession> findByLevel(int level);
	
	default Profession getRandomProfession(int level)
	{
		List<Profession> list = findByLevel(level);
		return list.get((int)(Math.random()*list.size()));
	}
}
