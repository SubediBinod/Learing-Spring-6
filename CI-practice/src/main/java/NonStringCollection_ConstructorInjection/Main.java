package NonStringCollection_ConstructorInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Binod.CI_practice.checkcheck;

public class Main {
	public static void main(String [] arg) {
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring.xml");
		checkcheck ch = (checkcheck)context.getBean("bean1");
    	ch.doConfirm();
    	
    	Team tm= (Team) context.getBean("bean3");
    	tm.displayTeamInfo();
    	
    	
	}

}


/* outputs::
All good, Go ahead!!!!
Team Name: Real Madrid
Players:
Player name:'Vinicius Junior', Jercy No:7, position:'Forward
Player name:'Jude Bellingham', Jercy No:5, position:'Midfielder
Player name:'Fede Valverde', Jercy No:15, position:'Midfielder
Player name:'Rodrigo', Jercy No:11, position:'Forward
*/