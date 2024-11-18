import java.util.ArrayList;

public class Refugio {
    private Float liquidez;
    private ArrayList<Animal> animalesRefugiados;
    private ArrayList<Animal> animalesRegistrados;

    public Refugio(Float liquidez) {
        this.liquidez = liquidez;
        this.animalesRefugiados = new ArrayList<Animal>();
        this.animalesRegistrados = new ArrayList<Animal>();
    }
	/**
	 * 
	 * @param a
	 */
    public void registrar(Animal a) {
        this.animalesRegistrados.add(a);
    }
    
    public Float getLiquidez() {
        return liquidez;
    }
    
    public void setLiquidez(Float liquidez) {
        this.liquidez = liquidez;
    }
    
    public ArrayList<Animal> getAnimalesRefugiados() {
        return animalesRefugiados;
    }
    public ArrayList<Animal> getAnimalesRegistrados() {
        return animalesRegistrados;
    }
}