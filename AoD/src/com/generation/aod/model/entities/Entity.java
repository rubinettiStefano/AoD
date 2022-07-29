package com.generation.aod.model.entities;

/**
 * 
 * @author rubin
 *
 */
public abstract class Entity
{
	protected int id;
		
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	

	public abstract boolean isValid();
	
	public abstract String generateInsert();
	
	
}
