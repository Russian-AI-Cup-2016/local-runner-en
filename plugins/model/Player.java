package model;

/**
 * The instance of this class contains all the data about player state.
 */
public class Player {
    private final long id;
    private final boolean me;
    private final String name;
    private final boolean strategyCrashed;
    private final int score;
    private final Faction faction;

    public Player(long id, boolean me, String name, boolean strategyCrashed, int score, Faction faction) {
        this.id = id;
        this.me = me;
        this.name = name;
        this.strategyCrashed = strategyCrashed;
        this.score = score;
        this.faction = faction;
    }

    /**
     * @return the unique player ID.
     */
    public long getId() {
        return id;
    }

    /**
     * @return {@code true} if and only if this is your player.
     */
    public boolean isMe() {
        return me;
    }

    /**
     * @return the name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * @return {@code true} if and only if the strategy of this player is crashed.
     */
    public boolean isStrategyCrashed() {
        return strategyCrashed;
    }

    /**
     * @return the amount of score points.
     */
    public int getScore() {
        return score;
    }

    /**
     * @return the faction of this player.
     */
    public Faction getFaction() {
        return faction;
    }
}
