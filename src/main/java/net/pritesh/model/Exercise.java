package net.pritesh.model;

public class Exercise
{
	private int minutes;
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
