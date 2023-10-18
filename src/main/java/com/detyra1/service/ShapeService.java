//package com.detyra1.service;
//
//    import com.detyra1.service.shapeInterfaces.Shape2D;
//    import com.detyra1.service.shapeInterfaces.Shape3D;
//    import org.springframework.stereotype.Service;
//
//    import java.util.List;
//
//@Service
//    public class ShapeService {
//        private final List<Shape2D> shapes2D;
//        private final List<Shape3D> shapes3D;
//
//        // constructor injection
//        public ShapeService(List<Shape2D> shapes2D, List<Shape3D> shapes3D) {
//            this.shapes2D = shapes2D;
//            this.shapes3D = shapes3D;
//        }
//
//        public double calculateArea2D(String shapeType, double... dimensions) {
//            return shapes2D.stream()
//                    .filter(shape -> shape.isShapeTypeSupported(shapeType))
//                    .findFirst()
//                    .map(shape -> shape.calculateArea(dimensions))
//                    .orElseThrow(() -> new IllegalArgumentException("Unsupported 2D shape type: "+shapeType));
//        }
//
//    public double calculatePerimeter2D(String shapeType, double... sideLengths) {
//        return shapes2D.stream()
//                .filter(shape -> shape.isShapeTypeSupported(shapeType))
//                .findFirst()
//                .map(shape -> shape.calculatePerimeter(sideLengths))
//                .orElseThrow(() -> new IllegalArgumentException("Unsupported 2D shape type: " + shapeType));
//    }
//
//
//    public double calculateArea3D(String shapeType, double... dimensions) {
//            return shapes3D.stream()
//                    .filter(shape ->shape.isShapeTypeSupported(shapeType))
//                    .findFirst()
//                    .map(shape -> shape.calculateArea(dimensions))
//                    .orElseThrow(()-> new IllegalArgumentException("Unsupported 3D shape type: "+shapeType));
//    }
//
//        public double calculateVolume3D(String shapeType, double... parameters) {
//            return shapes3D.stream()
//                    .filter(shape->shape.isShapeTypeSupported(shapeType))
//                    .findFirst()
//                    .map(shape -> shape.calculateVolume(parameters))
//                    .orElseThrow(() -> new IllegalArgumentException("Unsupported 3D shape type: "+shapeType));
//        }
//    }
//
//
