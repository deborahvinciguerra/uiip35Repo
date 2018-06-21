//package it.uiip.test.rubricaTelefonica;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args ) {
//
// 
//    	ClassPathXmlApplicationContext context = 
//        		new  ClassPathXmlApplicationContext("Spring-Module.xml");
//        	 
//ContattoDAO contattoDAO = (ContattoDAO) context.getBean("customerDAO");
//Contatto c = new Contatto("3297278645", "Angelo", "Clemente", 16);
//contattoDAO.insert(c);
//
//Contatto contatto1 = contattoDAO.findByCustomerId("3297278645");
//System.out.println(contatto1);
//
//}
//}