package com.detyra1.service.shape2DClasses;

import com.detyra1.service.shapeInterfaces.Shape2D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("rectangle")
@Component
public class Rectangle implements Shape2D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        return "rectangle".equalsIgnoreCase(shapeType);
    }

    @Override
    public double calculatePerimeter(double[] sideLengths) {
        return (2 * sideLengths[0]) + (2 * sideLengths[1]);
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return dimensions[0] * dimensions[1];
    }
}