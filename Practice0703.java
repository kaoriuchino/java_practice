package myproj;

public class Practice0703 {
	public static void main(String[] args) {
		//int [][][] score = {{86, 67, 67}, {98, 66, 70}, {100, 87, 68}};
		//int n = 0;
		int [][] score = {{86, 67, 67, 98, 66, 70, 100, 87, 68}, {1, 2, 3}};
		String japanese = "国語";
		String math = "数学";
		String English = "英語";
		
		System.out.println(score[1][0] + "人目の" + japanese + "の点数は" + score[0][0] + "点です。");
		System.out.println(score[1][0] + "人目の" + math + "の点数は" + score[0][1] + "点です。");
		System.out.println(score[1][0] + "人目の" + English + "の点数は" + score[0][2] + "点です。");
		System.out.println(score[1][1] + "人目の" + japanese + "の点数は" + score[0][3] + "点です。");
		System.out.println(score[1][1] + "人目の" + math + "の点数は" + score[0][4] + "点です。");
		System.out.println(score[1][1] + "人目の" + English + "の点数は" + score[0][5] + "点です。");
		System.out.println(score[1][2] + "人目の" + japanese + "の点数は" + score[0][6] + "点です。");
		System.out.println(score[1][2] + "人目の" + math + "の点数は" + score[0][7] + "点です。");
		System.out.println(score[1][2] + "人目の" + English + "の点数は" + score[0][8] + "点です。");
		
	}

}
