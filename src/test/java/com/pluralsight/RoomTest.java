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

    @Test
    public void see_if_checkOut_is_not_occupied_or_clean() {
        //Arrange
        Room room = new Room("King", 2,1);

        //act
        room.checkOut();

        //Assert
        assertFalse(room.isOccupied());
        assertFalse(room.isClean());
    }

    @Test
    public void is_room_clean() {
        Room room = new Room("King", 2,1);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isClean());
        room.checkIn();

    }

    @Test
    public void verify_punchIn_time() {
        Employees employee = new Employees(100,"Tevyn", "Software");

        //act
        employee.punchIn(9);

        //assert
        assertEquals(9,employee.getStartTime());
    }

}