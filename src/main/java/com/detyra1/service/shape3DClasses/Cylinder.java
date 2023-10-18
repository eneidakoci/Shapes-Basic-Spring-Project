package com.detyra1.service.shape3DClasses;

import com.detyra1.service.shapeInterfaces.Shape3D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("cylinder")
@Component
public class Cylinder implements Shape3D {
    @Override
    public Boolean isShapeTypeSupported(String shapeType) {
        if ("cylinder".equalsIgnoreCase(shapeType)) {
            return true;
        }
        return false;
    }

    @Override
    public double calculateArea(double[] dimensions) {
        return (2 * Math.PI * dimensions[0] * (dimensions[0] + dimensions[1]));
    }

    @Override
    public double calculateVolume(double[] parameters) {
        return (Math.PI * parameters[0] * parameters[0] * parameters[1]);
    }
}