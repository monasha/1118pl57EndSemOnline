
public class Task 
{
	int hours;
	String task1, task2, task3, task4;
	String taskname;
	
	public Task(int hours, String taskname) {
		super();
		this.hours = hours;
		this.taskname = taskname;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public Task(int hours, String task1, String task2, String task3,
			String task4) {
		super();
		this.hours = hours;
		this.task1 = task1;
		this.task2 = task2;
		this.task3 = task3;
		this.task4 = task4;
	}

	public String getTask1() {
		return task1;
	}

	public void setTask1(String task1) {
		this.task1 = task1;
	}

	public String getTask2() {
		return task2;
	}

	public void setTask2(String task2) {
		this.task2 = task2;
	}

	public String getTask3() {
		return task3;
	}

	public void setTask3(String task3) {
		this.task3 = task3;
	}

	public String getTask4() {
		return task4;
	}

	public void setTask4(String task4) {
		this.task4 = task4;
	}



	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}
