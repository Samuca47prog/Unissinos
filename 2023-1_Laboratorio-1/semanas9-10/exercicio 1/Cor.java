public class Cor{
	private int r, g, b;
	
	public Cor(int r, int g, int b){
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public int getR(){
		return r;
	}
	
	public int getG(){
		return g;
	}
	
	public int getB(){
		return b;
	}
	
	public String toString(){
		return "Cor (" + r + ", " + g + ", " + b + ")";
		
	}
}
