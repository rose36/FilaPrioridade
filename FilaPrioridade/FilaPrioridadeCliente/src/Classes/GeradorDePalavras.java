
package Classes;

import java.util.Random;



public class GeradorDePalavras {

    public String geraPalavra(){
        String palavra;
        Random random = new Random();
        char[] word = new char[4];
        for(int j = 0; j < 4; j++){
            word[j] = (char)('a' + random.nextInt(26));
        }
        palavra = new String(word);
        return palavra;
    }
}
