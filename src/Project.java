
public class Project
{
	String ProjectName;
	
	Sprint sprint;
	
public Project(String ProjectName, Sprint sprint) 
	{
		this.ProjectName = ProjectName;
		
		this.sprint = sprint;
	}
	
	
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	
	public Sprint getSprint() {
		return sprint;
	}
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
	
	
}
