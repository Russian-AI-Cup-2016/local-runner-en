package model;

import java.util.Arrays;

/**
 * An instance of this class contains all game constants.
 */
@SuppressWarnings("OverlyLongMethod")
public class Game {
    private final long randomSeed;
    private final int tickCount;
    private final double mapSize;
    private final boolean skillsEnabled;
    private final boolean rawMessagesEnabled;
    private final double friendlyFireDamageFactor;
    private final double buildingDamageScoreFactor;
    private final double buildingEliminationScoreFactor;
    private final double minionDamageScoreFactor;
    private final double minionEliminationScoreFactor;
    private final double wizardDamageScoreFactor;
    private final double wizardEliminationScoreFactor;
    private final double teamWorkingScoreFactor;
    private final int victoryScore;
    private final double scoreGainRange;
    private final int rawMessageMaxLength;
    private final double rawMessageTransmissionSpeed;
    private final double wizardRadius;
    private final double wizardCastRange;
    private final double wizardVisionRange;
    private final double wizardForwardSpeed;
    private final double wizardBackwardSpeed;
    private final double wizardStrafeSpeed;
    private final int wizardBaseLife;
    private final int wizardLifeGrowthPerLevel;
    private final int wizardBaseMana;
    private final int wizardManaGrowthPerLevel;
    private final double wizardBaseLifeRegeneration;
    private final double wizardLifeRegenerationGrowthPerLevel;
    private final double wizardBaseManaRegeneration;
    private final double wizardManaRegenerationGrowthPerLevel;
    private final double wizardMaxTurnAngle;
    private final int wizardMaxResurrectionDelayTicks;
    private final int wizardMinResurrectionDelayTicks;
    private final int wizardActionCooldownTicks;
    private final int staffCooldownTicks;
    private final int magicMissileCooldownTicks;
    private final int frostBoltCooldownTicks;
    private final int fireballCooldownTicks;
    private final int hasteCooldownTicks;
    private final int shieldCooldownTicks;
    private final int magicMissileManacost;
    private final int frostBoltManacost;
    private final int fireballManacost;
    private final int hasteManacost;
    private final int shieldManacost;
    private final int staffDamage;
    private final double staffSector;
    private final double staffRange;
    private final int[] levelUpXpValues;
    private final double minionRadius;
    private final double minionVisionRange;
    private final double minionSpeed;
    private final double minionMaxTurnAngle;
    private final int minionLife;
    private final int factionMinionAppearanceIntervalTicks;
    private final int orcWoodcutterActionCooldownTicks;
    private final int orcWoodcutterDamage;
    private final double orcWoodcutterAttackSector;
    private final double orcWoodcutterAttackRange;
    private final int fetishBlowdartActionCooldownTicks;
    private final double fetishBlowdartAttackRange;
    private final double fetishBlowdartAttackSector;
    private final double bonusRadius;
    private final int bonusAppearanceIntervalTicks;
    private final int bonusScoreAmount;
    private final double dartRadius;
    private final double dartSpeed;
    private final int dartDirectDamage;
    private final double magicMissileRadius;
    private final double magicMissileSpeed;
    private final int magicMissileDirectDamage;
    private final double frostBoltRadius;
    private final double frostBoltSpeed;
    private final int frostBoltDirectDamage;
    private final double fireballRadius;
    private final double fireballSpeed;
    private final double fireballExplosionMaxDamageRange;
    private final double fireballExplosionMinDamageRange;
    private final int fireballExplosionMaxDamage;
    private final int fireballExplosionMinDamage;
    private final double guardianTowerRadius;
    private final double guardianTowerVisionRange;
    private final double guardianTowerLife;
    private final double guardianTowerAttackRange;
    private final int guardianTowerDamage;
    private final int guardianTowerCooldownTicks;
    private final double factionBaseRadius;
    private final double factionBaseVisionRange;
    private final double factionBaseLife;
    private final double factionBaseAttackRange;
    private final int factionBaseDamage;
    private final int factionBaseCooldownTicks;
    private final int burningDurationTicks;
    private final int burningSummaryDamage;
    private final int empoweredDurationTicks;
    private final double empoweredDamageFactor;
    private final int frozenDurationTicks;
    private final int hastenedDurationTicks;
    private final double hastenedBonusDurationFactor;
    private final double hastenedMovementBonusFactor;
    private final double hastenedRotationBonusFactor;
    private final int shieldedDurationTicks;
    private final double shieldedBonusDurationFactor;
    private final double shieldedDirectDamageAbsorptionFactor;
    private final double auraSkillRange;
    private final double rangeBonusPerSkillLevel;
    private final int magicalDamageBonusPerSkillLevel;
    private final int staffDamageBonusPerSkillLevel;
    private final double movementBonusFactorPerSkillLevel;
    private final int magicalDamageAbsorptionPerSkillLevel;

    public Game(
            long randomSeed, int tickCount, double mapSize, boolean skillsEnabled, boolean rawMessagesEnabled,
            double friendlyFireDamageFactor, double buildingDamageScoreFactor, double buildingEliminationScoreFactor,
            double minionDamageScoreFactor, double minionEliminationScoreFactor, double wizardDamageScoreFactor,
            double wizardEliminationScoreFactor, double teamWorkingScoreFactor, int victoryScore, double scoreGainRange,
            int rawMessageMaxLength, double rawMessageTransmissionSpeed, double wizardRadius, double wizardCastRange,
            double wizardVisionRange, double wizardForwardSpeed, double wizardBackwardSpeed, double wizardStrafeSpeed,
            int wizardBaseLife, int wizardLifeGrowthPerLevel, int wizardBaseMana, int wizardManaGrowthPerLevel,
            double wizardBaseLifeRegeneration, double wizardLifeRegenerationGrowthPerLevel,
            double wizardBaseManaRegeneration, double wizardManaRegenerationGrowthPerLevel, double wizardMaxTurnAngle,
            int wizardMaxResurrectionDelayTicks, int wizardMinResurrectionDelayTicks, int wizardActionCooldownTicks,
            int staffCooldownTicks, int magicMissileCooldownTicks, int frostBoltCooldownTicks,
            int fireballCooldownTicks, int hasteCooldownTicks, int shieldCooldownTicks, int magicMissileManacost,
            int frostBoltManacost, int fireballManacost, int hasteManacost, int shieldManacost, int staffDamage,
            double staffSector, double staffRange, int[] levelUpXpValues, double minionRadius, double minionVisionRange,
            double minionSpeed, double minionMaxTurnAngle, int minionLife, int factionMinionAppearanceIntervalTicks,
            int orcWoodcutterActionCooldownTicks, int orcWoodcutterDamage, double orcWoodcutterAttackSector,
            double orcWoodcutterAttackRange, int fetishBlowdartActionCooldownTicks, double fetishBlowdartAttackRange,
            double fetishBlowdartAttackSector, double bonusRadius, int bonusAppearanceIntervalTicks,
            int bonusScoreAmount, double dartRadius, double dartSpeed, int dartDirectDamage, double magicMissileRadius,
            double magicMissileSpeed, int magicMissileDirectDamage, double frostBoltRadius, double frostBoltSpeed,
            int frostBoltDirectDamage, double fireballRadius, double fireballSpeed,
            double fireballExplosionMaxDamageRange, double fireballExplosionMinDamageRange,
            int fireballExplosionMaxDamage, int fireballExplosionMinDamage, double guardianTowerRadius,
            double guardianTowerVisionRange, double guardianTowerLife, double guardianTowerAttackRange,
            int guardianTowerDamage, int guardianTowerCooldownTicks, double factionBaseRadius,
            double factionBaseVisionRange, double factionBaseLife, double factionBaseAttackRange, int factionBaseDamage,
            int factionBaseCooldownTicks, int burningDurationTicks, int burningSummaryDamage,
            int empoweredDurationTicks, double empoweredDamageFactor, int frozenDurationTicks,
            int hastenedDurationTicks, double hastenedBonusDurationFactor, double hastenedMovementBonusFactor,
            double hastenedRotationBonusFactor, int shieldedDurationTicks, double shieldedBonusDurationFactor,
            double shieldedDirectDamageAbsorptionFactor, double auraSkillRange, double rangeBonusPerSkillLevel,
            int magicalDamageBonusPerSkillLevel, int staffDamageBonusPerSkillLevel,
            double movementBonusFactorPerSkillLevel, int magicalDamageAbsorptionPerSkillLevel) {
        this.randomSeed = randomSeed;
        this.tickCount = tickCount;
        this.mapSize = mapSize;
        this.skillsEnabled = skillsEnabled;
        this.rawMessagesEnabled = rawMessagesEnabled;
        this.friendlyFireDamageFactor = friendlyFireDamageFactor;
        this.buildingDamageScoreFactor = buildingDamageScoreFactor;
        this.buildingEliminationScoreFactor = buildingEliminationScoreFactor;
        this.minionDamageScoreFactor = minionDamageScoreFactor;
        this.minionEliminationScoreFactor = minionEliminationScoreFactor;
        this.wizardDamageScoreFactor = wizardDamageScoreFactor;
        this.wizardEliminationScoreFactor = wizardEliminationScoreFactor;
        this.teamWorkingScoreFactor = teamWorkingScoreFactor;
        this.victoryScore = victoryScore;
        this.scoreGainRange = scoreGainRange;
        this.rawMessageMaxLength = rawMessageMaxLength;
        this.rawMessageTransmissionSpeed = rawMessageTransmissionSpeed;
        this.wizardRadius = wizardRadius;
        this.wizardCastRange = wizardCastRange;
        this.wizardVisionRange = wizardVisionRange;
        this.wizardForwardSpeed = wizardForwardSpeed;
        this.wizardBackwardSpeed = wizardBackwardSpeed;
        this.wizardStrafeSpeed = wizardStrafeSpeed;
        this.wizardBaseLife = wizardBaseLife;
        this.wizardLifeGrowthPerLevel = wizardLifeGrowthPerLevel;
        this.wizardBaseMana = wizardBaseMana;
        this.wizardManaGrowthPerLevel = wizardManaGrowthPerLevel;
        this.wizardBaseLifeRegeneration = wizardBaseLifeRegeneration;
        this.wizardLifeRegenerationGrowthPerLevel = wizardLifeRegenerationGrowthPerLevel;
        this.wizardBaseManaRegeneration = wizardBaseManaRegeneration;
        this.wizardManaRegenerationGrowthPerLevel = wizardManaRegenerationGrowthPerLevel;
        this.wizardMaxTurnAngle = wizardMaxTurnAngle;
        this.wizardMaxResurrectionDelayTicks = wizardMaxResurrectionDelayTicks;
        this.wizardMinResurrectionDelayTicks = wizardMinResurrectionDelayTicks;
        this.wizardActionCooldownTicks = wizardActionCooldownTicks;
        this.staffCooldownTicks = staffCooldownTicks;
        this.magicMissileCooldownTicks = magicMissileCooldownTicks;
        this.frostBoltCooldownTicks = frostBoltCooldownTicks;
        this.fireballCooldownTicks = fireballCooldownTicks;
        this.hasteCooldownTicks = hasteCooldownTicks;
        this.shieldCooldownTicks = shieldCooldownTicks;
        this.magicMissileManacost = magicMissileManacost;
        this.frostBoltManacost = frostBoltManacost;
        this.fireballManacost = fireballManacost;
        this.hasteManacost = hasteManacost;
        this.shieldManacost = shieldManacost;
        this.staffDamage = staffDamage;
        this.staffSector = staffSector;
        this.staffRange = staffRange;
        this.levelUpXpValues = Arrays.copyOf(levelUpXpValues, levelUpXpValues.length);
        this.minionRadius = minionRadius;
        this.minionVisionRange = minionVisionRange;
        this.minionSpeed = minionSpeed;
        this.minionMaxTurnAngle = minionMaxTurnAngle;
        this.minionLife = minionLife;
        this.factionMinionAppearanceIntervalTicks = factionMinionAppearanceIntervalTicks;
        this.orcWoodcutterActionCooldownTicks = orcWoodcutterActionCooldownTicks;
        this.orcWoodcutterDamage = orcWoodcutterDamage;
        this.orcWoodcutterAttackSector = orcWoodcutterAttackSector;
        this.orcWoodcutterAttackRange = orcWoodcutterAttackRange;
        this.fetishBlowdartActionCooldownTicks = fetishBlowdartActionCooldownTicks;
        this.fetishBlowdartAttackRange = fetishBlowdartAttackRange;
        this.fetishBlowdartAttackSector = fetishBlowdartAttackSector;
        this.bonusRadius = bonusRadius;
        this.bonusAppearanceIntervalTicks = bonusAppearanceIntervalTicks;
        this.bonusScoreAmount = bonusScoreAmount;
        this.dartRadius = dartRadius;
        this.dartSpeed = dartSpeed;
        this.dartDirectDamage = dartDirectDamage;
        this.magicMissileRadius = magicMissileRadius;
        this.magicMissileSpeed = magicMissileSpeed;
        this.magicMissileDirectDamage = magicMissileDirectDamage;
        this.frostBoltRadius = frostBoltRadius;
        this.frostBoltSpeed = frostBoltSpeed;
        this.frostBoltDirectDamage = frostBoltDirectDamage;
        this.fireballRadius = fireballRadius;
        this.fireballSpeed = fireballSpeed;
        this.fireballExplosionMaxDamageRange = fireballExplosionMaxDamageRange;
        this.fireballExplosionMinDamageRange = fireballExplosionMinDamageRange;
        this.fireballExplosionMaxDamage = fireballExplosionMaxDamage;
        this.fireballExplosionMinDamage = fireballExplosionMinDamage;
        this.guardianTowerRadius = guardianTowerRadius;
        this.guardianTowerVisionRange = guardianTowerVisionRange;
        this.guardianTowerLife = guardianTowerLife;
        this.guardianTowerAttackRange = guardianTowerAttackRange;
        this.guardianTowerDamage = guardianTowerDamage;
        this.guardianTowerCooldownTicks = guardianTowerCooldownTicks;
        this.factionBaseRadius = factionBaseRadius;
        this.factionBaseVisionRange = factionBaseVisionRange;
        this.factionBaseLife = factionBaseLife;
        this.factionBaseAttackRange = factionBaseAttackRange;
        this.factionBaseDamage = factionBaseDamage;
        this.factionBaseCooldownTicks = factionBaseCooldownTicks;
        this.burningDurationTicks = burningDurationTicks;
        this.burningSummaryDamage = burningSummaryDamage;
        this.empoweredDurationTicks = empoweredDurationTicks;
        this.empoweredDamageFactor = empoweredDamageFactor;
        this.frozenDurationTicks = frozenDurationTicks;
        this.hastenedDurationTicks = hastenedDurationTicks;
        this.hastenedBonusDurationFactor = hastenedBonusDurationFactor;
        this.hastenedMovementBonusFactor = hastenedMovementBonusFactor;
        this.hastenedRotationBonusFactor = hastenedRotationBonusFactor;
        this.shieldedDurationTicks = shieldedDurationTicks;
        this.shieldedBonusDurationFactor = shieldedBonusDurationFactor;
        this.shieldedDirectDamageAbsorptionFactor = shieldedDirectDamageAbsorptionFactor;
        this.auraSkillRange = auraSkillRange;
        this.rangeBonusPerSkillLevel = rangeBonusPerSkillLevel;
        this.magicalDamageBonusPerSkillLevel = magicalDamageBonusPerSkillLevel;
        this.staffDamageBonusPerSkillLevel = staffDamageBonusPerSkillLevel;
        this.movementBonusFactorPerSkillLevel = movementBonusFactorPerSkillLevel;
        this.magicalDamageAbsorptionPerSkillLevel = magicalDamageAbsorptionPerSkillLevel;
    }

    /**
     * @return the number that your strategy may use to initialize a generator of random numbers.
     */
    public long getRandomSeed() {
        return randomSeed;
    }

    /**
     * @return the base game duration in ticks. A real game duration may be lower. Equals to {@code world.tickCount}.
     */
    public int getTickCount() {
        return tickCount;
    }

    /**
     * @return the size (both width and height) of the map.
     */
    public double getMapSize() {
        return mapSize;
    }

    /**
     * @return {@code true} if and only if the wizards in this game can gain new levels and learn skills.
     */
    public boolean isSkillsEnabled() {
        return skillsEnabled;
    }

    /**
     * @return {@code true} if and only if the master wizards in this game can send raw messages.
     */
    public boolean isRawMessagesEnabled() {
        return rawMessagesEnabled;
    }

    /**
     * @return Returns the damage part dealt by the wizards one faction to each other as a result of friendly fire.
     * <p>
     * The value depends on the game mode, but is always in range of {@code 0.0} to {@code 1.0}.
     * <p>
     * Regardless of the game mode, wizards can not damage friendly minions and buildings.
     */
    public double getFriendlyFireDamageFactor() {
        return friendlyFireDamageFactor;
    }

    /**
     * @return the factor of the experience points gained by the wizard for the damage dealt to the opposite faction
     * buildings.
     */
    public double getBuildingDamageScoreFactor() {
        return buildingDamageScoreFactor;
    }

    /**
     * @return the factor of the experience points gained by the wizard for destroying the opposite faction building.
     * <p>
     * Applies to the maximal amount of building's hitpoints.
     */
    public double getBuildingEliminationScoreFactor() {
        return buildingEliminationScoreFactor;
    }

    /**
     * @return the factor of the experience points gained by the wizard for the damage dealt to the other faction
     * minions.
     */
    public double getMinionDamageScoreFactor() {
        return minionDamageScoreFactor;
    }

    /**
     * @return the factor of the experience points gained by the wizard for killing the other faction minion.
     * <p>
     * Applies to the maximal amount of minion's hitpoints.
     */
    public double getMinionEliminationScoreFactor() {
        return minionEliminationScoreFactor;
    }

    /**
     * @return the factor of the experience points gained by the wizard for the damage dealt to the opposite faction
     * wizards.
     */
    public double getWizardDamageScoreFactor() {
        return wizardDamageScoreFactor;
    }

    /**
     * @return the factor of the experience points gained by the wizard for killing the opposite faction wizard.
     * <p>
     * Applies to the maximal amount of wizard's hitpoints.
     */
    public double getWizardEliminationScoreFactor() {
        return wizardEliminationScoreFactor;
    }

    /**
     * @return the experience multiplier applied in case, if the enemy unit died near two or more friendly wizards.
     * <p>
     * After applying this multiplier, the amount of the experience is rounded down.
     */
    public double getTeamWorkingScoreFactor() {
        return teamWorkingScoreFactor;
    }

    /**
     * @return the amount of experience points received by each player of the faction in case of victory.
     */
    public int getVictoryScore() {
        return victoryScore;
    }

    /**
     * @return the maximal range, at which a wizard gains experience points in case, if a friendly unit kills an other
     * faction unit.
     * <p>
     * The experience is evenly distributed between all the wizards not farther than {@code scoreGainRange} from a
     * killed unit, and the killer unit if he is also a wizard.
     * <p>
     * If the damage is not fatal, this parameter is not used. If the attacker is a wizard, than the experience
     * completely goes to this wizard. If the attacker is a minion or a building, nobody gains an experience.
     * <p>
     * The range is considered as the range between units' centers.
     */
    public double getScoreGainRange() {
        return scoreGainRange;
    }

    /**
     * @return the maximal possible length of a raw message.
     * <p>
     * If a message has higher length, then it will be completely ignored.
     */
    public int getRawMessageMaxLength() {
        return rawMessageMaxLength;
    }

    /**
     * @return the raw message transmission speed.
     * <p>
     * If the raw message is empty, the addressee will receive it in the next game tick. In other case, the time of
     * receipt of the message will be delayed for {@code ceil(message.rawMessage.length / rawMessageTransmissionSpeed)}
     * game ticks.
     */
    public double getRawMessageTransmissionSpeed() {
        return rawMessageTransmissionSpeed;
    }

    /**
     * @return the radius of a wizard.
     */
    public double getWizardRadius() {
        return wizardRadius;
    }

    /**
     * @return the base cast range of a wizard.
     * <p>
     * The effective cast range ({@code wizard.castRange}) may be higher depending on skills of the wizard and auras of
     * nearby friendly wizards.
     */
    public double getWizardCastRange() {
        return wizardCastRange;
    }

    /**
     * @return the maximal range (between units' centers), at which a wizard can detect other units.
     */
    public double getWizardVisionRange() {
        return wizardVisionRange;
    }

    /**
     * @return the base limit of wizard's forward speed.
     * <p>
     * The effective forward speed may be higher depending on skills of the wizard and auras of nearby friendly
     * wizards. The {@code HASTENED} status can also greatly speed up a wizard.
     */
    public double getWizardForwardSpeed() {
        return wizardForwardSpeed;
    }

    /**
     * @return the base limit of wizard's backward speed.
     * <p>
     * The effective backward speed may be higher depending on skills of the wizard and auras of nearby friendly
     * wizards. The {@code HASTENED} status can also greatly speed up a wizard.
     */
    public double getWizardBackwardSpeed() {
        return wizardBackwardSpeed;
    }

    /**
     * @return the base limit of wizard's strafe speed.
     * <p>
     * The effective strafe speed may be higher depending on skills of the wizard and auras of nearby friendly
     * wizards. The {@code HASTENED} status can also greatly speed up a wizard.
     */
    public double getWizardStrafeSpeed() {
        return wizardStrafeSpeed;
    }

    /**
     * @return the maximal amount of wizard's hitpoints at initial level.
     */
    public int getWizardBaseLife() {
        return wizardBaseLife;
    }

    /**
     * @return the growth of wizard's hitpoints per level.
     */
    public int getWizardLifeGrowthPerLevel() {
        return wizardLifeGrowthPerLevel;
    }

    /**
     * @return the maximal amount of wizard's manapoints at initial level.
     */
    public int getWizardBaseMana() {
        return wizardBaseMana;
    }

    /**
     * @return the growth of wizard's manapoints per level.
     */
    public int getWizardManaGrowthPerLevel() {
        return wizardManaGrowthPerLevel;
    }

    /**
     * @return the regeneration speed of wizard's hitpoints at initial level.
     */
    public double getWizardBaseLifeRegeneration() {
        return wizardBaseLifeRegeneration;
    }

    /**
     * @return the growth of the regeneration speed of wizard's hitpoints.
     */
    public double getWizardLifeRegenerationGrowthPerLevel() {
        return wizardLifeRegenerationGrowthPerLevel;
    }

    /**
     * @return the regeneration speed of wizard's manapoints at initial level.
     */
    public double getWizardBaseManaRegeneration() {
        return wizardBaseManaRegeneration;
    }

    /**
     * @return the growth of the regeneration speed of wizard's manapoints.
     */
    public double getWizardManaRegenerationGrowthPerLevel() {
        return wizardManaRegenerationGrowthPerLevel;
    }

    /**
     * @return the base limit of wizard's turn speed.
     * <p>
     * The {@code HASTENED} status increases this limit by {@code 1.0 + hastenedRotationBonusFactor} times.
     */
    public double getWizardMaxTurnAngle() {
        return wizardMaxTurnAngle;
    }

    /**
     * @return the maximal possible delay of a wizard's revival.
     */
    public int getWizardMaxResurrectionDelayTicks() {
        return wizardMaxResurrectionDelayTicks;
    }

    /**
     * @return the minimal possible delay of a wizard's revival.
     */
    public int getWizardMinResurrectionDelayTicks() {
        return wizardMinResurrectionDelayTicks;
    }

    /**
     * @return the minimal possible interval between any two actions of a wizard.
     */
    public int getWizardActionCooldownTicks() {
        return wizardActionCooldownTicks;
    }

    /**
     * @return the minimal possible interval between any two staff attacks.
     */
    public int getStaffCooldownTicks() {
        return staffCooldownTicks;
    }

    /**
     * @return the minimal possible interval between any two ``Magic missile'' spell casts.
     */
    public int getMagicMissileCooldownTicks() {
        return magicMissileCooldownTicks;
    }

    /**
     * @return the minimal possible interval between any two ``Frost bolt'' spell casts.
     */
    public int getFrostBoltCooldownTicks() {
        return frostBoltCooldownTicks;
    }

    /**
     * @return the minimal possible interval between any two ``Fireball'' spell casts.
     */
    public int getFireballCooldownTicks() {
        return fireballCooldownTicks;
    }

    /**
     * @return the minimal possible interval between any two ``Haste'' spell casts.
     */
    public int getHasteCooldownTicks() {
        return hasteCooldownTicks;
    }

    /**
     * @return the minimal possible interval between any two ``Shield'' spell casts.
     */
    public int getShieldCooldownTicks() {
        return shieldCooldownTicks;
    }

    /**
     * @return the ``Magic missile'' spell manacost.
     */
    public int getMagicMissileManacost() {
        return magicMissileManacost;
    }

    /**
     * @return the ``Frost bolt'' spell manacost.
     */
    public int getFrostBoltManacost() {
        return frostBoltManacost;
    }

    /**
     * @return the ``Fireball'' spell manacost.
     */
    public int getFireballManacost() {
        return fireballManacost;
    }

    /**
     * @return the ``Haste'' spell manacost.
     */
    public int getHasteManacost() {
        return hasteManacost;
    }

    /**
     * @return the ``Shield'' spell manacost.
     */
    public int getShieldManacost() {
        return shieldManacost;
    }

    /**
     * @return the base staff damage.
     * <p>
     * The effective damage may be higher depending on skills of the wizard and auras of nearby friendly wizards.
     */
    public int getStaffDamage() {
        return staffDamage;
    }

    /**
     * @return the wizard's staff sector.
     * <p>
     * A staff attack damages all living units in a sector of {@code -staffSector / 2.0} to {@code staffSector / 2.0}.
     * This also applies to the status spells and to the relative projectile angle.
     */
    public double getStaffSector() {
        return staffSector;
    }

    /**
     * @return the wizard's staff range.
     * <p>
     * A staff attack damages all living units if the distance between wizard's and target's centers is not greater than
     * {@code staffRange + livingUnit.radius}.
     */
    public double getStaffRange() {
        return staffRange;
    }

    /**
     * @return the non-negative integers.
     * <p>
     * The numbers of items is equal to the number of levels a wizard can gain. An item {@code N} mean a number of
     * experience points a wizard of level {@code N} should get to reach the next level. Thus, the amount of experience
     * required for the zero level wizard to get to the level {@code N}, is the sum of the first {@code N} elements.
     */
    public int[] getLevelUpXpValues() {
        return levelUpXpValues.length == 0 ? levelUpXpValues : Arrays.copyOf(levelUpXpValues, levelUpXpValues.length);
    }

    /**
     * @return the radius of a minion.
     */
    public double getMinionRadius() {
        return minionRadius;
    }

    /**
     * @return the maximal range (between units' centers), at which a minion can detect other units.
     */
    public double getMinionVisionRange() {
        return minionVisionRange;
    }

    /**
     * @return the forward speed of a minion.
     * <p>
     * A minion can not strafe or move backward.
     */
    public double getMinionSpeed() {
        return minionSpeed;
    }

    /**
     * @return the maximal turn speed of a minion.
     */
    public double getMinionMaxTurnAngle() {
        return minionMaxTurnAngle;
    }

    /**
     * @return the maximal amount of minion's hitpoints.
     */
    public int getMinionLife() {
        return minionLife;
    }

    /**
     * @return the interval at which appear the minions of the two opposing factions ({@code ACADEMY} and
     * {@code RENEGADES}).
     * <p>
     * The minions of each of these factions appear in three groups near their base (one group per lane). Each group
     * consists of three orcs and one fetish. The minions immediately begin to advance on their lane toward the opposite
     * faction base, attacking all enemies in their path.
     */
    public int getFactionMinionAppearanceIntervalTicks() {
        return factionMinionAppearanceIntervalTicks;
    }

    /**
     * @return the minimal possible interval between any two attacks of an orc.
     */
    public int getOrcWoodcutterActionCooldownTicks() {
        return orcWoodcutterActionCooldownTicks;
    }

    /**
     * @return the damage of one attack of an orc.
     */
    public int getOrcWoodcutterDamage() {
        return orcWoodcutterDamage;
    }

    /**
     * @return the orc's axe sector.
     * <p>
     * An axe attack damages all living units in a sector of {@code -orcWoodcutterAttackSector / 2.0} to
     * {@code orcWoodcutterAttackSector / 2.0}.
     */
    public double getOrcWoodcutterAttackSector() {
        return orcWoodcutterAttackSector;
    }

    /**
     * @return the orc's axe range.
     * <p>
     * An axe attack damages all living units if the distance between orc's and target's centers is not greater than
     * {@code orcWoodcutterAttackRange + livingUnit.radius}.
     */
    public double getOrcWoodcutterAttackRange() {
        return orcWoodcutterAttackRange;
    }

    /**
     * @return the minimal possible interval between any two attacks of a fetish.
     */
    public int getFetishBlowdartActionCooldownTicks() {
        return fetishBlowdartActionCooldownTicks;
    }

    /**
     * @return the maximal dart fly range.
     */
    public double getFetishBlowdartAttackRange() {
        return fetishBlowdartAttackRange;
    }

    /**
     * @return the dart throw sector.
     * <p>
     * The relative angle of a dart is in range of {@code -fetishBlowdartAttackSector / 2.0} to
     * {@code fetishBlowdartAttackSector / 2.0}.
     */
    public double getFetishBlowdartAttackSector() {
        return fetishBlowdartAttackSector;
    }

    /**
     * @return the radius of a bonus.
     */
    public double getBonusRadius() {
        return bonusRadius;
    }

    /**
     * @return the interval at which appears a bonus.
     * <p>
     * Every $2500$ ticks up to two bonuses may appear on the map. The bonuses are created at the two following points:
     * ({@code mapSize * 0.3}, {@code mapSize * 0.3}) and ({@code mapSize * 0.7}, {@code mapSize * 0.7}). If any part of
     * the new bonus area is already occupied by a wizard or by an existing bonus, then the creation of the bonus will
     * be postponed till the end of the next interval.
     */
    public int getBonusAppearanceIntervalTicks() {
        return bonusAppearanceIntervalTicks;
    }

    /**
     * @return the amount of score and experience points for taking a bonus.
     */
    public int getBonusScoreAmount() {
        return bonusScoreAmount;
    }

    /**
     * @return the radius of a dart.
     */
    public double getDartRadius() {
        return dartRadius;
    }

    /**
     * @return the dart speed.
     */
    public double getDartSpeed() {
        return dartSpeed;
    }

    /**
     * @return the dart damage.
     */
    public int getDartDirectDamage() {
        return dartDirectDamage;
    }

    /**
     * @return the radius of a magic missile projectile.
     */
    public double getMagicMissileRadius() {
        return magicMissileRadius;
    }

    /**
     * @return the magic missile projectile speed.
     */
    public double getMagicMissileSpeed() {
        return magicMissileSpeed;
    }

    /**
     * @return the magic missile projectile damage.
     */
    public int getMagicMissileDirectDamage() {
        return magicMissileDirectDamage;
    }

    /**
     * @return the radius of a frost bolt projectile.
     */
    public double getFrostBoltRadius() {
        return frostBoltRadius;
    }

    /**
     * @return the frost bolt projectile speed.
     */
    public double getFrostBoltSpeed() {
        return frostBoltSpeed;
    }

    /**
     * @return the frost bolt projectile damage.
     */
    public int getFrostBoltDirectDamage() {
        return frostBoltDirectDamage;
    }

    /**
     * @return the radius of a fireball projectile.
     */
    public double getFireballRadius() {
        return fireballRadius;
    }

    /**
     * @return the fireball projectile speed.
     */
    public double getFireballSpeed() {
        return fireballSpeed;
    }

    /**
     * @return the radius of the area in which living units are taking maximal damage from the fireball projectile
     * explosion.
     * @see #getFireballExplosionMaxDamage()
     */
    public double getFireballExplosionMaxDamageRange() {
        return fireballExplosionMaxDamageRange;
    }

    /**
     * @return the radius of the area in which living units are taking any damage from the fireball projectile
     * explosion.
     * @see #getFireballExplosionMaxDamage()
     */
    public double getFireballExplosionMinDamageRange() {
        return fireballExplosionMinDamageRange;
    }

    /**
     * @return the damage of the fireball at the epicenter of the explosion.
     * <p>
     * A living unit takes the {@code fireballExplosionMaxDamage} if the distance from the center of the explosion to
     * the nearest point of this unit does not exceed the {@code fireballExplosionMaxDamageRange}. As you increase the
     * distance to the {@code fireballExplosionMinDamageRange}, the damage of the fireball decreases in a linear manner
     * and reaches {@code fireballExplosionMinDamage}. If the distance from the center of the explosion to the nearest
     * point of the living unit exceeds {@code fireballExplosionMinDamageRange}, this unit takes no damage.
     * <p>
     * If a living unit takes any damage from the fireball explosion, it receives a {@code BURNING} status.
     */
    public int getFireballExplosionMaxDamage() {
        return fireballExplosionMaxDamage;
    }

    /**
     * @return the damage of the fireball on the periphery of the explosion.
     * @see #getFireballExplosionMaxDamage()
     */
    public int getFireballExplosionMinDamage() {
        return fireballExplosionMinDamage;
    }

    /**
     * @return the radius of a guardian tower.
     */
    public double getGuardianTowerRadius() {
        return guardianTowerRadius;
    }

    /**
     * @return the maximal range (between units' centers), at which a guardian tower can detect other units.
     */
    public double getGuardianTowerVisionRange() {
        return guardianTowerVisionRange;
    }

    /**
     * @return the maximal amount of guardian tower's hitpoints.
     */
    public double getGuardianTowerLife() {
        return guardianTowerLife;
    }

    /**
     * @return the maximal range (between units' centers), at which a guardian tower can attack other units.
     */
    public double getGuardianTowerAttackRange() {
        return guardianTowerAttackRange;
    }

    /**
     * @return the damage of one attack of a guardian tower.
     */
    public int getGuardianTowerDamage() {
        return guardianTowerDamage;
    }

    /**
     * @return the minimal possible interval between any two attacks of a guardian tower.
     */
    public int getGuardianTowerCooldownTicks() {
        return guardianTowerCooldownTicks;
    }

    /**
     * @return the radius of a faction base.
     */
    public double getFactionBaseRadius() {
        return factionBaseRadius;
    }

    /**
     * @return the maximal range (between units' centers), at which a faction base can detect other units.
     */
    public double getFactionBaseVisionRange() {
        return factionBaseVisionRange;
    }

    /**
     * @return the maximal amount of faction base's hitpoints.
     */
    public double getFactionBaseLife() {
        return factionBaseLife;
    }

    /**
     * @return the maximal range (between units' centers), at which a faction base can attack other units.
     */
    public double getFactionBaseAttackRange() {
        return factionBaseAttackRange;
    }

    /**
     * @return the damage of one attack of a faction base.
     */
    public int getFactionBaseDamage() {
        return factionBaseDamage;
    }

    /**
     * @return the minimal possible interval between any two attacks of a faction base.
     */
    public int getFactionBaseCooldownTicks() {
        return factionBaseCooldownTicks;
    }

    /**
     * @return the duration of the {@code BURNING} status.
     */
    public int getBurningDurationTicks() {
        return burningDurationTicks;
    }

    /**
     * @return the total damage of the {@code BURNING} status.
     */
    public int getBurningSummaryDamage() {
        return burningSummaryDamage;
    }

    /**
     * @return the duration of the {@code EMPOWERED} status.
     */
    public int getEmpoweredDurationTicks() {
        return empoweredDurationTicks;
    }

    /**
     * @return the damage multiplier of empowered living unit. DOT (damage over time) is excluded.
     */
    public double getEmpoweredDamageFactor() {
        return empoweredDamageFactor;
    }

    /**
     * @return the duration of the {@code FROZEN} status.
     */
    public int getFrozenDurationTicks() {
        return frozenDurationTicks;
    }

    /**
     * @return the duration of the {@code HASTENED} status.
     */
    public int getHastenedDurationTicks() {
        return hastenedDurationTicks;
    }

    /**
     * @return the {@code HASTENED} status duration multiplier (in case of taking a bonus).
     */
    public double getHastenedBonusDurationFactor() {
        return hastenedBonusDurationFactor;
    }

    /**
     * @return the relative move speed boost of a hastened unit.
     * <p>
     * The maximal possible wizard speed is
     * {@code 1.0 + 4.0 * movementBonusFactorPerSkillLevel + hastenedMovementBonusFactor} of the base speed.
     */
    public double getHastenedMovementBonusFactor() {
        return hastenedMovementBonusFactor;
    }

    /**
     * @return the relative turn speed boost of a hastened unit.
     */
    public double getHastenedRotationBonusFactor() {
        return hastenedRotationBonusFactor;
    }

    /**
     * @return the {@code SHIELDED} duration.
     */
    public int getShieldedDurationTicks() {
        return shieldedDurationTicks;
    }

    /**
     * @return the {@code SHIELDED} status duration multiplier (in case of taking a bonus).
     */
    public double getShieldedBonusDurationFactor() {
        return shieldedBonusDurationFactor;
    }

    /**
     * @return the damage part absorbed by shield. DOT (damage over time) is excluded.
     */
    public double getShieldedDirectDamageAbsorptionFactor() {
        return shieldedDirectDamageAbsorptionFactor;
    }

    /**
     * @return the range of an aura skill.
     */
    public double getAuraSkillRange() {
        return auraSkillRange;
    }

    /**
     * @return the absolute increase of the wizard cast range for each learned skill, which is one of the
     * prerequisites of the {@code ADVANCED_MAGIC_MISSILE} skill.
     */
    public double getRangeBonusPerSkillLevel() {
        return rangeBonusPerSkillLevel;
    }

    /**
     * @return the absolute increase of the wizard spell damage for each learned skill, which is one of the
     * prerequisites of the {@code FROST_BOLT} skill. DOT (damage over time) is excluded.
     */
    public int getMagicalDamageBonusPerSkillLevel() {
        return magicalDamageBonusPerSkillLevel;
    }

    /**
     * @return the absolute increase of the wizard staff damage for each learned skill, which is one of the
     * prerequisites of the {@code FIREBALL} skill.
     */
    public int getStaffDamageBonusPerSkillLevel() {
        return staffDamageBonusPerSkillLevel;
    }

    /**
     * @return the relative increase of the move speed for each learned skill, which is one of the
     * prerequisites of the {@code HASTE} skill.
     * <p>
     * The maximal possible wizard speed is
     * {@code 1.0 + 4.0 * movementBonusFactorPerSkillLevel + hastenedMovementBonusFactor} of the base speed.
     */
    public double getMovementBonusFactorPerSkillLevel() {
        return movementBonusFactorPerSkillLevel;
    }

    /**
     * @return the absolute decrease of the incoming magical damage for each learned skill, which is one of the
     * prerequisites of the {@code SHIELD} skill. DOT (damage over time) is excluded.
     */
    public int getMagicalDamageAbsorptionPerSkillLevel() {
        return magicalDamageAbsorptionPerSkillLevel;
    }
}
