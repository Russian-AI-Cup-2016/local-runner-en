package model;

import java.util.Arrays;

/**
 * This class describes a game world. A world contains all players and game objects (``units'').
 */
public class World {
    private final int tickIndex;
    private final int tickCount;
    private final double width;
    private final double height;
    private final Player[] players;
    private final Wizard[] wizards;
    private final Minion[] minions;
    private final Projectile[] projectiles;
    private final Bonus[] bonuses;
    private final Building[] buildings;
    private final Tree[] trees;

    public World(
            int tickIndex, int tickCount, double width, double height, Player[] players, Wizard[] wizards,
            Minion[] minions, Projectile[] projectiles, Bonus[] bonuses, Building[] buildings, Tree[] trees) {
        this.tickIndex = tickIndex;
        this.tickCount = tickCount;
        this.width = width;
        this.height = height;
        this.players = Arrays.copyOf(players, players.length);
        this.wizards = Arrays.copyOf(wizards, wizards.length);
        this.minions = Arrays.copyOf(minions, minions.length);
        this.projectiles = Arrays.copyOf(projectiles, projectiles.length);
        this.bonuses = Arrays.copyOf(bonuses, bonuses.length);
        this.buildings = Arrays.copyOf(buildings, buildings.length);
        this.trees = Arrays.copyOf(trees, trees.length);
    }

    /**
     * @return the current game tick.
     */
    public int getTickIndex() {
        return tickIndex;
    }

    /**
     * @return the base game duration in ticks. A real game duration may be lower. Equals to {@code game.tickCount}.
     */
    public int getTickCount() {
        return tickCount;
    }

    /**
     * @return the world width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return the world height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return all players (in random order). After each tick the player objects are recreated.
     */
    public Player[] getPlayers() {
        return Arrays.copyOf(players, players.length);
    }

    /**
     * @return visible wizards (in random order). After each tick the wizard objects are recreated.
     */
    public Wizard[] getWizards() {
        return Arrays.copyOf(wizards, wizards.length);
    }

    /**
     * @return visible minions (in random order). After each tick the minion objects are recreated.
     */
    public Minion[] getMinions() {
        return Arrays.copyOf(minions, minions.length);
    }

    /**
     * @return visible projectiles (in random order). After each tick the projectile objects are recreated.
     */
    public Projectile[] getProjectiles() {
        return Arrays.copyOf(projectiles, projectiles.length);
    }

    /**
     * @return visible bonuses (in random order). After each tick the bonus objects are recreated.
     */
    public Bonus[] getBonuses() {
        return Arrays.copyOf(bonuses, bonuses.length);
    }

    /**
     * @return visible buildings (in random order). After each tick the building objects are recreated.
     */
    public Building[] getBuildings() {
        return Arrays.copyOf(buildings, buildings.length);
    }

    /**
     * @return visible trees (in random order). After each tick the tree objects are recreated.
     */
    public Tree[] getTrees() {
        return Arrays.copyOf(trees, trees.length);
    }

    /**
     * @return your player.
     */
    public Player getMyPlayer() {
        for (int playerIndex = players.length - 1; playerIndex >= 0; --playerIndex) {
            Player player = players[playerIndex];
            if (player.isMe()) {
                return player;
            }
        }

        return null;
    }
}
