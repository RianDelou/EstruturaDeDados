public class LSENode {
    private Funcionario info;
    private LSENode prox;

    public void setInfo(Funcionario info) {
        this.info = info;
    }
    public void setProx (LSENode novoProx) {
        this.prox = novoProx;
    }
    public Funcionario getInfo() {
        return this.info;
    }
    public LSENode getProx() {
        return this.prox;
    }
}


