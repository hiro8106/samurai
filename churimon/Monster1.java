package churimon;

public class Monster1 {
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
	
	Monster1(){
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

}
