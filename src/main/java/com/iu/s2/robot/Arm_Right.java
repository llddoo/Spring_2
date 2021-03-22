package com.iu.s2.robot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ar")
public class Arm_Right extends Arm {
	
	public Arm_Right() {
		this.setName("Right Arm");
	}
}
