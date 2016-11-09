package model;

/**
 * Bonus type.
 * <p>
 * Besides the primary effect each taken bonus gives {@code game.bonusScoreAmount} score points to the player. The
 * wizard gains the same amount as xp.
 */
public enum BonusType {
    /**
     * Dramatically increases the damage of ranged and melee attacks for some time.
     */
    EMPOWER,

    /**
     * Grants the {@code HASTENED} status to the wizard.
     * <p>
     * Duration of the status is longer than usually.
     */
    HASTE,

    /**
     * Grants the {@code SHIELDED} status to the wizard.
     * <p>
     * Duration of the status is longer than usually.
     */
    SHIELD
}
