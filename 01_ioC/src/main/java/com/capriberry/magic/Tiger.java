package com.capriberry.magic;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class Tiger implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Tiger :: obj :: " + obj);
		System.out.println("Tiger :: method.getName :: " + method.getName());
		System.out.println("Tiger :: args.length :: " + args.length);
		System.out.println("Tiger :: Arrays.toString(args) :: " + Arrays.toString(args));
		return "난 호랑이다 어흥~";
	}

}
