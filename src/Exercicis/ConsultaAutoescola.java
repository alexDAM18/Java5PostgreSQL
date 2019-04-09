package Exercicis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import clases.Alumne;
import clases.Practiques;
import clases.Professor;
import clases.SessionFactoryUtil;

public class ConsultaAutoescola {
	public static void main(String[] args) {

		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session sessio = sf.openSession();
		Query p = sessio.createQuery("from Professor order by nom");
		System.out.println("|------------------------------------------------------------------|");
		for (Professor prof : (List<Professor>) p.list()) {
			
			System.out.println("| " + prof.getNom() + "\t\t\t\t\t   |" );

			for (Alumne al : prof.getAlumnes()) {
				int kmTotales = 0;
				for (Practiques prac : al.getPractiqueses()) {
					kmTotales += prac.getKm();
				}
				System.out.println("|\t" + al.getNom() + " " + kmTotales + " \tkm. de pràctiques-" + al.getExamens().size() + " exàmens|");
			}
			System.out.println("|------------------------------------------------------------------|");

		}
		sessio.close();
	}

}
