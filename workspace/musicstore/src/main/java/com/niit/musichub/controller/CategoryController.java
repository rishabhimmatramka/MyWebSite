package com.niit.musichub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.musichub.dao.CategoryDAO;
import com.niit.musichub.model.Category;

@Controller
public class CategoryController {
	
	private CategoryDAO categoryDAO;
	
	@Autowired(required=true)
	@Qualifier(value="categoryDAO")
	public void setCategoryDAO(CategoryDAO ps) {
		this.categoryDAO = ps;
	}
	
	@RequestMapping( value= "/categories", method = RequestMethod.GET)
	public String ListCategories (Model model) { 
		
		model.addAttribute("category", new Category());
		model.addAttribute("categoryList", this.categoryDAO.list());
		return "category" ;
	}
	
	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, BindingResult result){
		
		categoryDAO.saveOrUpdate(category);
		return "redirect:/categories" ;
	}
	
	@RequestMapping("/category/edit/{id}")
	public String editCategory(@PathVariable("Id") String Id, Model model) {
		System.out.println("editCategory");
		model.addAttribute("category", this.categoryDAO.getCategory(Id));
        model.addAttribute("listCategories", this.categoryDAO.list());
        return "category";
	}
	
	@RequestMapping("/category/remove/{id}")
	public String deleteCategory(@PathVariable("Id") String Id, Model model) throws Exception {
		try {
			categoryDAO.delete(Id);
			model.addAttribute("message", "Successfully deleted");
			}
		catch(Exception e) {
			model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		
		return "redirect:/categories" ;
			
	}
	
	
	
	
}
