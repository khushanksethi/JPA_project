package com.example.jpaexample.demojpaexample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class bookcontrollertest {
	
	@Mock
	BookController bc;
	Book book;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void insertbooktest() throws Exception {
		book=new Book("abc", "xyz",1000);
		//verify(bc).insertBook(book);
		when(bc.getAllBook()).thenReturn(book);
		assertEquals(book, bc.getAllBook());
	}
}
