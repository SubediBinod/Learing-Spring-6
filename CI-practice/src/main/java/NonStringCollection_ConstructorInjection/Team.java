package NonStringCollection_ConstructorInjection;

import java.util.List;

public class Team {
	private String teamName;
    private List<Player> players;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void displayTeamInfo() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println(player);
        }
    }
    
}
