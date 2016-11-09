package model;

/**
 * Projectile type.
 */
public enum ProjectileType {
    /**
     * A small piece of pure energy, that inflicts damage to a living unit upon a direct hit.
     */
    MAGIC_MISSILE,

    /**
     * Inflicts damage upon a direct hit and freezes a target for {@code game.frozenDurationTicks}.
     * A frozen unit can not move or perform any actions.
     */
    FROST_BOLT,

    /**
     * Explodes when reaching maximal cast range or upon a collision with living unit.
     * Damages and burns any living unit, if a distance to the center of this unit is not greater than
     * {@code game.fireballExplosionMinDamageRange + livingUnit.radius}.
     * The greater the distance, the less the instant damage.
     */
    FIREBALL,

    /**
     * Sharp thing flying at high speed. Inflicts damage upon a direct hit.
     */
    DART
}
