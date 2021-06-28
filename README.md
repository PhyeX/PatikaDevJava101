# PatikaDevJava101
Final Project Kazanma Senaryosu:
  ```java
  Satır sayısınız giriniz 
  3
  Sütun sayısını giriniz 
  3
  Mayın Tarlası Oyuna Hoşgeldiniz !
  - - - 
  - - - 
  - - - 
  Satır sayısınız giriniz 
3
Sütun sayısını giriniz 
3
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
===========================
Satır Giriniz 0
Sütun Giriniz 0
1 - - 
- - - 
- - - 
===========================
Satır Giriniz 0
Sütun Giriniz 1
1 1 - 
- - - 
- - - 
===========================
Satır Giriniz 0
Sütun Giriniz 2
1 1 0 
- - - 
- - - 
===========================
Satır Giriniz 1
Sütun Giriniz 2
1 1 0 
- - 0 
- - - 
===========================
Satır Giriniz 2
Sütun Giriniz 2
1 1 0 
- - 0 
- - 0 
===========================
Satır Giriniz 2
Sütun Giriniz 1
1 1 0 
- - 0 
- 2 0 
===========================
Satır Giriniz 1
Sütun Giriniz 1
Oyunu kazandın!

Process finished with exit code 0

  ```
  Final Project Kaybetme Senaryosu
  ```java
  Satır sayısınız giriniz 
3
Sütun sayısını giriniz 
3
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
===========================
Satır Giriniz 0
Sütun Giriniz 1
- 2 - 
- - - 
- - - 
===========================
Satır Giriniz 0
Sütun Giriniz 2
- 2 0 
- - - 
- - - 
===========================
Satır Giriniz 0
Sütun Giriniz 0
Game Over!!

Process finished with exit code 0

  ```
# OOP Diagram Homework
# Üniversite Yönetim Sistemi
  Üniversiteye ait sınıflıklar, çalışma ofisleri ve departmanlar vardır.
  
  Departmanlara ait ofisler vardır.
  
  Üniversiteye ait çalışanlar vardır. Bu çalışanlar profesör veya memur olabilir.
  
  Her çalışan bir ofiste çalışır.
  
  Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.
  
  Evet paintte çizdim evet çok kötü gözükebilir belkide yanlıştırda ama dia kadar kanser edici değil.
  
  ![image](https://user-images.githubusercontent.com/45934056/123136775-f99f2100-d45b-11eb-8feb-cfaeb6717c2e.png)
  
 # Ödev - Hayvanat Bahçesi
Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyorsunuz.

Hayvanlar:

Atlar (atlar, zebralar, eşekler vb.),
Kedigiller (kaplanlar, aslanlar vb.),
Kemirgenler (sıçanlar, kunduzlar vb.)
gibi gruplardaki türlerle karakterize edilir.
Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.

tür adı, ağırlığı, yaşı vb.
Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()

Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()

Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı
olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.

Not: Fonksiyonların erişimleri public + olucak resimde - kalmış.

![image](https://user-images.githubusercontent.com/45934056/123145612-b184fc00-d465-11eb-9b35-8df47b95bc21.png)

# Ödev - Uçuş Yönetim Sistemi
Uçuşların ve pilotların yönetimi için bir sistem tasarlayın.

Havayolu şirketleri uçuşları gerçekleştirir. Her havayolunun bir kimliği vardır.

Havayolu şirketi, farklı tipteki uçaklara sahiptir.

Uçaklar çalışır veya onarım durumunda olabilir.

Her uçuşun benzersiz kimliği, kalkacağı ve ineceği havaalanı, kalkış ve iniş saatleri vardır.

Her uçuşun bir pilotu ve yardımcı pilotu vardır ve uçağı kullanırlar.

Havaalanlarının benzersiz kimlikleri ve isimleri vardır.

Havayolu şirketlerinin pilotları vardır ve her pilotun bir deneyim seviyesi mevcuttur.

Bir uçak tipi, belirli sayıda pilota ihtiyaç duyabilir.

Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.

 
![image](https://user-images.githubusercontent.com/45934056/123151179-e2682f80-d46b-11eb-9d6d-323ed391a92b.png)


Ödev - Online Film Sitesi
Online film satan veya kiralayan uygulamanın sistemini tasarlayın.

Uygulamada filmler listenebilir, sıralanabilir ve kullanıcılar uygulamaya abone olabilir.
Kullanıcılar abonelik için sistem üzerinden kredi satın alır.
Sadece abone olan kullanıcılar, kredileri ile film kiralayabilir ve kiraladığı filmin kredi bedeli kadar hesabından düşülür.
Normal kullanıcılar ve aboneler film satın alabilirler.
Eğer film mevcut değilse ise talep edilebilir.
Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.


![image](https://user-images.githubusercontent.com/45934056/123695084-ccd77900-d862-11eb-8d5d-745de6d62c62.png)

