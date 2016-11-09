package model;

import java.util.Arrays;

/**
 * This base class is inherited from a circular unit and describes any living unit in the game world.
 */
@SuppressWarnings("AbstractClassWithoutAbstractMethods")
public abstract class LivingUnit extends CircularUnit {
    private final int life;
    private final int maxLife;
    private final Status[] statuses;

    protected LivingUnit(
            long id, double x, double y, double speedX, double speedY, double angle, Faction faction, double radius,
            int life, int maxLife, Status[] statuses) {
        super(id, x, y, speedX, speedY, angle, faction, radius);

        this.life = life;
        this.maxLife = maxLife;
        this.statuses = Arrays.copyOf(statuses, statuses.length);
    }

    /**
     * @return the current amount of hitpoints.
     */
    public int getLife() {
        return life;
    }

    /**
     * @return the maximal amount of hitpoints.
     */
    public int getMaxLife() {
        return maxLife;
    }

    /**
     * @return the magical statuses affecting this living unit.
     */
    public Status[] getStatuses() {
        return Arrays.copyOf(statuses, statuses.length);
    }
}
