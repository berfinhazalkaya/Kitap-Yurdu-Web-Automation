# Kitap-Yurdu-Web-Automation
Kitap Yurdu Web Automation

## Projenin Senaryosu

- https://www.kitapyurdu.com/ sitesi açılır.
- Ana sayfanın açıldığı kontrol edilir.
- Ürün arama alanına “roman” yazılır ve klavyeden “enter” tuşuna basılır. (Ürün
aranına yazılacak roman kelimesi csv uzantılı dosyadan okunması gerekmektedir.)
- Listelenen kitapların arasından rastgele bir kitap seçilir.
- Sepete ekle butonuna basılır.
- Sayfanın sağ üst kısmında bulunan sepet ikonundaki değer kontrol edilir.
- Sepetim butonuna tıklanır.
- Sepete git butonuna tıklanır.
- Ürün miktarı “1” adet arttırılır.
- Yenile butonuna basılır.
- Sepetiniz güncelleniyor yazısının geldiği kontrol edilir.
- Çarpı butonuna basılır.
- Sepetin boş olduğu kontrol edilir.

## Kullanılan Teknolojiler

- Java (Projenin yazılmış olduğu kodlama dilidir)
- TestNG(Test Caselerin yazılması ve çıktıların kontrollerinde kullanılan Test Yazım Aracıdır)
- Selenium (Web Sitesini test etmek için kullanılan Test Otomasyon Aracıdır)
- Page Object Pattern (Projede kullanılan mimari yapıdır)
- Maven (Genellikle Java platformunda yer alan komutların derlenmesi sırasında kullanılan otomasyon ve inşa aracıdır)
- Cucumber(Cucumber, BDD (Behavior Driven Developmet) destekli bir test otomasyon yaklaşımıdır)
- Gherkin (Gherkin bir plain-text language’dir. Yazılımcı olmayan kişiler tarafından öğrenilebilecek şekilde tasarlanmıştır)
- Log4J (Java tabanlı bir loglama kütüphanesidir)

## Projenin Ayağa Kaldırılması
- src/test/resources/testSuites/Parallel.xml dosyasından çalıştırılmalıdır.

## Raporlar
Raporlar(Cucumber Rapor ve Spark Rapor), Reports klasörünün içinde bulunmaktadır. 
