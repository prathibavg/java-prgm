public class SumEven {
    public static void main(String[] args) {
        System.out.println("main method");
        // int a=1;
        // int sum=0;
        // while(a<=10){
        //     if(a%2==0){
        //         sum=sum+a;
        //     }
        //     a++;
        //     // System.out.println(sum);
        // }
        int sum=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){   
                sum=sum+i;
                  }
        }
        System.out.println(sum);

    }
}
