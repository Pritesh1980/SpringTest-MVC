package net.pritesh.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Exercise
{
	@Range(min=1, max=120)
	private int minutes;
	
	@NotNull
	private String Activity;

	public final String getActivity()
	{
		return Activity;
	}

	public final void setActivity(String activity)
	{
		Activity = activity;
	}

	public final int getMinutes()
	{
		return minutes;
	}

	public final void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
}
