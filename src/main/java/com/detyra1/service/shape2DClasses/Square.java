package com.detyra1.service.shape2DClasses;

import com.detyra1.service.shapeInterfaces.Shape2D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("square")
@Component
public class Square implements Shape2D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        if ("square".equalsIgnoreCase(shapeType)) {
            return true;
        }
        return false;
    }

    @Override
    public double calculatePerimeter(double[] sideLengths) {
        return 4 * sideLengths[0];
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return dimensions[0] * dimensions[0];
    }
}