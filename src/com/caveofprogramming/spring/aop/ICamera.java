package com.caveofprogramming.spring.aop;

public interface ICamera {

	void snap() throws Exception;

	void snap(int exposure);

	String snap(String name);

	void snapNightTime();

	void snapCar(Car car);
	
	void snap(int i, double d);
	
	void snap(double exposure);

}