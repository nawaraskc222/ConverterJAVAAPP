package com.nawaras.CONVERT;


import com.spire.doc.Document;

import com.spire.doc.ToPdfParameterList;

public class Nawa {
	
	
	public String filename1;
	
	
	
	public   Nawa(String filename){
		filename1=filename;
		System.out.println(filename1);
		
	}
	
	void pass() {

		String real1;
		int len1=filename1.length();

		char cha1=filename1.charAt(len1-4);
		
if(cha1=='d') {

real1=filename1.replace(".docx", ".pdf");

}else {

real1=filename1.replace(".txt", ".pdf");

}

String pdfFil1=filename1+".pdf";
Document doc1 = new Document();

//com.spire.doc.Document Document d1;

doc1.loadFromFile(filename1);
ToPdfParameterList ppl=new ToPdfParameterList();
ppl.isEmbeddedAllFonts(true);
ppl.setDisableLink(true);
doc1.setJPEGQuality(40);

     doc1.saveToFile(real1, ppl);
System.out.println(filename1);
   
	}
	
	public static void main(String args[]) {
		TEXTtopdf pp=new TEXTtopdf();
		
		Nawa n= new Nawa(pp.filename1);
		
		
		
		
	}

}
