package com.naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class naverTest {

	public static void main(String[] args) throws IOException {

		String url ="https://news.naver.com/main/list.naver?mode=LS2D&sid2=249&sid1=102&mid=shm&date=20220502&page=1";
		
		Document doc =Jsoup.connect(url).get(); // url소스 가져온 것, 
		//System.out.println(doc);
		Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
		System.out.println(elements.get(0));
	}

}
