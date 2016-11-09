package model;

/**
 * This class is inherited from a circular unit and describes a projectile.
 */
public class Projectile extends CircularUnit {
    private final ProjectileType type;
    private final long ownerUnitId;
    private final long ownerPlayerId;

    public Projectile(
            long id, double x, double y, double speedX, double speedY, double angle, Faction faction, double radius,
            ProjectileType type, long ownerUnitId, long ownerPlayerId) {
        super(id, x, y, speedX, speedY, angle, faction, radius);

        this.type = type;
        this.ownerUnitId = ownerUnitId;
        this.ownerPlayerId = ownerPlayerId;
    }

    /**
     * @return the type of the projectile.
     */
    public ProjectileType getType() {
        return type;
    }

    /**
     * @return the ID of the unit created this projectile.
     */
    public long getOwnerUnitId() {
        return ownerUnitId;
    }

    /**
     * @return the ID of the player, which unit created this projectile, or {@code -1}.
     */
    public long getOwnerPlayerId() {
        return ownerPlayerId;
    }
}
