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
import tables.Film;

public class FilmManager {
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
	
	public static String Test() {
		FilmManager filmManager = new FilmManager();
                String data = "No data :(";
		try {
			filmManager.setUp();
                        data = filmManager.read(0);
                        data += "\n";
                        data += filmManager.read(1);
                        data += "\n";
                        data += filmManager.read(2);
			filmManager.exit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public void create()
	{
		Film film = new Film();
		film.setTitre("Titre");
                film.setAnnee(1996);
                film.setIdMES(0);
                film.setGenre("Genre");
                film.setResume("Résumé");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(film);
		session.getTransaction().commit();
		session.close();
	}
	
	public String read(int filmID)
	{
		Session session = sessionFactory.openSession();
		Film film = session.get(Film.class, filmID);
		String data = "Titre du film => " + film.getTitre();
		session.close();
                return data;
	}
	
	
	protected void exit() {
		sessionFactory.close();
	}

}
