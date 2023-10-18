package com.detyra1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShapeDemo implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ShapeDemo.class);
    @Autowired
    private ShapeService2 shapeService;
    @Override
    public void run(String... args) throws Exception {
        double squareArea = shapeService.calculateArea2D("square", 2.0);
        double squarePerimeter = shapeService.calculatePerimeter2D("square", 2);
        double rectangleArea = shapeService.calculateArea2D("rectangle", 4.0,5.0);
        double rectanglePerimeter = shapeService.calculatePerimeter2D("rectangle", 4.0,5.0);
        double triangleArea = shapeService.calculateArea2D("triangle", 3.0,5.0);
        double trianglePerimeter = shapeService.calculatePerimeter2D("triangle", 3.0,6.0,7.0);
        double trapezoidArea = shapeService.calculateArea2D("trapezoid", 2.0,4.0,3.0);
        double trapezoidPerimeter = shapeService.calculatePerimeter2D("trapezoid", 2.0,2.0,4.0,3.0);
        double rhombusArea = shapeService.calculateArea2D("rhombus", 2.0,4.0);
        double rhombusPerimeter = shapeService.calculatePerimeter2D("rhombus", 2.0);

        double cubeArea = shapeService.calculateArea3D("cube", 2.0);
        double cubeVolume = shapeService.calculateVolume3D("cube", 2.0);
        double cuboidArea = shapeService.calculateArea3D("cuboid", 3.0,4.0,5.0);
        double cuboidVolume = shapeService.calculateVolume3D("cuboid", 3.0,5.0,4.0);
        double cylinderArea = shapeService.calculateArea3D("cylinder", 2.0,6.0);
        double cylinderVolume = shapeService.calculateVolume3D("cylinder", 2.0,6.0);

        logger.info("**************************************************************");
        logger.info("The area of the square with side length '2' is: {}",2);
        logger.info("The perimeter of the square with side length '2' is: "+squarePerimeter);
        logger.info("The area of the rectangle with lengths '4 and 5' is: "+rectangleArea);
        logger.info("The perimeter of the rectangle with lengths '4 and 5' is: "+rectanglePerimeter);
        logger.info("The area of the triangle with lengths '3 and 5' is: "+triangleArea);
        logger.info("The perimeter of the triangle with lengths '3, 6, 7' is: "+trianglePerimeter);
        logger.info("The area of the trapezoid with lengths '2, 4, 3' is: "+trapezoidArea);
        logger.info("The perimeter of the trapezoid with side length '2,2,4,3' is: "+trapezoidPerimeter);
        logger.info("The area of the rhombus with side length '2' is: "+rhombusArea);
        logger.info("The perimeter of the rhombus with lengths '2 and 4' is: "+rhombusPerimeter);

        logger.info("*****************************************************************************");
        logger.info("The area of the cube with side length '2' is: "+cubeArea);
        logger.info("The volume of the cube with side length '2' is: "+cubeVolume);
        logger.info("The area of the cuboid with lengths '3,4,5' is: "+cuboidArea);
        logger.info("The volume of the cuboid with lengths '3,4,5' is: "+cuboidVolume);
        logger.info("The area of the cylinder with lengths '2, 6' is: "+cylinderArea);
        logger.info("The volume of the cylinder with lengths '2, 6' is: "+cylinderVolume);
    }
}
