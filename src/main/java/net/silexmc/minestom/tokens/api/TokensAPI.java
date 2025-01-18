package net.silexmc.minestom.tokens.api;

import java.math.BigInteger;
import java.util.UUID;

public interface TokensAPI {
    BigInteger getTokens(UUID uniqueID);

    String getTokens(UUID uniqueID, boolean format);

    BigInteger getTotalTokens(UUID uniqueID);

    String getTotalTokens(UUID uniqueID, boolean format);

    void setTokens(UUID uniqueID, BigInteger amount);

    default void setTokens(UUID uniqueID, int amount) {
        this.setTokens(uniqueID, BigInteger.valueOf(amount));
    }

    void giveTokens(UUID uniqueID, BigInteger amount);

    default void giveTokens(UUID uniqueID, int amount) {
        this.giveTokens(uniqueID, BigInteger.valueOf(amount));
    }

    void takeTokens(UUID uniqueID, BigInteger amount);

    default void takeTokens(UUID uniqueID, int amount) {
        this.takeTokens(uniqueID, BigInteger.valueOf(amount));
    }

    boolean hasTokens(UUID uniqueID, BigInteger amount);

    default boolean hasTokens(UUID uniqueID, int amount) {
        return this.hasTokens(uniqueID, BigInteger.valueOf(amount));
    }
}
