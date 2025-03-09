# GUIDED

1. ARRAY
```Java
public class ArrayContoh {

    public static void main(String[] args) {
        // array satu dimensi
        int[] nilai = {80, 90, 75, 85, 95};
        
        System.out.println("Nilai siswa pertama: " +nilai[0]);
        System.out.println("Nilai siswa kedua: " +nilai[1]);
        
        // Array satu dimensi
        int[][]matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        
        System.out.println("Elemen pada baris 2 kolom 3: " + matrix[1][2]);
    }
}
```
Penjelasan :

Array nilai menyimpan lima angka yang mewakili nilai siswa, dan program menampilkan elemen pertama serta kedua dari array tersebut. Selain itu, terdapat array matrix berukuran 3x3, di mana program mengambil dan menampilkan elemen pada baris ke-2 dan kolom ke-3.
