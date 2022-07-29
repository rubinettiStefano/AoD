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
	

	public boolean isFull(String s)
	{
		return s!=null && !s.isEmpty();
	}
	
	public abstract boolean isValid();
	
	public abstract String generateInsert();
	
	
}
