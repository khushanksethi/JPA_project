package com.example.jpaexample.demojpaexample;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookController {

//    @Autowired
//    BookRepository bookRepository;
    
    @Autowired
    RestTemplate restTemplate; 
    
//    Book book=new Book("abc", "xyz", 1000);

    @GetMapping(value = "/getBook")
//    public List<Book> getAllBook(){
    public Book getAllBook(){
    	Book book=restTemplate.getForObject("localhost:8080/Book", Book.class);
//        return bookRepository.findAll();
    	return book;
    }

    @PostMapping(value = "/insertBook")
//    @ResponseStatus(HttpStatus.CREATED)
    public String insertBook(@RequestBody Book book) throws Exception{

        try {
//            book = new Book("abc", "xyz",1000);
            
            //if(bookRepository.save(book) != null)
//            	return book;
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            
                        
//            HttpEntity<String> request = new HttpEntity<String>(book.toString(), headers);
            
//            	return restTemplate.postForObject("http://localhost:8080/Book", request, String.class);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception();
        }
		//return false;
    }
    
    @PostMapping(value = "/Book")
//  @ResponseStatus(HttpStatus.CREATED)
  public String insertBookAPI() throws Exception{

      try {
//          book = new Book("abc", "xyz",1000);
          
          //if(bookRepository.save(book) != null)
//          	return book;
          return "hello";
      }catch (Exception e){
          e.printStackTrace();
          throw new Exception();
      }
		//return false;
  }

    @GetMapping(value = "/getBookByAuthor")
    public List<Book> getBookByAuthorName(@RequestParam(value = "a") String auth){
//        List<Book> books = bookRepository.findByAuthorName(auth);
//        System.out.println(books);
//        return books;
return null;
    }

    // Maven:org.hibernate:hibernate-coreL5.4.12.Final -> hibernate-core-5.4.12.Final.jar org.hibernate -> query
}

