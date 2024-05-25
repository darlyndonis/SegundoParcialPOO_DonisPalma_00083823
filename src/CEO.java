import java.util.Date;

public class CEO {
    private String name;
    private int edad;

    public CEO(String name, int edad, String numTel, Date añoNac) {
        this.name = name;
        this.edad = edad;
        this.numTel = numTel;
        this.añoNac = añoNac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public Date getAñoNac() {
        return añoNac;
    }

    public void setAñoNac(Date añoNac) {
        this.añoNac = añoNac;
    }

    private String numTel;
    private Date añoNac;


}
