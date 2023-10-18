package com.detyra1.service.shape3DClasses;

import com.detyra1.service.shapeInterfaces.Shape3D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("cuboid")
@Component
public class Cuboid implements Shape3D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        if ("cuboid".equalsIgnoreCase(shapeType)) {
            return true;
        }
        return false;
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return (2 * ((dimensions[0] * dimensions[1]) + (dimensions[2] * dimensions[1]) + (dimensions[0] + dimensions[2])));
    }

    @Override
    public double calculateVolume(double[] parameters) {
        return (parameters[0] * parameters[1] * parameters[2]);
    }
}