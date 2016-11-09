package model;

/**
 * Status type.
 */
public enum StatusType {
    /**
     * A living unit receives some damage each time tick.
     */
    BURNING,

    /**
     * A living unit inflicts more damage than usually, excluding DOT (damage over time).
     */
    EMPOWERED,

    /**
     * A living unit can not move or perform any actions.
     */
    FROZEN,

    /**
     * A living unit has increased move and turn speed.
     */
    HASTENED,

    /**
     * A living unit receives less damage than usually, excluding DOT (damage over time).
     */
    SHIELDED
}
