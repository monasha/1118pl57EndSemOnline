
public class Story 
{
	int StoryPoint, PriorityNo;
	Task task;
	
	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}


	public Story(int storyPoint, int priorityNo, Task task) {
		super();
		StoryPoint = storyPoint;
		PriorityNo = priorityNo;
		this.task = task;
	}

	public int getStoryPoint() {
		return StoryPoint;
	}

	public void setStoryPoint(int storyPoint) {
		StoryPoint = storyPoint;
	}

	public int getPriorityNo() {
		return PriorityNo;
	}

	public void setPriorityNo(int priorityNo) {
		PriorityNo = priorityNo;
	}
}
