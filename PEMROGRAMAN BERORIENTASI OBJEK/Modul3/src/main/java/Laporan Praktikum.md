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

# GUIDED

1. Phone
```Java
public class Phone {
    String brand;
    int yearRelease;
    
    void Call(){
        System.out.println("Calling");
    }

    void SMS(){
        System.out.println("Sending SMS");
    }

    void TurnOn(){
        System.out.println("Turning on " + brand);
    }

    void TurnOff(){
        System.out.println("Turning off " + brand);
    }

}
```
Penjelasan :

Kelas ini memiliki dua atribut utama, yaitu brand, yang menyimpan merek ponsel, dan yearRelease, yang menyimpan tahun rilisnya. Selain itu, terdapat beberapa metode yang merepresentasikan fungsi dasar ponsel, seperti Call() untuk melakukan panggilan, SMS() untuk mengirim pesan, TurnOn() untuk menyalakan ponsel, dan TurnOff() untuk mematikanny

2. Phone Action 
```Java
public class PhoneAction {
    
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Nokia";
        phone1.yearRelease = 2001;
        Phone phone2 = new Phone();
        phone2.brand = "Apple";
        phone2.yearRelease = 2005;
        
        System.out.println("Phone 2 Brand " + phone1.brand);
        System.out.println("Phone 2 Brand " + phone1.yearRelease);
        System.out.println("Phone 1 Brand " + phone2.brand);
        System.out.println("Phone 2 Brand " + phone2.yearRelease);

    }
    
}
```
Penjelasan :

Kelas PhoneAction sebagai titik awal eksekusi, di mana dua objek Phone dibuat. Objek phone1 memiliki merek "Nokia" dengan tahun rilis 2001, sedangkan phone2 memiliki merek "Apple" dengan tahun rilis 2005.

### Output
```Java
--- exec:3.1.0:exec (default-cli) @ Modul3 ---
Phone 2 Brand Nokia
Phone 2 Brand 2001
Phone 1 Brand Apple
Phone 2 Brand 2005
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  0.817 s
Finished at: 2025-03-09T22:25:40+07:00
------------------------------------------------------------------------
```
