package LacosRepeticao;

public class ExCalculoTotalDeGraos {
    public static void main(String[] args) {
        
        double graos = 0;
        double graosCasa = 1;
        double casaTab = 64;

        for (int i = 1; i <= casaTab; i++) {
             graos += graosCasa;
            System.out.printf("casa: %d qtd: %.0f soma %.0f\n", i , graosCasa,graos);
            graosCasa *= 2;
           
            
        }
        
    }
}
