package com.kwave.java.extend.city.hospital;

import com.kwave.java.extend.city.design.People;

public class Doctor extends People {

	public void diagnosis(Patient patient){	
		// ȯ�ڸ� �����ϴ� ����Ʈ���� �Ѹ�
		// � ȯ�ڵ����� �𸣱� ������ �Է°����� PatientŸ���� patient�� ����
		System.out.println(patient.getName() + " �����Ѵ�.");
		// People Ŭ������ ��� �޾ұ� ������ getName�� ����� �� �ִ�.
	}
	
}
