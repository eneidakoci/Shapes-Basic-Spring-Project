package com.detyra1.service.shape2DClasses;

import com.detyra1.service.shapeInterfaces.Shape2D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("triangle")
@Component
public class Triangle implements Shape2D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        if ("triangle".equalsIgnoreCase(shapeType)) {
            return true;
        }
        return false;
    }

    @Override
    public double calculatePerimeter(double[] sideLengths) {
        return (double) (sideLengths[0] + sideLengths[1] + sideLengths[2]);
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return (dimensions[0] + dimensions[1]) / 2;
    }
}
