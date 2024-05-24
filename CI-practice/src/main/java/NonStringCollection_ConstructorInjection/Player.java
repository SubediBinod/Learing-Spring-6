package NonStringCollection_ConstructorInjection;

public class Player {
	private String name;
    private int jercy_no;
    private String position;

    public Player(String name, int jercy_no, String position) {
        this.name = name;
        this.jercy_no = jercy_no;
        this.position = position;
    }

    // Getters and setters

    @Override
    public String toString() {
        return 
                "Player name:'" + name + '\'' +
                ", Jercy No:" + jercy_no +
                ", position:'" + position;
    }
}
