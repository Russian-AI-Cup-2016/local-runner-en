package model;

/**
 * Available wizard actions.
 * <p>
 * A wizard can not perform any new action, if he is not yet recovered from his previous action
 * ({@code wizard.remainingActionCooldownTicks} is greater than {@code 0}).
 * <p>
 * A wizard can not perform the specific new action, if it is not yet recovered from its previous usage
 * ({@code remainingCooldownTicksByAction[actionType.ordinal()]} is greater than {@code 0}).
 */
public enum ActionType {
    /**
     * Do nothing.
     */
    NONE,

    /**
     * Perform a melee attack with a staff.
     * <p>
     * This attack damages all living units in a sector of {@code -game.staffSector / 2.0} to
     * {@code game.staffSector / 2.0}. The distance between wizard and target centers should not exceed
     * {@code game.staffRange + livingUnit.radius}.
     */
    STAFF,

    /**
     * Cast a magic missile.
     * <p>
     * Magic missile is a basic spell of any wizard. Inflicts some damage upon a direct hit.
     * <p>
     * The center of a newly created magic missile is the same as the center of a caster wizard. The angle of a
     * projectile is equal to {@code wizard.angle + move.castAngle}, and its speed is {@code game.magicMissileSpeed}.
     * All collisions between a projectile and its caster are ignored by the game engine.
     * <p>
     * Requires {@code game.magicMissileManacost} manapoints.
     */
    MAGIC_MISSILE,

    /**
     * Cast a frost bolt.
     * <p>
     * A frost bolt inflicts some damage upon a direct hit and freezes a target.
     * <p>
     * The center of a newly created frost bolt is the same as the center of a caster wizard. The angle of a
     * projectile is equal to {@code wizard.angle + move.castAngle}, and its speed is {@code game.frostBoltSpeed}.
     * All collisions between a projectile and its caster are ignored by the game engine.
     * <p>
     * Requires the {@code FROST_BOLT} skill and {@code game.frostBoltManacost} manapoints.
     */
    FROST_BOLT,

    /**
     * Cast a fireball.
     * <p>
     * A fireball explodes when reaching maximal cast range or upon a collision with living unit.
     * Damages and burns all living units nearby.
     * <p>
     * The center of a newly created fireball is the same as the center of a caster wizard. The angle of a
     * projectile is equal to {@code wizard.angle + move.castAngle}, and its speed is {@code game.fireballSpeed}.
     * All collisions between a projectile and its caster are ignored by the game engine.
     * <p>
     * Requires the {@code FIREBALL} skill and {@code game.fireballManacost} manapoints.
     */
    FIREBALL,

    /**
     * Cast a haste spell, that temporarily speedups the friendly wizard with ID equal to {@code move.statusTargetId}
     * or the caster himself if the game engine can not find such wizard.
     * <p>
     * Requires the {@code HASTE} skill and {@code game.hasteManacost} manapoints.
     */
    HASTE,

    /**
     * Cast a shield spell, that temporarily protects the friendly wizard with ID equal to {@code move.statusTargetId}
     * or the caster himself if the game engine can not find such wizard.
     * <p>
     * Requires the {@code SHIELD} skill and {@code game.shieldManacost} manapoints.
     */
    SHIELD
}
