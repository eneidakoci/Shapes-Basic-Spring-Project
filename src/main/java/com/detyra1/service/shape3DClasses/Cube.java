package com.detyra1.service.shape3DClasses;

import com.detyra1.service.shapeInterfaces.Shape3D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("cube")
@Component
public class Cube implements Shape3D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        return "cube".equalsIgnoreCase(shapeType);
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return (6 * (dimensions[0] * dimensions[0]));
    }

    @Override
    public double calculateVolume(double[] parameters) {
        return (parameters[0] * parameters[0] * parameters[0]);
    }
}
