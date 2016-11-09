package model;

/**
 * Unit or player faction.
 */
public enum Faction {
    /**
     * Wizards, minions and buildings of Academy.
     */
    ACADEMY,

    /**
     * Wizards, minions and buildings of Renegades.
     */
    RENEGADES,

    /**
     * Neutral units. Do not attack first, but will strike back when damaged.
     */
    NEUTRAL,

    /**
     * All other units in the game world.
     */
    OTHER
}
