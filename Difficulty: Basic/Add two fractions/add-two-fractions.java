/*You are required to complete this function*/
class GfG {
    void addFraction(int num1, int den1, int num2, int den2) {
        int gcd=findGCD(den1, den2);
        int lcm=(den1*den2)/gcd;
        
        int D=lcm;
        int N1=(D/den1)*num1;
        int N2=(D/den2)*num2;
        int FN=N1+N2;
        
        int finalGCD = findGCD(FN, D);
        FN /= finalGCD;
        D /= finalGCD;

        System.out.println(FN+"/"+D);
    }
    
    public int findGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}