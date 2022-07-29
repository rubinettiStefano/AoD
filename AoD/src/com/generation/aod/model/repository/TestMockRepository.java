package com.generation.aod.model.repository;

import com.generation.aod.model.entities.Profession;

public class TestMockRepository
{

	public static void main(String[] args)
	{
		ProfessionRepository professionRepository = new MockProfessionRepository();
		
		for(Profession p:professionRepository.findAll())
			System.out.println(p.generateInsert());
		
		
	}

}
