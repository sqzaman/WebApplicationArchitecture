package mum.edu.formatter;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import edu.mum.domain.Category;
import edu.mum.service.CategoryService;

/**
 * If a Book referenced in a Form by the String value of its ID
 * it is converted into an Object & Vice-versa
 * USE CASE: multiple select in form...
 * @author admin1
 *
 */
@Component
public class CategoryFormatter implements Formatter<Category> {

@Autowired
private CategoryService categoryService;

	@Override
	public Category parse(String text, Locale locale) throws ParseException {
	  	        return categoryService.getCategory(Integer.valueOf(text));
	}

	// Automatic setting of selected in form multiple select
	@Override
	public String print(Category object, Locale locale) {
	 	      return String.valueOf(object.getId());
	}
}
 
