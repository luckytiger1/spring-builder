package com.example;

@Deprecated
public class CoronaDisinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Starting desinfection, everyone get out!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("You can come in!");
    }

    private void disinfect(Room room) {
        System.out.println("Disinfecting this room");
    }
}
