package com.ejemplo.tareas.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    private List<String> tareas = new ArrayList<>();

    @GetMapping
    public List<String> getTareas(){
        return tareas;
    }

    @GetMapping("/{index}")
    public String getTarea(@PathVariable int index){
        if(index>=0&&index<tareas.size()){
            return tareas.get(index);
        }
        return "index no valido";

    }

    @PostMapping
    public String addTarea(@RequestBody String tarea){
        tareas.add(tarea);
        return "Ha agregada esta tarea "+tarea;
    }

    @DeleteMapping("/{index}")
    public String deleteTarea(@PathVariable int index){
        if(index>=0&&index<tareas.size()){
            String tareaEliminada = tareas.remove(index);
            return String."Tarea eliminada "+tareaEliminada;
        }
        return "index no valido";
    }
}
