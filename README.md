# Armstrong Sayısı Kontrolcüsü / Armstrong Number Checker

[English version below](#english-version)

## Türkçe

Bu Java programı, girilen bir sayının Armstrong sayısı olup olmadığını kontrol eder.

### Armstrong Sayısı Nedir?

Armstrong sayısı, her bir basamağının basamak sayısı kadar kuvvetinin toplamı kendisine eşit olan sayıdır. Örneğin:

- 153 bir Armstrong sayısıdır çünkü 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
- 370 bir Armstrong sayısıdır çünkü 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370

### Nasıl Kullanılır

1. Sisteminizde Java'nın kurulu olduğundan emin olun.
2. Java dosyasını derleyin:
   ```
   javac ArmstrongSayisi.java
   ```
3. Programı çalıştırın:
   ```
   java ArmstrongSayisi
   ```
4. İstendiğinde, Armstrong sayısı olup olmadığını kontrol etmek istediğiniz sayıyı girin.

### Program Detayları

Program şunları yapar:

1. Kullanıcıdan bir sayı girmesini ister.
2. Girilen sayının basamak sayısını hesaplar.
3. Her basamağı ayırır ve basamak sayısı kadar kuvvetini alır.
4. Bu değerleri toplar.
5. Toplamı orijinal sayı ile karşılaştırır.
6. Sayının Armstrong sayısı olup olmadığını çıktı olarak verir.

### Örnek

```
Bir sayı giriniz: 
153
153 bir Armstrong sayısıdır.
```

```
Bir sayı giriniz: 
123
123 bir Armstrong sayısı değildir.
```

### Katkıda Bulunma

Bu projeyi fork edip geliştirmeler veya başka dillere çeviriler içeren pull request'ler gönderebilirsiniz.

### Lisans

Bu proje açık kaynaklıdır ve [MIT Lisansı](https://opensource.org/licenses/MIT) altında kullanıma sunulmuştur.

---

## English Version

This Java program checks whether a given number is an Armstrong number or not.

### What is an Armstrong Number?

An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits. For example:

- 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
- 370 is an Armstrong number because 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370

### How to Use

1. Ensure you have Java installed on your system.
2. Compile the Java file:
   ```
   javac ArmstrongSayisi.java
   ```
3. Run the program:
   ```
   java ArmstrongSayisi
   ```
4. When prompted, enter a number to check if it's an Armstrong number.

### Program Details

The program does the following:

1. Asks the user to input a number.
2. Calculates the number of digits in the input.
3. Separates each digit and raises it to the power of the number of digits.
4. Sums up these values.
5. Compares the sum with the original number.
6. Outputs whether the number is an Armstrong number or not.

### Example

```
Bir sayı giriniz: (Enter a number:)
153
153 bir Armstrong sayısıdır. (153 is an Armstrong number.)
```

```
Bir sayı giriniz: (Enter a number:)
123
123 bir Armstrong sayısı değildir. (123 is not an Armstrong number.)
```

### Note

This program is written in Turkish. Here are the English translations of the prompts and messages:

- "Bir sayı giriniz:" = "Enter a number:"
- "bir Armstrong sayısıdır." = "is an Armstrong number."
- "bir Armstrong sayısı değildir." = "is not an Armstrong number."

### Contributing

Feel free to fork this project and submit pull requests with improvements or translations to other languages.

### License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
