##  Penjelasan kode program UNGUIDED


!. Mobil
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
        return "Car: " + brand + " " + model + "\n" + transmission + "\n" + engine;
    }

}
```
Penjelasan :

Kode program di atas mendefinisikan sebuah kelas **`Mobil`** dalam bahasa Java yang merepresentasikan sebuah mobil dengan atribut **merek (`brand`)**, **model (`model`)**, **transmisi (`transmission`)**, dan **mesin (`engine`)**. Atribut **transmission** dan **engine** merupakan objek dari kelas **`Transmission`** dan **`Engine`**, yang diasumsikan telah didefinisikan sebelumnya. Kelas ini memiliki sebuah konstruktor yang digunakan untuk menginisialisasi atribut saat objek dibuat. Selain itu, terdapat metode **`toString()`** yang mengembalikan representasi string dari objek **`Mobil`**, mencetak informasi merek dan model mobil serta detail dari transmisi dan mesin yang digunakan.

2. 
