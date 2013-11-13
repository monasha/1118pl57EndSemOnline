
public class Sprint 
{
	int duration;
	Story story;
	
	public Sprint(int duration, Story story) 
	{
		this.duration = duration;
		this.story = story;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Story getStory() {
		return story;
	}
	public void setStory(Story story) {
		this.story = story;
	}

	
}
