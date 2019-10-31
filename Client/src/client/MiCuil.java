package client;

public class MiCuil {
    public MiCuil() {
        super();
    }
    private int[] cuil =  {0,0,0,0,0,0,0,0,0,0,0};
    private final int n10 = 2 + 8, n11 = n10 + 1;
    public void setTipoDNI(String tipo, String DNI) {
        String tipoDNI = "";
        try{
            for(int con=0;con<n11;con++) cuil[con] = 0;
            tipoDNI = String.format("%02d", Integer.valueOf(tipo)) + String.format("%08d", Integer.valueOf(DNI));
            if(tipoDNI.length() != n10) return;
        }catch(Exception er){
            return;
        }
        for(int con=0;con<n10;con++) cuil[con] = Integer.parseInt(tipoDNI.substring(con, con+1));
        int digitoVerificador = calcularDigitoVerificador();
        if(digitoVerificador == n10) { //Si el DV es 10 el DV se tiene que recalcular con tipo igual 23 o 33
          cuil[1] = 3; //Tipos 23-DNI-x para personas. Tipo 33-X-x para empresas
          digitoVerificador = calcularDigitoVerificador();     
        }
        if(digitoVerificador == n11) digitoVerificador = 0; //Si el DV es 11 el DV debe ser 0
        cuil[n10] = digitoVerificador;
    }
    private int calcularDigitoVerificador(){
        int[] serie = {5,4,3,2,7,6,5,4,3,2};
        int datoEntero = 0, datoResto = 0, sumatoria = 0;
        for(int con = 0; con < n10; con++) sumatoria = sumatoria + (serie[con] * cuil[con]);
        datoEntero =  (sumatoria / (n11)); //parte entera
        datoResto = sumatoria - (datoEntero * (n11)); //resto entero
        return (n11) - datoResto; //los restos 0 y 1 dan un DV de 11 y 10, es un error y hay que repararlo 
    }
    public String getCuil() {
        StringBuffer cuilString = new StringBuffer();
        for (int con = 0; con < (n11); con++) cuilString = cuilString.append(cuil[con]);
        return  cuilString.toString();
    }

    public boolean verificarCUIL(String cuilX) {
        boolean correcto = false;
        if(cuilX.length() == n11) {
            for(int con=0;con<n10;con++) cuil[con] = Integer.parseInt(cuilX.substring(con, con+1));
            int digitoVerificador = calcularDigitoVerificador();
            if(digitoVerificador == n11) digitoVerificador = 0;
            if(Integer.parseInt(cuilX.substring(n10, n11)) == digitoVerificador) correcto = true;
        }
        return correcto;
    }
}









