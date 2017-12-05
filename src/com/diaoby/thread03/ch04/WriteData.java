package com.diaoby.thread03.ch04;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
	
	public void writeMethod(PipedOutputStream out) {
		try {
			System.out.println("wirte  ");
			for(int i =0;i<300;i++) {
				String outData = ""+(i+1);
				
				Thread.sleep(200);
				
				out.write(outData.getBytes());
				System.out.print(outData);
			} 
			System.out.println();
			out.close();
		}catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
