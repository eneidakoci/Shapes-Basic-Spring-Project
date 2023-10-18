package com.detyra1.service.shape2DClasses;

import com.detyra1.service.shapeInterfaces.Shape2D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("trapezoid")
@Component
public class Trapezoid implements Shape2D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        if ("trapezoid".equalsIgnoreCase(shapeType)) {
            return true;
        }
        return false;
    }

    @Override
    public double calculatePerimeter(double[] sideLengths) {
        return (sideLengths[0] + sideLengths[1] + sideLengths[2] + sideLengths[3]);
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return ((dimensions[0] + dimensions[1]) * dimensions[2]) / 2;
    }
}