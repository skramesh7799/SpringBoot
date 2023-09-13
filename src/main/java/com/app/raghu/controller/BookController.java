package com.app.raghu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.raghu.Bean.Book;
@Controller
@RequestMapping("/book")
public class BookController {
	@GetMapping("/show")
	public String showData(Model model)
	{
		Book b1 = new Book(101,"core java","Ramesh",700.0);
		model.addAttribute("bob",b1);
		return "BookData";
	}

@GetMapping("/list")
	public String showCol(Model model) {
		List<Book> list =Arrays.asList(
				new Book(10,"Aa","XY",88.0), 
				new Book(11,"Aa","Xz",89.0),
				new Book(12,"Aa","Xj",87.0),
				new Book(13,"Aa","Xl",86.0));
		model.addAttribute("list",list);
		return "BookList";
	}
}
