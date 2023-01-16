package Extract;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import DAO.OffreRekrute;
import DAO.Societe;

public class extr {
		public static void extraire(String choice) {
			if(choice.equals("Rekrute.ma")) {
				for(int in=1;in<2;in++) {
					String url="https://www.rekrute.com/offres.html?p="+in+"&s=1&o=1&positionId%5B0%5D=13&positionId%5B1%5D=19&positionId%5B2%5D=23";
					try {
						Document doc = Jsoup.connect(url).get();
						Elements els=doc.select(".post-id");
						for(Element el : els) {
							Element el2=el.select("h2").select("a").first();
							String titre=el2.text().split("\\|")[0].trim();
							String Region=el2.text().split("\\|")[1].trim();
							String Societe =el.select("img").attr("alt");
							Element content=el.select(".info").get(2);
							Elements li = content.select("li");
							String Secteur=li.get(0).select("a").first().text();
							String fonction=li.get(1).select("a").first().text();
							String Exp=li.get(2).select("a").first().text();
							String Niv=li.get(3).select("a").first().text();
							String Contrat=li.get(4).select("a").first().text();
							Elements Dates=el.select(".holder > em");
							String DateP=Dates.select("span").get(0).text();
							String DateE=Dates.select("span").get(1).text();
							int NbrPost=Integer.parseInt(Dates.select("span").get(2).text().trim()) ;
							OffreRekrute of=new OffreRekrute(Secteur, fonction, Exp, Niv, Contrat, DateP, NbrPost, titre, DateE);
							Societe sc=new Societe(Societe,Region);
							System.out.println(sc.toString());
							System.out.println("*************************");
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
			}else {
				for(int in=0;in<1;in++) {
					String url="https://www.emploi.ma/recherche-jobs-maroc?f%5B0%5D=im_field_offre_metiers%3A31&page="+in;
					try {
						Document doc = Jsoup.connect(url).get();
						Elements els=doc.select(".job-title");
						for(Element el : els) {
							String link="https://www.emploi.ma"+el.select("a").first().attr("href");
							Document doc2=Jsoup.connect(link).get();
							Element job=doc2.select(".job-ad-criteria").first();
							Elements rows=job.select("tr");
							String Societe=doc2.select(".company-title").text();
							String Date=doc2.select(".job-ad-publication-date").text();
							Date=Date.substring(11,Date.length());
							String Fonction,Secteur,Contrat,Region,Exp,Niv,Langue,NivLangue;
							int nb;
							if(rows.size()==9) {
								Fonction=rows.get(0).select("td").get(1).text();
								Secteur=rows.get(1).select("td").get(1).text();
								Contrat=rows.get(2).select("td").get(1).text();
								Region=rows.get(3).select("td").get(1).text();
								Exp=rows.get(5).select("td").get(1).text();
								Niv=rows.get(6).select("td").get(1).text();
								Langue=rows.get(7).select("td").get(1).text();
								//NivLangue=rows.get(6).select("td").get(1).text().split(">")[1];
								nb = Integer.parseInt(rows.get(8).select("td").get(1).text());								
							}else {
								Fonction=rows.get(0).select("td").get(1).text();
								Secteur=rows.get(1).select("td").get(1).text();
								Contrat=rows.get(2).select("td").get(1).text();
								Region=rows.get(3).select("td").get(1).text();
								Exp=rows.get(5).select("td").get(1).text();
								Niv=rows.get(6).select("td").get(1).text();
								Langue=null;
								NivLangue=null;
								nb = Integer.parseInt(rows.get(7).select("td").get(1).text());
							}
							System.out.println("*****************");
							
							
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}				
			}
		}


}
