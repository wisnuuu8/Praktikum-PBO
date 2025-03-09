# UNGUIDED


1. Mobil
```java
public class Mobil {
    private final String brand;
    private final String model;
    private final Transmission transmission;
    private final Engine engine;

    public Mobil(String brand, String model, Transmission transmission, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Mobil: " + brand + " " + model + "\n" + transmission + "\n" + engine;
    }

}
```
Penjelasan :

Kode program di atas mendefinisikan sebuah kelas **`Mobil`** dalam bahasa Java yang merepresentasikan sebuah mobil dengan atribut **merek (`brand`)**, **model (`model`)**, **transmisi (`transmission`)**, dan **mesin (`engine`)**. Atribut **transmission** dan **engine** merupakan objek dari kelas **`Transmission`** dan **`Engine`**, yang diasumsikan telah didefinisikan sebelumnya. Kelas ini memiliki sebuah konstruktor yang digunakan untuk menginisialisasi atribut saat objek dibuat. Selain itu, terdapat metode **`toString()`** yang mengembalikan representasi string dari objek **`Mobil`**, mencetak informasi merek dan model mobil serta detail dari transmisi dan mesin yang digunakan.

2. Engine
```Java
public class Engine {
    private final int horsepower;
    private final String fuelType;

    public Engine(int horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine: " + horsepower + " HP, Fuel: " + fuelType;
    }
}
```
Penjelasan :

Kelas Engine dalam bahasa Java yang merepresentasikan mesin sebuah mobil. Kelas ini memiliki dua atribut utama, yaitu horsepower yang menunjukkan tenaga mesin dalam satuan HP (Horsepower) dan fuelType yang menunjukkan jenis bahan bakar yang digunakan, seperti bensin atau diesel.

3. Transmission
```Java
public class Transmission {
    private final String type;
    private final int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission: " + type + ", " + gears + " gears";
    }
}
```
Penjelasan :

Membuat kelas **`Transmission`** dalam Java untuk menggambarkan sistem transmisi mobil. Di dalamnya ada dua atribut utama: **`type`**, yang menunjukkan apakah transmisinya manual atau otomatis, dan **`gears`**, yang menunjukkan berapa banyak gigi yang dimiliki transmisi tersebut.

4. Main
```Java
public class Main {
    public static void main(String[] args) {
        Transmission transmission = new Transmission("Automatic", 6);
        Engine engine = new Engine(250, "Gasoline");
        Mobil car = new Mobil("Toyota", "Supra", transmission, engine);

        System.out.println(car);
    }
}
```
Penjelasan :

Kode program ini menjalankan fungsi utama dari aplikasi. Pertama, program membuat transmisi mobil dengan tipe **"Automatic"** dan jumlah gigi **6**. Lalu, dibuat mesin dengan tenaga **250 HP** dan bahan bakar **"Gasoline"**. Setelah itu, program membuat mobil dengan merek **"Toyota"** dan model **"Supra"**, yang menggunakan transmisi dan mesin tadi. Terakhir, informasi tentang mobil ini ditampilkan di layar.

### Output 
```Java
--- exec:3.1.0:exec (default-cli) @ Modul3 ---
Mobil: Toyota Supra
Transmission: Automatic, 6 gears
Engine: 250 HP, Fuel: Gasoline
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  1.309 s
Finished at: 2025-03-09T22:07:20+07:00
------------------------------------------------------------------------
```
