import java.util.Arrays;

public class Frekans {

    public static void main(String[] args) {

        int[] dizi={7,10,20,20,10,11,11,11,9,6,9,10,20,5,6,5,20,7,8,8};
        boolean mantık;
        int count;
        int deger;

        System.out.println("Dizi: "+Arrays.toString(dizi)+"\n");

        System.out.println("Frekanslar:");

        for (int i=0; i< dizi.length; i++){

            mantık=false;
            count=1;
            deger=dizi[i];

            for (int k=0; k<i; k++)
                if (deger==dizi[k]) {

                    mantık = true;
                    break;

                }

            if (mantık)
                continue;

            for (int j=i+1; j< dizi.length; j++)
                if (deger==dizi[j])
                    count++;

            System.out.println(deger+" sayısının frekansı= "+count);

        }

    }

}
