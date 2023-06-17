package com.example.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api")
public class TestApi {

    @Autowired
    private ActivityDatabase activityDatabase;

    @PostMapping(value = "activities",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addNewActivity(@RequestBody Activity element){
        activityDatabase.addActivity(element);
    }

    @GetMapping(value = "activities",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Activity> getActivities(
            @Nullable @RequestParam("classroom") Integer classroom,
            @Nullable @RequestParam("name") String name,
            @Nullable @RequestParam("ects") Integer ects,
            @Nullable @RequestParam("exam") String exam)
    {
        return activityDatabase.getActivityList(classroom, name, ects, exam);
    }

    @DeleteMapping(value = "activities")
    public void deleteAll(){
        activityDatabase.deleteAll();
    }

    @GetMapping(value = "activities/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getActivityById(@PathVariable("id") Integer id) {
        Activity activity = activityDatabase.getActivityById(id);
        if (activity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(activity);
    }

    @DeleteMapping(value = "activities/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id){
        if (activityDatabase.deleteById(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
