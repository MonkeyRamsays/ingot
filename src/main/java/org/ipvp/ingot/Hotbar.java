package org.ipvp.ingot;

import java.util.List;
import java.util.Optional;

/**
 * A Hotbar is a segment of a players inventory that contains 9 {@link Slot}s. 
 */
public interface Hotbar {

    /**
     * Returns the parenting hotbar
     *
     * @return The parent hotbar
     */
    Optional<Hotbar> getParent();

    /**
     * Sets the slot at a particular index in the Hotbar.
     *
     * @param index The index to set
     * @return The slot at the given index
     * @throws IllegalArgumentException If the slot provided is not between 0 and 8 (inclusive)
     */
    void setSlot(int index, Slot slot) throws IllegalArgumentException;
    
    /**
     * Returns a slot at a particular index in the Hotbar.
     * 
     * @param index The index to get
     * @return The slot at the given index
     * @throws IllegalArgumentException If the slot provided is not between 0 and 8 (inclusive)
     */
    Slot getSlot(int index) throws IllegalArgumentException;

    /**
     * Returns a list of all slots provided by the Hotbar.
     * 
     * @return A list of slots
     */
    List<Slot> getSlots();
}
