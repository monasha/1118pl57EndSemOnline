import static org.junit.Assert.*;

import org.junit.Test;


public class TestCase2
{
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
	//	Task task =new Task(5, "Coding", "Designing", "Requirement", "Implementing" );
		Task task1 = new Task(5, "Requirement");
		Task task2 = new Task(6, "Designing");
		Task task3 = new Task(5, "Coding");
		Task task4 = new Task(9, "Implementing");
		
		
		Story story= new Story(6, 8, task1);
		Sprint sprint1 = new Sprint(10, story);
		Project project = new Project("Event Planning", sprint1);
		Team Team_A= new Team("Monasha", "Joslina", "Ravi", "Siddhi", "ABC Company", "Sachin", "Xyzzz", 6, 4, project);
		
		
		assertEquals("Event Planning", project.getProjectName());
		
		assertEquals("ABC Company", Team_A.getProductOwner());
		assertEquals("Sachin", Team_A.getScrumMaster());
		assertEquals("Xyzzz", Team_A.getCustormer());
		
		assertEquals("Monasha", Team_A.getTeamMember1());
		assertEquals("Joslina", Team_A.getTeamMember2());
		assertEquals("Ravi", Team_A.getTeamMember3());
		assertEquals("Siddhi", Team_A.getTeamMember4());
		
		
		assertEquals(6, Team_A.getVelocity());
		assertEquals(4, Team_A.getNo_of_TeamMembers());
		
		assertEquals(10, sprint1.getDuration());
		
		assertEquals(6, story.getStoryPoint());
		assertEquals(8, story.getPriorityNo());
		
		assertEquals(5,task1.getHours());
		
		assertEquals("Coding", task3.getTaskname());
		assertEquals("Designing", task2.getTaskname());
		assertEquals("Requirement", task1.getTaskname());
		assertEquals("Implementing", task4.getTaskname());
	}
	
	

}
