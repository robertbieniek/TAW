package com.example.demo4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@Scope("singleton")
public class ActivityDatabase {
    private List<Activity> activityList = new ArrayList<>();
    private int activityIndex = 1;

    public void addActivity(Activity element){
        element.setId(activityIndex);
        activityList.add(element);
        activityIndex = activityIndex + 1;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

public List<Activity> getActivityList(Integer classroom, String name, Integer ects, String exam) {
    Stream<Activity> activityStream = activityList.stream();
    if (classroom != null) {
        activityStream = activityStream.filter(activity -> activity.getClassroom().equals(classroom));
    }
    if (name != null) {
        activityStream = activityStream.filter(activity -> activity.getName().equals(name));
    }
    if (ects != null) {
        activityStream = activityStream.filter(activity -> activity.getEcts().equals(ects));
    }
    if (exam != null) {
        activityStream = activityStream.filter(activity -> activity.getExam().equals(exam));
    }
    return activityStream.collect(Collectors.toList());
}
    public void deleteAll(){
        activityList.clear();
    }

    public Activity getActivityById(Integer id) {
        for (Activity element : activityList) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }

    public boolean deleteById(Integer id) {
        Activity activityToDelete = null;
        for (Activity element : activityList) {
            if (element.getId().equals(id)) {
                activityToDelete = element;
            }
        }
        if (activityToDelete == null) {
            return false;
        }
        activityList.remove(activityToDelete);
        return true;
    }
}
