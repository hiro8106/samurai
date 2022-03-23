package uzuuzu;
class Ex2_03_1_Referee {
	/*
	Ex2_02_2_Refereeクラス
	・フィールド ※初期化はしないこと！
	- name（String型） …審判の名前
	・コンストラクタ
	<引数>
	String型の文字列を1つ受け取る。
	<処理>
	引数で受け取った文字列をnameに設定。
	*/
	private String name;	//レフリー名

	//コンストラクタ
	Ex2_03_1_Referee(String nm){
		this.name = nm;
	}

	//メソッド
	void rStart(){
		//握らせる前に「じゃんけん・・・ぽん！！！！！」というメッセージを画面に表示する
		System.out.println( "審判" + name + "「じゃんけん・・・ぽん！！！！！」" );
	}

	void rJudge(String p1name ,String p1HandStatus ,String p2name ,String p2HandStatus){
		//それぞれのプレイヤーがどんな手を出したかを確認する
		System.out.println( "審判" + name + "「" + p1name + "さんの手は" + p1HandStatus + "でした！」");
		System.out.println( "審判" + name + "「" + p2name + "さんの手は" + p2HandStatus  + "でした！」");
	}

	void rResultDisplay(String p1name ,String p1HandStatus ,String p2name ,String p2HandStatus){
		//はじめに「結果は・・・」というメッセージを画面に表示する
		System.out.println( "審判" + name + "「結果は・・・」" );
		
		//結果を判定し、結果に応じたメッセージを表示する
		if( (p1HandStatus == p2HandStatus ) ){
			
			//あいこの場合
			System.out.println("あいこ！勝負つかず！");
			
		}else if(     ((p1HandStatus == Ex2_03_1_Player.STATUS_G ) && (p2HandStatus == Ex2_03_1_Player.STATUS_T))
		           || ((p1HandStatus == Ex2_03_1_Player.STATUS_T ) && (p2HandStatus == Ex2_03_1_Player.STATUS_P))
		           || ((p1HandStatus == Ex2_03_1_Player.STATUS_P ) && (p2HandStatus == Ex2_03_1_Player.STATUS_G))  ) {
			
			//プレイヤー1が勝利した場合
			System.out.println( "審判" + name + "「" + p1name + "さんの勝利！」");
			
		}else if(     ((p2HandStatus == Ex2_03_1_Player.STATUS_G ) && (p1HandStatus == Ex2_03_1_Player.STATUS_T))
		           || ((p2HandStatus == Ex2_03_1_Player.STATUS_T ) && (p1HandStatus == Ex2_03_1_Player.STATUS_P))
		           || ((p2HandStatus == Ex2_03_1_Player.STATUS_P ) && (p1HandStatus == Ex2_03_1_Player.STATUS_G))  ) {
			
			//プレイヤー2が勝利した場合
			System.out.println( "審判" + name + "「" + p2name + "さんの勝利！」");
			
		}else{
			
			//不正な場合はエラーメッセージを出力
			System.out.println("なんか変・・・");
			
		}
	}

	//getter
	public String getterName(){
		return this.name;
	}

}
