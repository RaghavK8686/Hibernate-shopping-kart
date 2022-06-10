package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.User;

public class UserDao {
	public User saveUser(User user) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return user;
	}

	public User getUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User user1 = entityManager.find(User.class, id);

		if(user1!=null)
		{
			System.out.println("id is :"+user1.getId());
			System.out.println("Name is :"+user1.getName());
			System.out.println("Email is :"+user1.getEmail());
			System.out.println("Password is: "+user1.getPassword());
			
		}else
		{
			return null ;
		}
		return user1;
	}

	public List<User> getAllUsers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction(); 
		
		String sql = "select user from User user ";
		Query query=entityManager.createQuery(sql);
		List<User> list=query.getResultList();
		if(list!=null)
			
			return list;
		else
			return null;

	}
	
	public User validateUser(String email,String password )
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String sql="select user from User user where user.email=?1 and user.password=?2";
		Query query=entityManager.createQuery(sql);
		
		query.setParameter(1, email);
		query.setParameter(2,password);
		
		List<User> list = query.getResultList();
		if(list.size()>0)
		{
			return list.get(0);
		}
		else
		{
			System.out.println("invalid name and password");
		}
		return null;
	}
	
	public boolean deleteUserById(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user=entityManager.find(User.class, id);
		if(user!=null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			
		}
		
		return false;
		
	}
	
}
