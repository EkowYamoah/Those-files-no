package gamedev.code.yme;




public class launcher {
		public static void main (String[] args) {try {
			Game game = new Game("MISTIQ!!",400,400);
			game.start();

}catch(Exception ex) {
	System.out.println("ERROR: "+ex);
			}
		}
}
