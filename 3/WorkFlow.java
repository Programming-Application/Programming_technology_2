public abstract class WorkFlow{
	public abstract void draw( todo task );
	public abstract void cut( todo task );
	public abstract void print( todo task );
	public void doWork(){
		Mater task = new Mater(); //Mater クラスは、todo インタフェースを実装している
		draw( task );
		cut( task );
		print( task );
	}
}