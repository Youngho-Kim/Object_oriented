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

		
//		Father fa = new  Father();  // �θ�Ŭ������ �Ӽ��� ���� ��ü�� ����
//		fa.lastname = "����";			// �θ�Ŭ���� ��ü���� lastname�� ������ ��� 
//		fa.name = "����Ŭ";			// �θ�Ŭ���� ��ü���� name�� ������ ���
//		fa.car = "���������";			// �θ�Ŭ���� ��ü���� car�� ������ ���
//		fa.money = 1000000000;		// �θ�Ŭ���� ��ü���� money�� ������ ���
//		fa.process();				// �θ�Ŭ���� ��ü���� process�޼ҵ带 ������ ���
		
		
		
//		Son son = new Son();		// �θ�Ŭ������ �Ӽ��� ���� ��ü�� ����
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.lastname = "����";		// �Ƶ�Ŭ���� ��ü���� lastname�� ������ ���
//		son.name = "��Ͼ�";			// �Ƶ�Ŭ���� ��ü���� name�� ������ ���
//		son.car = "���������";		// �Ƶ�Ŭ���� ��ü���� car�� ������ ���
//		son.money = 1000000000;		// �Ƶ�Ŭ���� ��ü���� mone�� ������ ���
//		son.wife = "Soyeon";		// �θ�Ŭ�������� ��ӹ��� �Ƶ� ��ü���� wife�� ������ ���
//		son.girlfriend = "Soyeon";	// �Ƶ�Ŭ���� ��ü���� girlfriend�� ������ ���
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.goDestination();		// �Ƶ�Ŭ���� ��ü���� goDestination�޼ҵ带 ������ ���
		
		
////////////////////////////////////////////////////////////////////////////////////		
		
		
		Police police = new Police();	// Police Ŭ������ �Ӽ��� ���� Police ��ü�� ����	
		police.color = "�Ķ���";			// policeŬ���� ��ü���� color�� ������ ���
		police.floor = "2F";			// policeŬ���� ��ü���� floor�� ������ ���
		
		
////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		// ������ �ϳ� �����
		Hospital hospital = new Hospital();
		
		
		// ��ȣ�� 6�� - ���� �ٸ� �������� �ѹ��� �����δ�.
		Nurse nurse[] = new Nurse[6];	// ��ȣ�� 6�� ����
		for(int c = 0; c<nurse.length;c++)
		{
//			System.out.print(c+"�� ��ȣ�簡 ");
			nurse[c] = new Nurse();		// nurse[c]�� Nurse Ŭ������ �Ӽ� ����
			nurse[c].move_nurse((c+1)+"�� ��ȣ�簡 ");	
			// Nurse Ŭ�������� move_nurse�� ������ ���
		}

			System.out.println(); // �� �Ʒ� ������ ���� ����.
		//ȯ�� 21�� 
			Patient patient[] = new Patient[21];	// ȯ�� 21�� ����
			
				for(int i=0;i<patient.length;i++)
				{
					
					patient[i] = new Patient();		// patient[i]�� Patient Ŭ������ �Ӽ� ����
					patient[i].setName((i+1)+"�� ȯ��");// Patient Ŭ�������� setName�� ������ ���
//					System.out.println(patient[i]);
				}

		
				// �ǻ縦 3��
				Doctor doctor[] = new Doctor[3];	// �ǻ� 3�� ����
				
		// �� �ǻ簡 ȯ�ڸ� 7�� �����ϴ� ���α۸��� �ۼ��ϼ���
				for(int a=0;a<doctor.length;a++)
				{
					doctor[a] = new Doctor();		// doctor[a]�� Doctor Ŭ������ �Ӽ� ����
					for(int b = 0; b<patient.length/doctor.length;b++)
					{ // �� �ǻ�� ȯ�� 7�� ����
						System.out.print((a+1)+ "�� �ǻ簡 ");
						doctor[a].diagnosis(patient[b]);// Doctor Ŭ�������� diagnosis�� ������ ���
//					System.out.println(patient[i]);
						
					}
				}

		
		

		
		
		
		
		
		
	}


	
}
