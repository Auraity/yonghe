package com.hbnu.service.impl;

import com.hbnu.dao.DoorMapper;
import com.hbnu.pojo.Door;
import com.hbnu.service.DoorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoorServiceImpl implements DoorService {

    @Resource
    private DoorMapper doorMapper;

    public List<Door> findAllDoors() {
        return doorMapper.findAllDoors();
    }

    public int addDoor(Door door) {
        return doorMapper.addDoor(door);
    }

    public Door findDoorById(int id) {
        return doorMapper.findDoorById(id);
    }

    public int doorUpdate(Door door) {
        return doorMapper.doorUpdate(door);
    }

    public int deleteDoor(int id) {
        return doorMapper.deleteDoor(id);
    }
}
