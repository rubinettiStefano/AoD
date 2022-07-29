package com.generation.aod.model.repository;

import java.util.List;

import com.generation.aod.model.entities.Soldier;

public class TestSoldierFactory
{

	public static void main(String[] args)
	{
		SoldierFactory soldierFactory = new SoldierFactory();
		
		List<Soldier> grunts = soldierFactory.makeMany(1,100);

		for(Soldier g:grunts)
			System.out.println(g.generateInsert());
		
		
	}

}
