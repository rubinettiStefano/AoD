package com.generation.aod.model.entities;

public class Soldier extends Entity
{

	String name, gender;
	int age;
	int height;
	int weight;
	int salary;
	Race race;
	Profession profession;
	
	
	
	
	public Soldier(int id, String name, String gender, int age, int height, int weight, int salary, Race race, Profession profession)
	{
		this.id 			= id;
		this.name 			= name;
		this.gender 		= gender;
		this.age			= age;
		this.height 		= height;
		this.weight 		= weight;
		this.salary 		= salary;
		this.race 			= race;
		this.profession 	= profession;
	}

	public Soldier() {}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public Race getRace()
	{
		return race;
	}

	public void setRace(Race race)
	{
		this.race = race;
	}

	public Profession getProfession()
	{
		return profession;
	}

	public void setProfession(Profession profession)
	{
		this.profession = profession;
	}

	@Override
	public boolean isValid()
	{
		return	isFull(name) && isFull(gender) && age>=18 && weight>0 && height>0 
				&& race!=null && profession!=null && salary>=0 && age < race.getMaxage()
				&& salary >= profession.getMinsalary() && salary <= profession.getMaxsalary()
				;
	}

	@Override
	public String generateInsert()
	{
		return 
				"Insert into Soldier(id,name,gender,age,height,weight,salary,raceid,professionid)"+
				"values([id], '[name]','[gender]',[age],[height], [weight], [salary], '[raceid]','[professionid]');"
				.replace("[id]", id+"")
				.replace("[name]", name)
				.replace("[gender]", gender)
				.replace("[age]", age+"")
				.replace("[height]", height+"")
				.replace("[weight]", weight+"")
				.replace("[salary]", salary+"")
				.replace("[raceid]", race.getId()+"")
				.replace("[professionid]", profession.getId()+"");
	}
	
	
	
	
}
