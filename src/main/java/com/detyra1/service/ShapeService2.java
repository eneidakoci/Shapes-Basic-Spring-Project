package com.detyra1.service;

import com.detyra1.service.shape2DClasses.*;
import com.detyra1.service.shape3DClasses.*;
import com.detyra1.service.shapeInterfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapeService2 {
    /*calculateArea2D, calculatePerimeter2D, calculateArea3D, calculateVolume3D.
    Secila nga metodat ka si parameter 1. Tipin e formes(katror,trekendesh, cilinder etj), 2.
    array [] ose varargs te tipit Double dhe tipi qe kthejne metodat eshte Double.*/
    @Qualifier("square")
     @Autowired
    private Shape2D square;

    @Qualifier("triangle")
    @Autowired
    private Shape2D triangle;

    @Qualifier("rectangle")
    @Autowired
    private Shape2D rectangle;

    @Qualifier("trapezoid")
    @Autowired
    private Shape2D trapezoid;

    @Qualifier("rhombus")
    @Autowired
    private Shape2D rhombus;

    @Qualifier("cube")
    @Autowired
    private Shape3D cube;

    @Qualifier("cuboid")
    @Autowired
    private Shape3D cuboid;

    @Qualifier("cylinder")
    @Autowired
    private Shape3D cylinder;

    public double calculateArea2D(String shapeType, double...parameters){
        return switch(shapeType){
            case "square" ->square.calculateArea(parameters);
            case "rectangle" ->rectangle.calculateArea(parameters);
            case "trapezoid" -> trapezoid.calculateArea(parameters);
            case "rhombus" -> rhombus.calculateArea(parameters);
            case "triangle" ->triangle.calculateArea(parameters);
            default -> 0.0;
        };
    }
    public double calculatePerimeter2D(String shapeType, double...parameters){
        return switch(shapeType){
            case "square" ->square.calculatePerimeter(parameters);
            case "rectangle" ->rectangle.calculatePerimeter(parameters);
            case "trapezoid" -> trapezoid.calculatePerimeter(parameters);
            case "rhombus" -> rhombus.calculatePerimeter(parameters);
            case "triangle" ->triangle.calculatePerimeter(parameters);
            default -> 0.0;
        };
    }
    public double calculateArea3D(String shapeType, double...parameters){
        return switch(shapeType){
            case "cube" ->cube.calculateArea(parameters);
            case "cuboid" ->cuboid.calculateArea(parameters);
            case "cylinder" -> cylinder.calculateArea(parameters);
            default -> 0.0;
        };
    }
    public double calculateVolume3D(String shapeType, double...parameters){
        return switch(shapeType){
            case "cube" ->cube.calculateVolume(parameters);
            case "cuboid" ->cuboid.calculateVolume(parameters);
            case "cylinder" -> cylinder.calculateVolume(parameters);
            default -> 0.0;
        };
    }

}
