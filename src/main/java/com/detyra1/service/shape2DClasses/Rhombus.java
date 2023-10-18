package com.detyra1.service.shape2DClasses;

import com.detyra1.service.shapeInterfaces.Shape2D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("rhombus")
@Component
public class Rhombus implements Shape2D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        return "rhombus".equalsIgnoreCase(shapeType);
    }

    @Override
    public double calculatePerimeter(double[] sideLengths) {
        return 4 * sideLengths[0];
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return (dimensions[0] * dimensions[1]) / 2;
    }
}