package algorithm.recursion.fibonacci;

public class GoodFiboAlgo implements FiboAlgo{

    private Long[] list;

    @Override
    public Long doFibo(Long num) {

        if(list == null) {
            list = new Long[num.intValue() + 1];
            for(int i=0;i<list.length;i++)list[i]=0L;
        }
        if(list[num.intValue()] > 0) return list[num.intValue()];
        if(num<2) list[num.intValue()] = num;
        else list[num.intValue()] = doFibo(num-2) + doFibo(num-1);
        return list[num.intValue()];
    }
}
