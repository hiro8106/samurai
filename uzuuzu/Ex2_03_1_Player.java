package uzuuzu;
class Ex2_03_1_Player {

	final static String STATUS_G = "グー";
	final static String STATUS_T = "チョキ";
	final static String STATUS_P = "パー";

	private String name;			//プレイヤー名
	private String handStatus;	//じゃんけんの手

	//コンストラクタ
	Ex2_03_1_Player(String nm){
		this.name = nm;
	}

	//メソッド
	String makeHandStatus(){
		int randomNum = 0;
		randomNum = 1 + (int)(Math.random() * 3.0);
		switch(randomNum){
		case 1:
			handStatus = STATUS_G;
			return handStatus;
		case 2:
			handStatus = STATUS_T;
			return handStatus;
		case 3:
			handStatus = STATUS_P;
			return handStatus;
		default:
			System.out.println("???");
			return handStatus;
		}
	}

	//getter
	public String getterName(){
		return this.name;
	}

	public String getterHandStatus(){
		return this.handStatus;
	}

}
