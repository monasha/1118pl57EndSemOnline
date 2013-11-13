
public class Team 
{
	String TeamMember1, TeamMember2, TeamMember3 , TeamMember4, ProductOwner, ScrumMaster, Custormer;
	Project project;
	int Velocity, no_of_TeamMembers;
	
	
	public Team(String TeamMember1,String TeamMember2, String TeamMember3, String TeamMember4, String ProductOwner,String ScrumMaster,String Custormer,int Velocity,int no_of_TeamMembers, Project project)
	{
		this.TeamMember1= TeamMember1;
		this.TeamMember2= TeamMember2;
		this.TeamMember3= TeamMember3;
		this.TeamMember4= TeamMember4;
		
		this.ProductOwner= ProductOwner;
		this.ScrumMaster = ScrumMaster;
		this.Custormer =Custormer;
		this.Velocity = Velocity;
		this.no_of_TeamMembers = no_of_TeamMembers;
		this.project= project;
	}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getNo_of_TeamMembers() {
		return no_of_TeamMembers;
	}

	public void setNo_of_TeamMembers(int no_of_TeamMembers) {
		this.no_of_TeamMembers = no_of_TeamMembers;
	}

	

	public String getTeamMember1() {
		return TeamMember1;
	}

	public void setTeamMember1(String teamMember1) {
		TeamMember1 = teamMember1;
	}

	public String getTeamMember2() {
		return TeamMember2;
	}

	public void setTeamMember2(String teamMember2) {
		TeamMember2 = teamMember2;
	}

	public String getTeamMember3() {
		return TeamMember3;
	}

	public void setTeamMember3(String teamMember3) {
		TeamMember3 = teamMember3;
	}

	public String getTeamMember4() {
		return TeamMember4;
	}

	public void setTeamMember4(String teamMember4) {
		TeamMember4 = teamMember4;
	}

	public String getProductOwner() {
		return ProductOwner;
	}

	public void setProductOwner(String productOwner) {
		ProductOwner = productOwner;
	}

	public String getScrumMaster() {
		return ScrumMaster;
	}

	public void setScrumMaster(String scrumMaster) {
		ScrumMaster = scrumMaster;
	}

	public String getCustormer() {
		return Custormer;
	}

	public void setCustormer(String custormer) {
		Custormer = custormer;
	}

	
	public int getVelocity() {
		return Velocity;
	}

	public void setVelocity(int velocity) {
		Velocity = velocity;
	}
}
