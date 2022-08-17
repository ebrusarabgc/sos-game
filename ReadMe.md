# Ödev SOS Oyunu

|   | 1 | 2 | 3 | 4 | 5 |
|---|---|---|---|---|---|
| 1 | s | s | s | o | s |
| 2 | s | o | s | s | o |
| 3 | o | o | s | o | s |
| 4 | s | o | s | s | o |
| 5 | o | o | s | o | s |


Kare şeklinde nxn kutulardan oluşan bir panelde iki kişi tarafından oynanan bir oyundur. Oyun sırasında
her bir kutuya **s** yada **o** harflerinden biri yerleştirilir. Oyunun başında kimin başlayacağına random olarak
karar verilir. Amaç bir harf koyduğumuzda yatayda, dikeyde yada çarprazda **SOS**
kelimesini oluşturmaktır. SOS kelimesini oluşturan oyuncu 1 puan alır ve tekrar harf ekleme hakkı kazanır.
Panel üzerinde hiç boş kutu kalmayana kadar oyun oynanır, sonunda en çok puanı alan oyunu kazanır.

## Kurallar
1. Panel büyüklüğü oyunun en başında konsoldan girdi olarak alınır. Minimum 5x5 maksimum 10x10 büyüklüğünde olmalıdır.
2. Oyun bir kullanıcı tarafından bilgisayara karşı oynanır.
3. Kimin başlayacağına random karar verilir.
4. Oyuncu hangi kutuya harfini girmek istediğini satır, sütun numarasını ve harfi konsoldan girerek belli eder.
5. Bilgisayar hangi kutuya hangi harfi yazacağına random seçerek karar verir, panel üzerindeki boş kutulardan birini random olarak seçer.
6. Panele her karakter girişinde panelin güncel hali satır ve sütun numaraları ile birlikte ve oyuncuların puan durumu
   ekranda gösterilir.
7. Dolu kutulara harf yazılmasına izin verilmez.

## Teknik beklentiler
- Odev sorunsuz derlenebilmeli ve calistirilabilmelidir.
- Odev OOP prensipleri goz onunde bulundurularak gelistirilmelidir.
   
> Önemli Not : Başka kaynaklardan yararlanabilirsiniz ama kopya ödevler başarısız kabul edilecektir :)  
