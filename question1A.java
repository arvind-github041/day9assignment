package mod17;

public class question1A {
    public static void main(String[] args) {
        
    // write a program to write A,B,C,D,E,F,G,H 
    int q=8;
    for(int i=0;i<=q;i++){
        for(int j=0;j<=q;j++){
            if(i+j==q|| i==(q/2)&& j>=(q/2)){
        
                System.out.print("*");
        
            }
            else{
                System.out.print(" ");
            }
        }
        for(int j=q;j>=0;j--){
            if(i+j==q || i==(q/2)&& j>=(q/2)){
        
                System.out.print("*");
        
            }
            else{
                System.out.print(" ");
            }

        }
       System.out.println();
    }
    }
}
