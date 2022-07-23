/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.uml_converter.models;

import java.util.List;

public class BaseProject {

    private String projectName;
    private List<BaseClass> objects;

    public BaseProject(String projectName, List<BaseClass> objects) {
        this.projectName = projectName;
        this.objects = objects;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<BaseClass> getObjects() {
        return objects;
    }

    public void setObjects(List<BaseClass> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Project{" + "projectName=" + projectName + ", objects=" + objects.toString() + '}';
    }

}
