package model;

/**
 * This class describes a building. Faction building automatically attack a random enemy in a certain range.
 * <p>
 * A building can not be ({@code FROZEN}).
 */
public class Building extends LivingUnit {
    private final BuildingType type;
    private final double visionRange;
    private final double attackRange;
    private final int damage;
    private final int cooldownTicks;
    private final int remainingActionCooldownTicks;

    public Building(
            long id, double x, double y, double speedX, double speedY, double angle, Faction faction, double radius,
            int life, int maxLife, Status[] statuses, BuildingType type, double visionRange, double attackRange,
            int damage, int cooldownTicks, int remainingActionCooldownTicks) {
        super(id, x, y, speedX, speedY, angle, faction, radius, life, maxLife, statuses);

        this.type = type;
        this.visionRange = visionRange;
        this.attackRange = attackRange;
        this.damage = damage;
        this.cooldownTicks = cooldownTicks;
        this.remainingActionCooldownTicks = remainingActionCooldownTicks;
    }

    /**
     * @return the building type.
     */
    public BuildingType getType() {
        return type;
    }

    /**
     * @return the maximal range (between units' centers), at which this building can detect other units.
     */
    public double getVisionRange() {
        return visionRange;
    }

    /**
     * @return the maximal range (between units' centers), at which this building can attack other units.
     */
    public double getAttackRange() {
        return attackRange;
    }

    /**
     * @return the damage of one attack.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @return the delay between attacks.
     */
    public int getCooldownTicks() {
        return cooldownTicks;
    }

    /**
     * @return the amount of ticks remaining before the next attack.
     */
    public int getRemainingActionCooldownTicks() {
        return remainingActionCooldownTicks;
    }
}
