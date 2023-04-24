package com.hbnu.controller;

import com.hbnu.pojo.Door;
import com.hbnu.service.DoorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DoorController {

    @Resource
    private DoorService doorService;

    @RequestMapping("/doorList")
    public String doorsList(Model model) {
        List<Door> doors = doorService.findAllDoors();
        model.addAttribute("list", doors);
        return "door_list";
    }

    //    新增门店
    @RequestMapping("/doorAdd")
    public String addAllDoorToOrderAdd(Door d) {
        int door = doorService.addDoor(d);
        if (door == 1) {
            return "redirect:/doorList";
        }
        return "redirect:500.jsp";
    }

    //    修改
//    找到需要修改的门店
    @RequestMapping("/doorInfo")
    public String doorInfo(Model model, int id) {
        Door door = doorService.findDoorById(id);
        model.addAttribute("door", door);
        return "door_update";
    }

    //    进行修改操作
    @RequestMapping("/doorUpdate")
    public String doorUpdate(Model model, Door d) {
        int door = doorService.doorUpdate(d);
        if (door == 1) {
            return "redirect:/doorList";
        }
        return "redirect:500.jsp";
    }


    //    删除
    @RequestMapping("/doorDelete")
    public String deleteDoor(int id) {
        int delete = doorService.deleteDoor(id);
        if (delete == 1) {
            return "redirect:/doorList";
        }
        return "redirect:500.jsp";
    }
}
