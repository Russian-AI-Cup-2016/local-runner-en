package model;

/**
 * A magical status, affecting living unit.
 */
public class Status {
    private final long id;
    private final StatusType type;
    private final long wizardId;
    private final long playerId;
    private final int remainingDurationTicks;

    public Status(long id, StatusType type, long wizardId, long playerId, int remainingDurationTicks) {
        this.id = id;
        this.type = type;
        this.wizardId = wizardId;
        this.playerId = playerId;
        this.remainingDurationTicks = remainingDurationTicks;
    }

    /**
     * @return the unique status ID.
     */
    public long getId() {
        return id;
    }

    /**
     * @return the status type.
     */
    public StatusType getType() {
        return type;
    }

    /**
     * @return the ID of the wizard casted this status or {@code -1}.
     */
    public long getWizardId() {
        return wizardId;
    }

    /**
     * @return the ID of the player, which unit casted this status, or {@code -1}.
     */
    public long getPlayerId() {
        return playerId;
    }

    /**
     * @return the remaining status duration.
     */
    public int getRemainingDurationTicks() {
        return remainingDurationTicks;
    }
}
