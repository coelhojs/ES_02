import java.io.IOException;

public class Aula02Classe {

	public static void main(String[] args) throws Exception{

		Conta [] c = new Conta[10];
		
		for(int i= 0; i< c.length; i++)
			c[i] = new Conta(0);
		
		c[0].depositar(200);
		
		int in=-1;
        try {
            in =  System.in.read();
        } catch (IOException e) {
            System.out.println("IOError");
        }
		
		
	}

}
