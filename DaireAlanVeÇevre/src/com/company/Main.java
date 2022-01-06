        package com.company;
        import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                  Scanner input= new Scanner(System.in);
                  int r;
                  double a;
                  double alan,cevre,dilim;
                  double pi= 3.14;
                System.out.println("Dairenin alanını girinz");
                  r=input.nextInt();
                System.out.println("Merkez acı ölcü giriniz");
                 a=input.nextInt();
                  alan =pi*r*r;
                System.out.println("ALAN: "+ alan);
                 cevre = 2*pi*r;
                System.out.println("Cevre: "+ cevre);
                System.out.print("Merkez açı ölcü: ");
                System.out.println(( pi* (r*r) * a) / 360);
            }
        }
