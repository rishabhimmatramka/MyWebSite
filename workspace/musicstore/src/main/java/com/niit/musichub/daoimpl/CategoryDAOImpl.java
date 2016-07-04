package com.niit.musichub.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.musichub.dao.CategoryDAO;
import com.niit.musichub.model.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {	
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Category> list() {
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession().createQuery(" from Category").list();
		return listCategory;
	}

	@Transactional
	public Category getCategory(String Id) {
		String hql = "from category where id=" + "'" + Id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		} 
		return null;
	}

	@Transactional
	public Category getCategoryByName(String Name) {
		String hql = "from Category where name=" + "'" + Name + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();

		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		} 
		return null;
	}

	@Transactional
	public void saveOrUpdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);

	}

	@Transactional
	public void delete(String Id) {
		Category CategoryToDelete = new Category();
		CategoryToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(CategoryToDelete);

	}

}
