package algorithm.recursion.fibonacci;

public class Fibo {

    private Long initNumber;
    private FiboAlgo fiboAlgo;

    public Fibo(Long initNumber, FiboAlgo fiboAlgo) {
        this.initNumber = initNumber;
        this.fiboAlgo = fiboAlgo;
    }

    public Long getInitNumber() {
        return initNumber;
    }

    public void setInitNumber(Long initNumber) {
        this.initNumber = initNumber;
    }

    public FiboAlgo getFiboAlgo() {
        return fiboAlgo;
    }

    public void setFiboAlgo(FiboAlgo fiboAlgo) {
        this.fiboAlgo = fiboAlgo;
    }

    public void showResult(){
        System.out.println(fiboAlgo.doFibo(this.initNumber));
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
