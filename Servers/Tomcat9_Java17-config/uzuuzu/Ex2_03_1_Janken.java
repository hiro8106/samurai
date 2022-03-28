package uzuuzu;
class Ex2_03_1_Janken {
	public static void main (String[] args) {

		/*
		<シナリオ①>
		コマンドライン引数より3つの文字列を受け取る。
		（ジャンケンを行う2名のプレイヤー及び審判の名前として利用）
		*/
		String playerNm1 = args[0];
		String playerNm2 = args[1];
		String refereeNm = args[2];

		/*
		<シナリオ②>
		2名のプレイヤー及び審判を場に登場させる。（インスタンス化する）
		インスタンス化の際はコマンドライン引数で受け取った文字列をそれぞれ
		コンストラクタに渡す。
		*/
		Ex2_03_1_Player  player1 = new Ex2_03_1_Player(playerNm1);
		Ex2_03_1_Player  player2 = new Ex2_03_1_Player(playerNm2);
		Ex2_03_1_Referee referee = new Ex2_03_1_Referee(refereeNm);

		/*
		<シナリオ③>
		それぞれのプレイヤーに手を握らせる。
		※握らせる前に「じゃんけん・・・ぽん！！！！！」と審判が言う。
		※それぞれのプレイヤーがどんな手を出したか、それぞれについて
		「 （nameの値） さんの手は（ handStatus の値）でした！」と審判が言う。
		*/
		referee.rStart();

		String makeHandStatus1 = player1.makeHandStatus();
		String makeHandStatus2 = player2.makeHandStatus();

		referee.rJudge( player1.getterName() ,makeHandStatus1 
						,player2.getterName() ,makeHandStatus2 );

		/*
		<シナリオ④>
		審判が勝敗を判定し、結果を言う。
		※はじめに「結果は・・・」と審判が言う。
		※あいこだった場合は「あいこ！勝負つかず！」と審判が言う。
		※あいこでない場合は「（nameの値）さんの勝利！」と審判が言う
		*/
		referee.rResultDisplay(	player1.getterName() ,makeHandStatus1 
								,player2.getterName() ,makeHandStatus2 );
	}
}
