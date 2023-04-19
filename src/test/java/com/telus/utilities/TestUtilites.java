package com.telus.utilities;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class TestUtilites  {
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	public static Logger log=LogManager.getLogger(TestUtilites.class.getName());
	public static Random random = new Random();
	public static int y = random.nextInt(1000);
    public static String email="VamsiKrishna"+y+"@gamil.com";

}
