package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caveofprogramming.spring.camera.accessories.Lens;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/aop/beans.xml");
		IBlender blender = (IBlender)context.getBean("blender");
		blender.blend();
		((IMachine)blender).start();
		
		IFan fan = (IFan)context.getBean("fan");
		fan.activate(5);
		((IMachine)fan).start();
//		
//		ICamera camera = (ICamera)context.getBean("camera");
////		Lens lens = (Lens)context.getBean("lens");
//
//		try {
//			camera.snap();
//			camera.snap(500);
//			camera.snap(1.8);
//			camera.snap(500, 1.8);
//			camera.snapNightTime();
//			
//			Car car = (Car)context.getBean("car");
//			car.start();
//			
//			camera.snapCar(new Car());
//		} catch (Exception e) {
//			System.out.println("Caught exception " + e.getMessage());
//		}
//		camera.snap(1000);
//		camera.snap("Prague Castle");
//		camera.snapNightTime();
//		
//		lens.zoom(5);
		
		context.close();
	}

}
