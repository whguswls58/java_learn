package p2025_03_05;

// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
// 디렉토리 체제를 관리하는 클래스임.
/* 
 * File 클래스
 * 1. 디렉토리 생성 기능
 * 2. 파일, 디렉토리 삭제 기능
*/

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		try {
			// File 객체 생성
			// c:/java01/temp 폴더가 생성되고, 현 위치 하위에
			// test폴더가 생성됨
			File temp = new File("D:/java01", "temp");		// 부모폴더(경로), 자식폴더(디렉토리명)
			File tempFile = new File("test");		// javaproject/test 폴더 생성

			// 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를 반환함)
			// 최초 실행시 파일을 만들면서 True 반환
			// 이후 실행시 파일이 이미 만들어져 있으므로 False 반환
			System.out.println("create directory state : " + temp.mkdirs());
			System.out.println("create directory state : " + tempFile.mkdirs());

			// 1. 빈 디렉토리 삭제
			System.out.println("test파일 지워졌는가? : " + tempFile.delete());	// boolean 형으로 값 반환
			
			// 2. 비어있지 않은 디렉토리 삭제 : 비어있지 않은 디렉토리는 삭제가 안됨
			//	test 디렉토리 안에 있는 모든 파일을 구해오기
			//  파일이 비어있을 경우 listFiles는 null 값을 리턴(배열 x -> 오류 발생)
			File[] tempList = tempFile.listFiles();
//			System.out.println(tempList);
			// test 디렉토리 안에 있는 모든 파일 삭제
			if(tempList != null) {
				for(File tem : tempList) {
					System.out.println("파일명 : " + tem);
					System.out.println("삭제 성공? " + tem.delete());
				}
			}
			// 비어있는 test 디렉토리 삭제
//			System.out.println("test파일 지워졌는가? : " + tempFile.delete());	// boolean 형으로 값 반환
			
			// 3. 자식 디렉토리 삭제
			System.out.println("temp 파일 삭제 성공했는가? " + temp.delete());
			
			// 4. 부모 디렉토리 삭제
			System.out.println("부모 디렉토리 삭제 성공했는가? " + temp.getParentFile().delete());
			
			
			// File 클래스에서 제공하는 메소드로 파일 시스템에 대한
			// 여러가지 정보를 얻을수 있음

			System.out.println("temp canRead : " + temp.canRead());
			System.out.println("temp canWrite : " + temp.canWrite());
			System.out.println("temp getAbsoluteFile : " + temp.getAbsoluteFile());
			System.out.println("temp getName : " + temp.getName());
			System.out.println("temp getParent : " + temp.getParent());
			System.out.println("temp getPath : " + temp.getPath());
			System.out.println("temp isDirectory : " + temp.isDirectory());
			System.out.println("temp isFile : " + temp.isFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
