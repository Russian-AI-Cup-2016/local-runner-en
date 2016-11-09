package model;

/**
 * Lane type.
 */
public enum LaneType {
    /**
     * Top lane. It goes through the lower left, the upper left and the upper right corners of the map.
     */
    TOP,

    /**
     * Middle lane. Directly connects the lower left and the upper right corners of the map.
     */
    MIDDLE,

    /**
     * Bottom lane. It goes through the lower left, the lower right and the upper right corners of the map.
     */
    BOTTOM
}
