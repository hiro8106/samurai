package churimon;

//検証用クラス
class TestMonster {
	public static void main (String[] args) {
		
		Monster1 m1 = new Monster1();
		System.out.println( m1.toString() );

		m1.levelUp(2);
		System.out.println( m1.toString() );
		
		m1.setWaza("突撃", "10.0");
		System.out.println( m1.toString() );

		System.out.println(m1.getStatus());
		
		System.out.println(m1.useWaza());

		m1.damaged(20);
		System.out.println( m1.toString() );
	}
}