package churimon;

import java.math.BigDecimal;

public class Monster2 {
	String character;	//種族
	String trainer;		//トレーナ
	String name;		//なまえ
	int lv;				//レベル
	int hp;				//HP
	int atk;			//こうげき
	int def;			//ぼうぎょ
	int spd;			//すばやさ
	int hpMax;			//HP初期値
	String wazaNm;		//わざ（なまえ）
	String wazaDmgRate;	//わざ（ダメージ倍率）
	
	Monster2(){
		this.character		= "(unknown)";
		this.trainer		= "(wild)";
		this.name			= "(noname)";
		this.lv				= 1;
		this.hp				= 80;
		this.atk			= 15;
		this.def			= 10;
		this.spd			= 10;
		this.hpMax			= 80;
		this.wazaNm			= "たいあたり";
		this.wazaDmgRate	= "1.0";
	}

	Monster2(String pTrainer, String pName){
		this.trainer		= pTrainer;
		this.name			= pName;
	}

	Monster2(String pTrainer, String pName, int pLv){
		this(pTrainer, pName);
		this.lv	 = pLv;
		levelUp(pLv);
	}
	
	//[toStringメソッド]
	//toStringメソッドのオーバーライドを以下のように実施します。
	public String toString(){
		return	"<フィールド確認>character:" + this.character + "/" +
				"trainer:" + this.trainer + "/" +
				"name:" + this.name + "/" +
				"lv:" + this.lv + "/" +
				"hp:" + this.hp + "/" +
				"atk:" + this.atk + "/" +
				"def:" + this.def + "/" +
				"spd:" + this.spd +  "/" +
				"hpMax:" + this.hpMax +  "/" +
				"wazaNm:" + this.wazaNm +  "/" +
				"wazaDmgRate:" + this.wazaDmgRate;
	}

	//[levelUpメソッド]
	//上昇レベルに従ってステータスを上昇させます。
	void levelUp(int upLv) {
		this.lv = this.lv + (upLv * 1);
		this.hpMax = this.hpMax + (upLv * 30);
		this.atk = this.atk + (upLv * 5);
		this.def = this.def + (upLv * 5);
		this.spd = this.spd + (upLv * 5);
		this.hp = this.hpMax;
	}

	//[setWazaメソッド]
	//わざに関する情報を設定します。
	void setWaza(String wazaName,String wazaDamageRate) {
		// 引数2のバリデーションチェックを行います。
		if (wazaDamageRate.matches("^[0-9]+¥.[0-9]$")) {
			this.wazaNm = wazaName;
			this.wazaDmgRate = wazaDamageRate;
		}else{
			System.out.println("[ERROR]わざの設定に失敗しました");
		};
	}

	//[getStatusメソッド]
	//ステータスを表示します。
	String getStatus() {
		return "[" + this.name + ":lv" + this.lv + ":HP" + this.hp + "/" + this.hpMax + "]";
	}

	//[useWazaメソッド]
	//わざを使用して相手にダメージを与えます。
	int useWaza() {
		BigDecimal atk = new BigDecimal(this.atk);
		BigDecimal rate = new BigDecimal(this.wazaDmgRate);
		BigDecimal dmg;
		
		dmg = (atk.multiply(rate));
		return dmg.intValue();
	}

 	//[damagedメソッド] その１
	//値渡しされたダメージから実際に受けるダメージを計算し、HPから減算します。
	//戻り値として実際に受けるダメージを返します。
	int damaged(int damage) {
		
		//①ダメージ減算率を下記ルールで求めます。
		//ダメージ減算率：1 / (1＋ぼうぎょ÷120) ※小数第3位切り捨て
		//※BigDecimalを使用します。
		BigDecimal dmgRt;
		BigDecimal dmg1 = new BigDecimal(1);
		BigDecimal dmg120 = new BigDecimal(120);
		BigDecimal def = new BigDecimal(this.def);

//		dmgRt = dmg1.divide( dmg1.add( def.divide(dmg120) ) , 3 ,BigDecimal.ROUND_DOWN);
		dmgRt = dmg1.divide( dmg1.add( def.divide(dmg120) ) );
		
		//②実際に受けるダメージを下記ルールで求めます。
		//実際に受けるダメージ：値渡しされたダメージ値×ダメージ減算率
		BigDecimal actDmg;
		BigDecimal Bddamage = new BigDecimal(damage);

		actDmg = Bddamage.multiply(dmgRt);
		
		//③HPと受けるダメージを比べ、HP>ダメージであればダメージを差し引いた値
		//  をHPに代入します。HP<ダメージであればHPに0を代入します。
		if(this.hp > actDmg.intValue()) {
			this.hp = this.hp - actDmg.intValue();
		}else if(this.hp < actDmg.intValue()) {
			this.hp = 0;
		};

		//④ 戻り値として実際に受けるダメージの値を返します。
		return actDmg.intValue();
	}

}
