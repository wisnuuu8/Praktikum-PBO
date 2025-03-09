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

### OUTPUT
```Java
--- exec:3.1.0:exec (default-cli) @ Modul2 ---
Nilai siswa pertama: 80
Nilai siswa kedua: 90
Elemen pada baris 2 kolom 3: 6
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  2.614 s
Finished at: 2025-03-09T23:28:37+07:00
------------------------------------------------------------------------
```

2. Conditional
```Java
public class Conditional {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai;
        nilai = myObj.nextInt();
        System.out.println("Nilai yang dimasukkan: " + nilai);

        // If-else statement
        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }

        
    }
}
```
Penjelasan :

kelas Conditional yang menggunakan struktur kontrol if-else untuk menentukan nilai huruf berdasarkan input pengguna. Program meminta pengguna memasukkan angka menggunakan Scanner, lalu mencetak nilai yang dimasukkan. Kemudian, berdasarkan nilai tersebut, program mengevaluasi dan menampilkan kategori hurufnya: A (≥90), B (≥80), C (≥70), atau D (<70).

### OUTPUT
```Java
--- exec:3.1.0:exec (default-cli) @ Modul2 ---
Masukkan nilai: 100
Nilai yang dimasukkan: 100
Nilai A
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  6.319 s
Finished at: 2025-03-09T23:37:27+07:00
------------------------------------------------------------------------
```

3. DataType
```Java
public class DataType {
    
       public static void main(String[] args) {
        // Deklarasi variabel
        int umur = 21;
        float beratBadan = 65.5f;
        char jenisKelamin = 'L';
        boolean mahasiswa = true;

        // Menampilkan nilai variabel
        System.out.println("Umur: " + umur);
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Mahasiswa: " + mahasiswa);
    }
}
```
Prnjelasan :

Program mendeklarasikan beberapa variabel, yaitu int untuk umur, float untuk berat badan, char untuk jenis kelamin, dan boolean untuk status mahasiswa. Setelah itu, program mencetak nilai dari masing-masing variabel ke layar.

### OUTPUT
```Java
--- exec:3.1.0:exec (default-cli) @ Modul2 ---
Umur: 21
Berat Badan: 65.5 kg
Jenis Kelamin: L
Mahasiswa: true
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  1.470 s
Finished at: 2025-03-09T23:40:36+07:00
------------------------------------------------------------------------
```

4. Main
```Java
public class Main {

    public static void main(String[] args) {
        // Declate the variable
        int a,b,c;
        // Create Scanner object
        Scanner input = new Scanner (System.in);
        // input integer
        System.out.print("Hasil inputan a: ");
        // Read the next integer from the screen 
        a = input.nextInt();
        System.out.print("Hasil inputan b: ");
        // Read the next integer from the screen
        b = input.nextInt();
        // perhitungan sederhana
        c=a+b;
        // Display the integer
        System.out.println("Hasil inputan a: "+a+"Hasil inputan b: "+b);
        System.out.println("Hasil jumlah a+b: "+c);
            
    }
}
```
Penjelasan:

Kelas Main yang meminta pengguna untuk memasukkan dua bilangan bulat (a dan b) menggunakan Scanner. Setelah menerima input, program menjumlahkan kedua bilangan tersebut dan menyimpannya dalam variabel c. Hasil input dan hasil penjumlahan kemudian ditampilkan ke layar.\

### OUTPUT
```Java
--- exec:3.1.0:exec (default-cli) @ Modul1 ---
Hasil inputan a: 2
Hasil inputan b: 3
Hasil inputan a: 2Hasil inputan b: 3
Hasil jumlah a+b: 5
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  8.180 s
Finished at: 2025-03-09T23:42:30+07:00
------------------------------------------------------------------------
```

5. Operator
```Java
public class Operator {
    
     public static void main(String[] args) {
        // Operator aritmatika
        int a = 10;
        int b = 5;
        int hasilPenjumlahan = a + b;
        int hasilPengurangan = a - b;
        int hasilPerkalian = a * b;
        int hasilPembagian = a / b;

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Operator relasional
        boolean lebihBesar = a > b;
        boolean samaDengan = a == b;

        System.out.println("Apakah a lebih besar dari b? " + lebihBesar);
        System.out.println("Apakah a sama dengan b? " + samaDengan);

        // Operator kondisional
        boolean hasilKondisi = (a > 5) && (b < 10);
        System.out.println("Apakah a lebih besar dari 5 dan b kurang dari 10? " + hasilKondisi);
    }
}
```
Penjelasan :

Kode ini menunjukkan penggunaan operator aritmatika, relasional, dan kondisional dalam Java. Program mendeklarasikan dua variabel a dan b, lalu melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian menggunakan operator aritmatika. Selanjutnya, operator relasional digunakan untuk membandingkan kedua nilai, menentukan apakah a lebih besar dari b atau sama dengannya. Terakhir, program menggunakan operator kondisional untuk mengevaluasi dua kondisi sekaligus dengan logika AND (&&), kemudian menampilkan hasilnya ke layar

### OUTPUT
```Java
--- exec:3.1.0:exec (default-cli) @ Modul1 ---
Nilai a: 10
Nilai b: 5
Hasil Penjumlahan: 15
Hasil Pengurangan: 5
Hasil Perkalian: 50
Hasil Pembagian: 2
Apakah a lebih besar dari b? true
Apakah a sama dengan b? false
Apakah a lebih besar dari 5 dan b kurang dari 10? true
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  1.519 s
Finished at: 2025-03-09T23:45:33+07:00
------------------------------------------------------------------------
```
