package mu.evcalismalari.dikdörtgen;

public class Dikdortgen {


    public void drawFilledFakeRectangular(int row, int column) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
                if (j == column -1)
                    System.out.println();
            }
        }
    }


    //colum-1  ya da row-1 diyoruz ama mesela (6,9)luk bir dikdörtgen ölçüleri istediğimizde (6,9)luk çiziyor.Çünkü başlangıç 1'den değil 0'dan başlıyor!!!!

    public void drawVoidRectangular(int row, int column){

        for (int i = 0; i < row; i++){
            for (int j = 0; j<column; j++){

                if (i == 0 | i == row-1)
                    System.out.print("*");
                else

                if(j != 0 & j != column-1)
                    System.out.print(" ");


                    else
                    System.out.print("*");

                if (j == column-1)
                    System.out.println();
            }

    }
}
}