package p2025_02_24;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {
	
    private Frame f;						// 필드

    public FrameTest() {					// 생성자
		f = new Frame( "Frame Test" );	
		f.setSize( 400, 300 );				// 프레임 크기
		f.setLocation( 100, 100 );			// 프레임 초기 위치설정
		f.setBackground( Color.green );		// 프레임 배경색
		f.setVisible( true );				// 화면출력
		f.setResizable(false);    			// 프레임 크기변경

		f.addWindowListener( new WindowAdapter() {		// 이벤트처리 - x버튼 누르면 창닫힘
		    public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
		    }
    });

	}//생성자 end

    public static void main( String[] args ) {
		FrameTest ft = new FrameTest();
    }
}