public class Leaf implements PrincipalSecundarioComponent{
    private String tipoWork;

    public Leaf(String tipoWork) {
        this.tipoWork = tipoWork;
    }

    public String getTipoWork() {
        return tipoWork;
    }

    public void setTipoWork(String tipoWork) {
        this.tipoWork = tipoWork;
    }


    @Override
    public void method1() {

    }
}
