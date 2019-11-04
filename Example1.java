public class Example1 {
    public static void main(String[] args){
        int i ;
        long[] arr = new long[36];
        arr[0] = arr[1] = 1;
        System.out.println("The first month has one paar rabbit,all are 2");
        System.out.println("The second month has one paar rabbit, all are 2");
        for(i=2;i<36;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println("The"+(i+1)+"month has"+arr[i]+"paar rabbit,all are"+(2*arr[i]));
        }
    }
}
