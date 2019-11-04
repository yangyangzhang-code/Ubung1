public class Example2 {
    public static void main(String[] args){
        int n,m,x,i,j;
        n=0;m=0;x=0;
        for(i=101;i<=200;i++) {
            for (j = 1; j < 101; j++) {
                n = i % j;
                if (n == 0) {
                    m = m + 1;
                }
            }
            if (m == 1) { System.out.print(i + ", ") ; x=x+1;}
            m = 0;
        }
        System.out.println("are su shu,all are "+x );
     }
}
