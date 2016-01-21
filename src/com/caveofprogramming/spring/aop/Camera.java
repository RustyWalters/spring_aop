package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")

public class Camera implements PhotoSnapper, IMachine, ICamera {
	
	public Camera() {
		//System.out.println("Hello from camera constructor");
	}
	
	@Override
	@Deprecated
	public void snap() throws Exception {
		System.out.println("SNAP!");
		//throw new Exception("bye bye!");
	}
	
	@Override
	public void snap(int exposure) {
		System.out.println("SNAP! Exposure: " + exposure);
	}
	
	@Override
	public String snap(String name) {
		System.out.println("SNAP! Name: " + name);
		return name;
	}
	
	@Override
	public void snapNightTime() {
		System.out.println("SNAP! Night mode.");
		
	}
	
	public void snapCar(Car car) {
		System.out.println("Snapping car!");
	}

	@Override
	public void snap(int i, double d) {
		System.out.println("SNAP! Exposure: " + i + " " + d);
	}

	@Override
	public void snap(double exposure) {
		System.out.println("SNAP! Exposure: " + exposure);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}


}
