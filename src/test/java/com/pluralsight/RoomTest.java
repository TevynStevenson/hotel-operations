package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    //Test
    @Test
    public void see_if_checkIn_room_is_occupied() {

        //arrange
        Room room = new Room("King", 2,1, false, true);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());

    }

    @Test
    public void see_if_check_in_room_is_dirty(){
        Room room = new Room("King", 2,1, false, true);

        //act
        room.checkIn();

        //assert
        assertFalse(room.isClean());
    }

    @Test
    public void see_if_checkOut_is_not_occupied() {
        //Arrange
        Room room = new Room("King", 2,1, true, true);

        //act
        room.checkOut();

        //Assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void see_if_checkOut_is_not_clean() {
        Room room = new Room("King", 2,1, true, true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isClean());
    }

    @Test
    public void is_room_clean() {
        Room room = new Room("King", 2,1, true, true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isClean());

    }

    @Test
    public void verify_punchIn_time() {
        Employees employee = new Employees(100,"Tevyn", "Software");

        //act
        employee.punchIn(9);

        //assert
        assertEquals(9,employee.getStartTime());
    }


    @Test
    public void verify_punchOut_time() {
        Employees employee = new Employees(100,"Tevyn", "Software");

        //act
        employee.punchOut(9);

        //assert
        assertEquals(9,employee.getHoursWorked(), .0001);
    }

    @Test
    public void check_if_price_is_correct(){
        Reservation reservation = new Reservation("king", 1,1);

        //act
        reservation.getPrice();

        //assert
        assertEquals(139.00,reservation.getPrice(), .0001);
    }



}