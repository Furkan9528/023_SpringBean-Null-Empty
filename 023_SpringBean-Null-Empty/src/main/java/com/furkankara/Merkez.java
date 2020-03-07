package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Personel personel = context.getBean("BeanPersonel",Personel.class);
		
		System.out.println(personel);
		
		
		/*personel.getAdi();
		personel.getSoyadi();
		personel.getAnneAdi();
		personel.getBabaAdi();
		personel.getDogumYili();
		personel.getTelNo();
		personel.getMaasi();
		 */
	}

}
