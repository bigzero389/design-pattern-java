package adapter;

public class Banner {
	int defaultAsterCnt = 5;
	
	public void showWithParen(String str){
		System.out.println("-"+str+"-");
	}
	
	public void showWithAster(String str){
		if(str!=null && str.length()!=0){		
			int strLength = str.length();
			System.out.println(printAster(defaultAsterCnt*2 + strLength));
			System.out.println(printAster(defaultAsterCnt) + str + printAster(defaultAsterCnt));
			System.out.println(printAster(defaultAsterCnt*2 + strLength));
		}else{
			System.out.println("Print String is empty");
		}
	}
	
	private String printAster(int cnt){
		StringBuffer srtbuf = new StringBuffer();
		for(int i=0,j=cnt ; i<j ; i++){
			srtbuf.append("*");
		}
		return srtbuf.toString();
	}

}
