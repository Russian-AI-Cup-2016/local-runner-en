package model;

/**
 * Skill type. In some game modes a wizard can not learn skills (see {@code game.skillsEnabled}).
 * <p>
 * There is three skill groups: active, passive and auras.
 * <ul>
 * <li>
 * Active skills provide an ability to perform a new action, not available before.
 * </li>
 * <li>
 * Passive skills are constantly improving some characteristic of the wizard for a certain value.
 * </li>
 * <li>
 * Auras are constantly improving some characteristic of the wizard and all friendly wizards in the
 * {@code game.auraSkillRange}.
 * </li>
 * </ul>
 */
public enum SkillType {
    /**
     * Passive skill. Increases cast range by {@code game.rangeBonusPerSkillLevel}.
     */
    RANGE_BONUS_PASSIVE_1,

    /**
     * Aura. Increases cast range by {@code game.rangeBonusPerSkillLevel}.
     * <p>
     * Requires {@code RANGE_BONUS_PASSIVE_1}.
     */
    RANGE_BONUS_AURA_1,

    /**
     * Passive skill. Increases cast range by {@code 2.0 * game.rangeBonusPerSkillLevel}.
     * <p>
     * Requires {@code RANGE_BONUS_AURA_1}.
     */
    RANGE_BONUS_PASSIVE_2,

    /**
     * Aura. Increases cast range by {@code 2.0 * game.rangeBonusPerSkillLevel}.
     * <p>
     * Requires {@code RANGE_BONUS_PASSIVE_2}.
     */
    RANGE_BONUS_AURA_2,

    /**
     * Passive skill. Removes the {@code MAGIC_MISSILE} spell delay.
     * The common action delay {@code game.wizardActionCooldownTicks} still applies.
     * <p>
     * Requires {@code RANGE_BONUS_AURA_2}.
     */
    ADVANCED_MAGIC_MISSILE,

    /**
     * Passive skill. Increases instant magical damage by {@code game.magicalDamageBonusPerSkillLevel}.
     */
    MAGICAL_DAMAGE_BONUS_PASSIVE_1,

    /**
     * Aura. Increases instant magical damage by {@code game.magicalDamageBonusPerSkillLevel}.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_BONUS_PASSIVE_1}.
     */
    MAGICAL_DAMAGE_BONUS_AURA_1,

    /**
     * Passive skill. Increases instant magical damage by {@code 2.0 * game.magicalDamageBonusPerSkillLevel}.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_BONUS_AURA_1}.
     */
    MAGICAL_DAMAGE_BONUS_PASSIVE_2,

    /**
     * Aura. Increases instant magical damage by {@code 2.0 * game.magicalDamageBonusPerSkillLevel}.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_BONUS_PASSIVE_2}.
     */
    MAGICAL_DAMAGE_BONUS_AURA_2,

    /**
     * Active skill. A wizard can now use the {@code FROST_BOLT} spell.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_BONUS_AURA_2}.
     */
    FROST_BOLT,

    /**
     * Passive skill. Increases staff damage by {@code game.staffDamageBonusPerSkillLevel}.
     */
    STAFF_DAMAGE_BONUS_PASSIVE_1,

    /**
     * Aura. Increases staff damage by  {@code game.staffDamageBonusPerSkillLevel}.
     * <p>
     * Requires {@code STAFF_DAMAGE_BONUS_PASSIVE_1}.
     */
    STAFF_DAMAGE_BONUS_AURA_1,

    /**
     * Passive skill. Increases staff damage by {@code 2.0 * game.staffDamageBonusPerSkillLevel}.
     * <p>
     * Requires {@code STAFF_DAMAGE_BONUS_AURA_1}.
     */
    STAFF_DAMAGE_BONUS_PASSIVE_2,

    /**
     * Aura. Increases staff damage by {@code 2.0 * game.staffDamageBonusPerSkillLevel}.
     * <p>
     * Requires {@code STAFF_DAMAGE_BONUS_PASSIVE_2}.
     */
    STAFF_DAMAGE_BONUS_AURA_2,

    /**
     * Active skill. A wizard can now use the {@code FIREBALL} spell.
     * <p>
     * Requires {@code STAFF_DAMAGE_BONUS_AURA_2}.
     */
    FIREBALL,

    /**
     * Passive skill. Increases movement speed by {@code 1.0 + game.movementBonusFactorPerSkillLevel} times.
     * <p>
     * Summarily {@code MOVEMENT_BONUS_FACTOR_PASSIVE_2} and {@code MOVEMENT_BONUS_FACTOR_AURA_2} increase movement
     * speed by {@code 1.0 + 4.0 * game.movementBonusFactorPerSkillLevel} times.
     */
    MOVEMENT_BONUS_FACTOR_PASSIVE_1,

    /**
     * Aura. Increases movement speed by {@code 1.0 + game.movementBonusFactorPerSkillLevel} times.
     * <p>
     * Requires {@code MOVEMENT_BONUS_FACTOR_PASSIVE_1}.
     */
    MOVEMENT_BONUS_FACTOR_AURA_1,

    /**
     * Passive skill. Increases movement speed by {@code 1.0 + 2.0 * game.movementBonusFactorPerSkillLevel} times.
     * <p>
     * Requires {@code MOVEMENT_BONUS_FACTOR_AURA_1}.
     */
    MOVEMENT_BONUS_FACTOR_PASSIVE_2,

    /**
     * Aura. Increases movement speed by {@code 1.0 + 2.0 * game.movementBonusFactorPerSkillLevel} times.
     * <p>
     * Requires {@code MOVEMENT_BONUS_FACTOR_PASSIVE_2}.
     */
    MOVEMENT_BONUS_FACTOR_AURA_2,

    /**
     * Active skill. A wizard can now use the {@code HASTE} spell.
     * <p>
     * Requires {@code MOVEMENT_BONUS_FACTOR_AURA_2}.
     */
    HASTE,

    /**
     * Passive skill. Decreases received magical damage by {@code game.magicalDamageAbsorptionPerSkillLevel}.
     */
    MAGICAL_DAMAGE_ABSORPTION_PASSIVE_1,

    /**
     * Aura. Decreases received magical damage by {@code game.magicalDamageAbsorptionPerSkillLevel}.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_ABSORPTION_PASSIVE_1}.
     */
    MAGICAL_DAMAGE_ABSORPTION_AURA_1,

    /**
     * Passive skill. Decreases received magical damage by {@code 2.0 * game.magicalDamageAbsorptionPerSkillLevel}.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_ABSORPTION_AURA_1}.
     */
    MAGICAL_DAMAGE_ABSORPTION_PASSIVE_2,

    /**
     * Aura. Decreases received magical damage by {@code 2.0 * game.magicalDamageAbsorptionPerSkillLevel}.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_ABSORPTION_PASSIVE_2}.
     */
    MAGICAL_DAMAGE_ABSORPTION_AURA_2,

    /**
     * Active skill. A wizard can now use the {@code SHIELD} spell.
     * <p>
     * Requires {@code MAGICAL_DAMAGE_ABSORPTION_AURA_2}.
     */
    SHIELD
}
