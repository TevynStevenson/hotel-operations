package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    //Test
    @Test
    public void see_if_checkIn_room_is_occupied_or_dirty() {

        //arrange
        Room room = new Room("King", 2,1);

        //act
        room.checkIn();

        //assert
        assertFalse(room.isOccupied());
        assertFalse(room.isClean());

    }



}