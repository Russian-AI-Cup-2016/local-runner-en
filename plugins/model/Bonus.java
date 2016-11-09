package model;

/**
 * This class describes a bonus. Bonus is a static useful circular unit.
 */
public class Bonus extends CircularUnit {
    private final BonusType type;

    public Bonus(
            long id, double x, double y, double speedX, double speedY, double angle, Faction faction, double radius,
            BonusType type) {
        super(id, x, y, speedX, speedY, angle, faction, radius);

        this.type = type;
    }

    /**
     * @return the bonus type.
     */
    public BonusType getType() {
        return type;
    }
}
