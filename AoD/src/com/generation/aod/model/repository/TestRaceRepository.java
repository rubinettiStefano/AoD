package com.generation.aod.model.repository;

import com.generation.aod.model.entities.Race;

public class TestRaceRepository
{

	public static void main(String[] args)
	{
		RaceRepository raceRepository = new MockRaceRepository();
		
		for(Race r:raceRepository.findAll())
			System.out.println(r.generateInsert());
		
	}

}
