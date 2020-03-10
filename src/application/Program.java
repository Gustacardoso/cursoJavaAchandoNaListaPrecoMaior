package application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Services.CalculationService;
import entities.Product;

public class Program {

	public static void main(String[] args) {
	  Locale.setDefault(Locale.US);
	  
      List<Product> list = new ArrayList<>();
      
      String path = "c:\\gu\\in.txt";//criando esse arquivo no endereço especificado
      //abaixo varificando  se tem o arquivo
      try(BufferedReader br = new BufferedReader(new FileReader(path))) {
    	  
		 String line = br.readLine();//percorendo as linhas
         while(line != null){//verificação  bem logica de enquanto as linha na  forem null ele continua mostrando
        	      
        	     String[] fields = line.split(",");
        	     /*vetor que separa as palavras na pozsião  apos a virgula*/
        	     list.add(new Product(fields[0],Double.parseDouble(fields[1])));
        	     line = br.readLine();
         }
         
         Product x = CalculationService.max(list);
         System.out.println("Most expensive");
         System.out.println(x);
      } catch (Exception e) {
		 System.out.println("Error: " + e.getMessage());
	}
	}

}
