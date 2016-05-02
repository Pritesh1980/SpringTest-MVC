package net.pritesh.model;

import org.hibernate.validator.constraints.Range;

public class Goal
{
	@Range(min=1, max=120)
	private int minutes;

	public final int getMinutes()
	{
		return minutes;
	}

	public final void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
	
}
