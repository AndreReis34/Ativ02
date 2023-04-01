class Main {
  public static void main(String[] args) {
    int[] vet= new int[61];
    int num = 20;
    for(int x = 0; x<vet.length; x++){
      vet[x] = num;
      num++;
    }

    ImprimeFatorial(vet);
    

  }

  public static void ImprimeFatorial(int[] V){
    String linha = "";
    long num;
    for(int i= 0; i<V.length; i++){
      if(V[i]<24 || V[i] > 28 && V[i] <34 || V[i]>38 && V[i] < 60 || V[i]>70){
        num = fatorial(V[i]);
        linha += V[i] + " = "+ num +"\n";
      }else{
        linha += V[i] + " = "+ 0 +"\n";
      }
    }

    System.out.println(linha);
  }

  public static long fatorial(int A){
    long fatorial = 1;
    int n=1;
    while(n<=A){
      fatorial *= n;
      n++;
    }
    return(fatorial);
  }

  
}