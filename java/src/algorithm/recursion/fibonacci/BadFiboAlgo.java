package algorithm.recursion.fibonacci;

public class BadFiboAlgo implements FiboAlgo{
    @Override
    public Long doFibo(Long num) {

        if(num<2) return num;
        return (this.doFibo(num-2) + this.doFibo(num-1));
    }
}
