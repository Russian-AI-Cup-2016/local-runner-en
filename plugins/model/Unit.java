package model;


import static java.lang.StrictMath.PI;
import static java.lang.StrictMath.atan2;
import static java.lang.StrictMath.hypot;

/**
 * Base class that describes any object (``unit'') in the game world.
 */
@SuppressWarnings({"AbstractClassWithoutAbstractMethods", "WeakerAccess"})
public abstract class Unit {
    private final long id;
    private final double x;
    private final double y;
    private final double speedX;
    private final double speedY;
    private final double angle;
    private final Faction faction;

    protected Unit(long id, double x, double y, double speedX, double speedY, double angle, Faction faction) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.angle = angle;
        this.faction = faction;
    }

    /**
     * @return the unique unit ID.
     */
    public long getId() {
        return id;
    }

    /**
     * @return the X of the unit's center. The X-axis is directed from left to right.
     */
    public final double getX() {
        return x;
    }

    /**
     * @return the Y of the unit's center. The Y-axis is directed downward.
     */
    public final double getY() {
        return y;
    }

    /**
     * @return the X speed component or the last tick X-coordinate change, if this unit can instantly change its speed.
     * The X-axis is directed from left to right.
     */
    public final double getSpeedX() {
        return speedX;
    }

    /**
     * @return the Y speed component or the last tick Y-coordinate change, if this unit can instantly change its speed.
     * The Y-axis is directed downward.
     */
    public final double getSpeedY() {
        return speedY;
    }

    /**
     * @return the turn angle in radians of this unit. Direction of the X-axis has zero angle.
     * Positive angle corresponds to the rotation in a clockwise direction.
     */
    public final double getAngle() {
        return angle;
    }

    /**
     * @return the faction of this unit.
     */
    public Faction getFaction() {
        return faction;
    }

    /**
     * @param x X-coordinate of the point to get the angle to.
     * @param y Y-coordinate of the point to get the angle to.
     * @return the relative angle to the specified point.
     * The angle is in range of {@code -PI} to {@code PI} both inclusive.
     */
    public double getAngleTo(double x, double y) {
        double absoluteAngleTo = atan2(y - this.y, x - this.x);
        double relativeAngleTo = absoluteAngleTo - angle;

        while (relativeAngleTo > PI) {
            relativeAngleTo -= 2.0D * PI;
        }

        while (relativeAngleTo < -PI) {
            relativeAngleTo += 2.0D * PI;
        }

        return relativeAngleTo;
    }

    /**
     * @param unit the unit to get the angle to.
     * @return the relative angle to the center of the specified unit.
     * The angle is in range of {@code -PI} to {@code PI} both inclusive.
     */
    public double getAngleTo(Unit unit) {
        return getAngleTo(unit.x, unit.y);
    }

    /**
     * @param x X-coordinate of the point to get the distance to.
     * @param y Y-coordinate of the point to get the distance to.
     * @return the range between the specified point and the center of this unit.
     */
    public double getDistanceTo(double x, double y) {
        return hypot(x - this.x, y - this.y);
    }

    /**
     * @param unit the unit to get the distance to.
     * @return the range between the center of the specified unit and the center of this unit.
     */
    public double getDistanceTo(Unit unit) {
        return getDistanceTo(unit.x, unit.y);
    }
}
