package com.kwave.java.extend;

import com.kwave.java.extend.city.Police;
import com.kwave.java.extend.city.hospital.Doctor;
import com.kwave.java.extend.city.hospital.Hospital;
import com.kwave.java.extend.city.hospital.Nurse;
import com.kwave.java.extend.city.hospital.Patient;
import com.kwave.java.obj.Father;
import com.kwave.java.obj.Son;


public class ExtendMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Father fa = new  Father();
//		fa.lastname = "����";
//		fa.name = "����Ŭ";
//		fa.car = "���������";
//		fa.money = 1000000000;
//		fa.process();
		
		
		
//		Son son = new Son();
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.lastname = "����";
//		son.name = "��Ͼ�";
//		son.car = "���������";
//		son.money = 1000000000;
//		son.wife = "Soyeon";
//		son.girlfriend = "Soyeon";
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.goDestination();
		
		
		
		
		
		Police police = new Police();
		police.color = "�Ķ���";
		police.floor = "2F";
		
		// ������ �ϳ� �����
		Hospital hospital = new Hospital();
		
		// �ǻ縦 3��
		
		Doctor doctor[] = new Doctor[3];
		
		
		
		// ��ȣ�� 6�� - ���� �ٸ� �������� �ѹ��� �����δ�.
		Nurse nurse[] = new Nurse[6];
		for(int c = 0; c<nurse.length;c++)
		{
//			System.out.print(c+"�� ��ȣ�簡 ");
			nurse[c] = new Nurse();
			nurse[c].move_nurse((c+1)+"�� ��ȣ�簡 ");
		}

System.out.println();
		//ȯ�� 21�� 
			Patient patient[] = new Patient[21];
			
				for(int i=0;i<patient.length;i++)
				{
					
					patient[i] = new Patient();
					patient[i].setName((i+1)+"�� ȯ��");
//					System.out.println(patient[i]);
				}

		
		// �� �ǻ簡 ȯ�ڸ� 7�� �����ϴ� ���α۸��� �ۼ��ϼ���
				for(int a=0;a<doctor.length;a++)
				{
					doctor[a] = new Doctor();
					for(int b = 0; b<patient.length/doctor.length;b++)
					{
						System.out.print((a+1)+ "�� �ǻ簡 ");
						doctor[a].diagnosis(patient[b]);
//					System.out.println(patient[i]);
						
					}
				}

		
		

		
		
		
		
		
		
	}


	
}
