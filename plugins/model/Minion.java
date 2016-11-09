package model;

/**
 * This class is inherited from a living unit and describes a minion.
 */
public class Minion extends LivingUnit {
    private final MinionType type;
    private final double visionRange;
    private final int damage;
    private final int cooldownTicks;
    private final int remainingActionCooldownTicks;

    public Minion(
            long id, double x, double y, double speedX, double speedY, double angle, Faction faction, double radius,
            int life, int maxLife, Status[] statuses, MinionType type, double visionRange, int damage,
            int cooldownTicks, int remainingActionCooldownTicks) {
        super(id, x, y, speedX, speedY, angle, faction, radius, life, maxLife, statuses);

        this.type = type;
        this.visionRange = visionRange;
        this.damage = damage;
        this.cooldownTicks = cooldownTicks;
        this.remainingActionCooldownTicks = remainingActionCooldownTicks;
    }

    /**
     * @return the minion type.
     */
    public MinionType getType() {
        return type;
    }

    /**
     * @return the maximal range (between units' centers), at which this minion can detect other units.
     */
    public double getVisionRange() {
        return visionRange;
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
