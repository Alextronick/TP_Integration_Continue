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
import tables.Role;

public class RoleManager {
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
		RoleManager roleManager = new RoleManager();
		try {
			roleManager.setUp();
			roleManager.exit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void create()
	{
		Role role = new Role();
		role.setTitre("Titre");
                role.setIdActeur(0);
                role.setNomRole("Nom rôle");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(role);
		session.getTransaction().commit();
		session.close();
	}
	
	public void read()
	{
		Session session = sessionFactory.openSession();
		Role role = session.get(Role.class, 0);
		System.out.println("Titre du film du rôle => " + role.getTitre());
		session.close();
	}
	
	
	protected void exit() {
		sessionFactory.close();
	}

}
