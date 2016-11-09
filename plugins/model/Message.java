package model;

import java.util.Arrays;

/**
 * This class describes a message, that master wizard can send to other wizards of his faction.
 * <p>
 * The message is sent personally to each wizard. Other wizards are unable to intercept him.
 * <p>
 * The recipient receives the message in the next game tick or later, depending on the size of the message.
 * <p>
 * The wizard is free to ignore as any part of the message and the entire message, however this can lead to the defeat
 * of wizard's faction.
 */
public class Message {
    private final LaneType lane;
    private final SkillType skillToLearn;
    private final byte[] rawMessage;

    public Message(LaneType lane, SkillType skillToLearn, byte[] rawMessage) {
        this.lane = lane;
        this.skillToLearn = skillToLearn;
        this.rawMessage = Arrays.copyOf(rawMessage, rawMessage.length);
    }

    /**
     * @return the order to control the specified lane.
     */
    public LaneType getLane() {
        return lane;
    }

    /**
     * @return the order to learn the specified skill.
     *
     * This skill may require to learn other skills or be unavailable for learning at the moment due to the low level.
     * The wizard should remember the order and move towards its achievement. The later the order, the higher the
     * priority.
     * <p>
     * The field value may not be available in all game modes.
     */
    public SkillType getSkillToLearn() {
        return skillToLearn;
    }

    /**
     * @return the text message in a forgotten ancient language.
     * <p>
     * The maximal message length is {@code game.rawMessageMaxLength}. The speed of sending a message depends on its
     * length. If the text part of the message is empty, the addressee will receive it in the next game tick. In other
     * case, the time of receipt of the message will be delayed for
     * {@code ceil(rawMessage.length / game.rawMessageTransmissionSpeed)} game ticks.
     * <p>
     * The field value may not be available in all game modes.
     */
    public byte[] getRawMessage() {
        return Arrays.copyOf(rawMessage, rawMessage.length);
    }
}
