package com.hbnu.service;

import com.hbnu.pojo.Door;

import java.util.List;

public interface DoorService {
    List<Door> findAllDoors();
    int addDoor(Door door);
    Door findDoorById(int id);
    int doorUpdate(Door door);
    int deleteDoor(int id);
}
