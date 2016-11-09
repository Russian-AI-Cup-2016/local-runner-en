package model;

import java.util.Arrays;

/**
 * This class is inherited from a living unit and describes a wizard.
 */
public class Wizard extends LivingUnit {
    private final long ownerPlayerId;
    private final boolean me;
    private final int mana;
    private final int maxMana;
    private final double visionRange;
    private final double castRange;
    private final int xp;
    private final int level;
    private final SkillType[] skills;
    private final int remainingActionCooldownTicks;
    private final int[] remainingCooldownTicksByAction;
    private final boolean master;
    private final Message[] messages;

    public Wizard(
            long id, double x, double y, double speedX, double speedY, double angle, Faction faction, double radius,
            int life, int maxLife, Status[] statuses, long ownerPlayerId, boolean me, int mana, int maxMana,
            double visionRange, double castRange, int xp, int level, SkillType[] skills,
            int remainingActionCooldownTicks, int[] remainingCooldownTicksByAction, boolean master,
            Message[] messages) {
        super(id, x, y, speedX, speedY, angle, faction, radius, life, maxLife, statuses);

        this.ownerPlayerId = ownerPlayerId;
        this.me = me;
        this.mana = mana;
        this.maxMana = maxMana;
        this.visionRange = visionRange;
        this.castRange = castRange;
        this.xp = xp;
        this.level = level;
        this.skills = Arrays.copyOf(skills, skills.length);
        this.remainingActionCooldownTicks = remainingActionCooldownTicks;
        this.remainingCooldownTicksByAction = Arrays.copyOf(remainingCooldownTicksByAction, remainingCooldownTicksByAction.length);
        this.master = master;
        this.messages = Arrays.copyOf(messages, messages.length);
    }

    /**
     * @return the ID of the owner player.
     */
    public long getOwnerPlayerId() {
        return ownerPlayerId;
    }

    /**
     * @return {@code true} if and only if this wizard is your.
     */
    public boolean isMe() {
        return me;
    }

    /**
     * @return the current amount of manapoints.
     */
    public int getMana() {
        return mana;
    }

    /**
     * @return the maximal amount of manapoints.
     */
    public int getMaxMana() {
        return maxMana;
    }

    /**
     * @return the maximal range (between units' centers), at which this wizard can detect other units.
     */
    public double getVisionRange() {
        return visionRange;
    }

    /**
     * @return the maximal cast range..
     */
    public double getCastRange() {
        return castRange;
    }

    /**
     * @return the current amount of experience points.
     */
    public int getXp() {
        return xp;
    }

    /**
     * @return the current wizard level.
     * <p>
     * Each wizard starts at level {@code 0} and can level up up to {@code game.levelUpXpValues.length} times.
     * <p>
     * In some game modes a wizard can not gain new levels.
     */
    public int getLevel() {
        return level;
    }

    /**
     * @return the skills of this wizard.
     */
    public SkillType[] getSkills() {
        return Arrays.copyOf(skills, skills.length);
    }

    /**
     * @return the amount of ticks remaining before any new action.
     * <p>
     * A wizard can perform the action {@code actionType} if and only if both {@code remainingActionCooldownTicks} and
     * {@code remainingCooldownTicksByAction[actionType.ordinal()]} are equal to zero.
     */
    public int getRemainingActionCooldownTicks() {
        return remainingActionCooldownTicks;
    }

    /**
     * @return the non-negative integer numbers. Each item is equal to the amount of ticks remaining before the next
     * action with the corresponding index.
     * <p>
     * For example, {@code remainingCooldownTicksByAction[0]} corresponds to {@code NONE} action and always equal to
     * zero. {@code remainingCooldownTicksByAction[1]} corresponds to {@code STAFF} action and equal to the amount of
     * ticks remaining before the next staff attack.
     * <p>
     * A wizard can perform the action {@code actionType} if and only if both {@code remainingActionCooldownTicks} and
     * {@code remainingCooldownTicksByAction[actionType.ordinal()]} are equal to zero.
     */
    public int[] getRemainingCooldownTicksByAction() {
        return Arrays.copyOf(remainingCooldownTicksByAction, remainingCooldownTicksByAction.length);
    }

    /**
     * @return {@code true} if and only if this wizard is master.
     * <p>
     * There is exactly one master wizard per faction.
     */
    public boolean isMaster() {
        return master;
    }

    /**
     * @return the messages addressed to this wizard.
     * <p>
     * A strategy can only read messages of the controlling wizard.
     */
    public Message[] getMessages() {
        return Arrays.copyOf(messages, messages.length);
    }
}
