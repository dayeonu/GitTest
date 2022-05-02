package com.naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class naverTest {

	public static void main(String[] args) throws IOException {

		
		int pages = 2;
		for (int i = 1; i<pages; i++) {
			
		
		String url ="https://news.naver.com/main/list.naver?mode=LS2D&sid2=249&sid1=102&mid=shm&date=20220502&page=1";
		
		Document doc =Jsoup.connect(url).get(); // url소스 가져온 것, 
		//System.out.println(doc);
		Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
		Element element = elements.get(0);
//		System.out.println(element);
		Elements photoElements = element.getElementsByAttributeValue("class", "photo");
//		System.out.println(photoElements);
	
		for(int j =0; j<photoElements.size(); j++) {
			Element articleElement = photoElements.get(j);
//			System.out.println(articleElement);
		Elements aElements =  articleElement.select("a");
		Element aElement = aElements.get(0);
//		System.out.println(aElement);
		
		String newsUrl = aElement.attr("href"); 	//기사 링크
//		System.out.println(newsUrl);
		
		Element imgElement = aElement.select("img").get(0);
		String imgUrl =  imgElement.attr("src");
//		System.out.println(imgUrl);
		String title = imgElement.attr("alt");
//		System.out.println(altUrl);
		
		Document detailDoc = Jsoup.connect(newsUrl).get();
		Element contentElement = detailDoc.getElementById("dic_area"); //기사 목록 긁어옴, 배열같이 사용함 , 아이디는 단수여야 해서 s가 붙지 않
		String content = contentElement.text(); //html에서 텍스트만 불러옴(자바스크립트 코드는 생략됨)
//		
		System.out.println(title);	//제목
		System.out.println(content); //기사
		System.out.println(); // 줄바꿈
		
		}
	
	}
}
}
