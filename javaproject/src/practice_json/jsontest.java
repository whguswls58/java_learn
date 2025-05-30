package practice_json;

import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsontest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {

			String path = "D:\\java\\java_learn\\javaproject\\championFull.json";
			
			JSONParser parser = new JSONParser();

			// 파일에서 JSON 파일 읽기
			Reader reader = new FileReader(path);
			Object obj = parser.parse(reader);
			
			// 최상위 JSON 객체
			JSONObject jsonObject = (JSONObject)obj;

			// "data" 객체 접근
			JSONObject dataObject = (JSONObject)jsonObject.get("data");
			
			// 챔피언 목록(오름차순 정렬)
			Set<String> championName = dataObject.keySet(); 
			String[] champ = championName.toArray(new String[0]);
			Arrays.sort(champ);

			System.out.println(champ[0]);
			
			// 챔피언 이름으로 접근 (ex : Atrox)
			JSONObject atroxObject = (JSONObject) dataObject.get(champ[0]);
			System.out.println("key: " + atroxObject.get("key"));
			System.out.println("id: " + atroxObject.get("id"));
			System.out.println("name: " + atroxObject.get("name"));
			System.out.println("title: " + atroxObject.get("title"));
			System.out.println("tags: " + atroxObject.get("tags"));
			System.out.println("partype: " + atroxObject.get("partype"));

			//	System.out.println(atroxObject);
			// "skins" 배열 가져오기
			JSONArray skinsArray = (JSONArray) atroxObject.get("skins");
			
			// 스킨 목록 출력
			System.out.println("Atrox Skins:");
			// 배열 순회
			for(Object skinObj : skinsArray) {
				JSONObject skin = (JSONObject)skinObj;
				
				String name = (String)skin.get("name");
				
				System.out.println("- " + name);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
