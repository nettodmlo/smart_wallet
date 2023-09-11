public class Wallet {

    private double rendmensal;

    private double calcMensal;
    private double gastoAtual;

    public double getRendmensal() {
        return rendmensal;
    }

    public void setRendmensal(double rendmensal) {
        this.rendmensal = rendmensal;
    }

    public double getCalcMensal() {
        return calcMensal;
    }

    public void setCalcMensal(double calcMensal) {
        this.calcMensal = calcMensal;
    }

    public double getGastoAtual() {
        return gastoAtual;
    }

    public void setGastoAtual(double gastoAtual) {
        this.gastoAtual = gastoAtual;
    }

    //fazer a correção dessa linha que não exibe o valor total
    public double calcMensal() {
        return rendmensal - gastoAtual;

    }

}

