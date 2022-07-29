package com.generation.aod.model.repository;

import java.util.ArrayList;
import java.util.List;

import com.generation.aod.model.entities.Race;

public class MockRaceRepository implements RaceRepository
{

	List<Race> content = new ArrayList<Race>();
	
	public MockRaceRepository()
	{
		Race human = new Race
					(	1, 
						"Human", 
						"Your average human",
						"Mariah,Moira,Milly,Federica,Fabiana,Eleonora,Barbara,Marinela,Oxsana",
						"Diego,Giuseppe,Francesco,Nicolò,Stefano,Simone,Cosimo,Ferdinando,Francis,Vlad,Vash",
						120,
						170,
						65
					);
		
		
		Race orc = new Race
				(	2, 
					"Orc", 
					"Me smash",
					"Orchess,Orchette,Orchana,Patrizia,Fiona,Quela",
					"Shrek,Ork,Orch,Ogre,CannonFooder1,CannonFooder2,AlreadyDead,SnailBrain",
					1000,
					190,
					120
				);
		
		Race troll = new Race
				(	3, 
					"Troll", 
					"Me smash bigger",
					"Orchess,Orchette,Orchana,Patrizia,Fiona,Quela",
					"Shrek,Ork,Orch,Ogre,CannonFooder1,CannonFooder2,AlreadyDead,SnailBrain",
					1000,
					250,
					300
				);
		

		
		
		content.add(human);
		content.add(orc);
		content.add(troll);
		
		
	}
	
	
	
	@Override
	public List<Race> findAll()
	{
		return content;
	}

	
	
}
