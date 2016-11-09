package model;

/**
 * This class is inherited from a living unit and describes a tree.
 */
public class Tree extends LivingUnit {
    public Tree(
            long id, double x, double y, double speedX, double speedY, double angle, Faction faction, double radius,
            int life, int maxLife, Status[] statuses) {
        super(id, x, y, speedX, speedY, angle, faction, radius, life, maxLife, statuses);
    }
}
