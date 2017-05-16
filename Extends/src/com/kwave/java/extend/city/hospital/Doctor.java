package com.kwave.java.extend.city.hospital;

import com.kwave.java.extend.city.design.People;

public class Doctor extends People {

	public void diagnosis(Patient patient){	
		// 환자를 진찰하는 프린트문을 뿌림
		// 어떤 환자들인지 모르기 때문에 입력값으로 Patient타입의 patient를 받음
		System.out.println(patient.getName() + " 진찰한다.");
		// People 클래스를 상속 받았기 때문에 getName을 사용할 수 있다.
	}
	
}
