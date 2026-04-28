public class ExWorkFlow extends WorkFlow {
	public void draw( todo task ){
		System.out.println("レポートの内容を考えながら、紙に下書きする");
	}
	public void cut( todo task ){
		System.out.println("下書きに沿って、レポートを仕上げる");
	}
	public void print( todo task ){
		System.out.println("レポートをプリンターで、印刷する");
	}
}