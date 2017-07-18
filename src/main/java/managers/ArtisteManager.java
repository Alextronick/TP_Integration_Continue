/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import tables.Artiste;

public class ArtisteManager {
	private static SessionFactory sessionFactory;
	
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
		}
		catch ( Exception e) {
			StandardServiceRegistryBuilder.destroy( registry );
		}
	}
	
	public static void Test() {
		ArtisteManager artisteManager = new ArtisteManager();
		try {
			artisteManager.setUp();
			artisteManager.exit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void create()
	{
		Artiste artiste = new Artiste();
		artiste.setId(0);
                artiste.setNom("Nom");
                artiste.setPrenom("Prenom");
                artiste.setAnneeNaiss(1996);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(artiste);
		session.getTransaction().commit();
		session.close();
	}
	
	public void read()
	{
		Session session = sessionFactory.openSession();
		Artiste artiste = session.get(Artiste.class, 0);
		System.out.println("Nom prénom artiste => " + artiste.getPrenom() + " " + artiste.getNom());
		session.close();
	}
	
	
	protected void exit() {
		sessionFactory.close();
	}

}
