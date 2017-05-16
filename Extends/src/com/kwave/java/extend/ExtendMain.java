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
//		fa.lastname = "조던";
//		fa.name = "마이클";
//		fa.car = "람보르기니";
//		fa.money = 1000000000;
//		fa.process();
		
		
		
//		Son son = new Son();
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.lastname = "조던";
//		son.name = "쥬니어";
//		son.car = "람보르기니";
//		son.money = 1000000000;
//		son.wife = "Soyeon";
//		son.girlfriend = "Soyeon";
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.goDestination();
		
		
		
		
		
		Police police = new Police();
		police.color = "파란색";
		police.floor = "2F";
		
		// 병원을 하나 만들고
		Hospital hospital = new Hospital();
		
		// 의사를 3명
		
		Doctor doctor[] = new Doctor[3];
		
		
		
		// 간호사 6명 - 각각 다른 방향으로 한번씩 움직인다.
		Nurse nurse[] = new Nurse[6];
		for(int c = 0; c<nurse.length;c++)
		{
//			System.out.print(c+"번 간호사가 ");
			nurse[c] = new Nurse();
			nurse[c].move_nurse((c+1)+"번 간호사가 ");
		}

System.out.println();
		//환자 21명 
			Patient patient[] = new Patient[21];
			
				for(int i=0;i<patient.length;i++)
				{
					
					patient[i] = new Patient();
					patient[i].setName((i+1)+"번 환자");
//					System.out.println(patient[i]);
				}

		
		// 각 의사가 환자를 7명씩 진찰하는 프로글매을 작성하세요
				for(int a=0;a<doctor.length;a++)
				{
					doctor[a] = new Doctor();
					for(int b = 0; b<patient.length/doctor.length;b++)
					{
						System.out.print((a+1)+ "번 의사가 ");
						doctor[a].diagnosis(patient[b]);
//					System.out.println(patient[i]);
						
					}
				}

		
		

		
		
		
		
		
		
	}


	
}
