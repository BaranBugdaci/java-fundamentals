Mayın Tarlası (MineSweeper) Projesi Gereksinimleri
1. Genel Mimari ve Teknik Kurallar
   Oyun metin tabanlı (konsol üzerinden) geliştirilmelidir.

Projenin temel veri yapısı çift boyutlu diziler (2D Array) olmalıdır.

Proje sadece MineSweeper sınıfı içerisinde tasarlanmalıdır.

Kod tekrarını önlemek için SRP (Tek Sorumluluk Prensibi) göz önünde bulundurulmalı ve alt işlemlerde metotlar kullanılmalıdır.

İpucu: Harita kontrolü için 2 boyutlu dizileri String veri türünde tanımlamak işleri kolaylaştıracaktır.

Arka planda mayınların gerçek konumlarını tutan bir dizi ve oyuncuya gösterilecek boş/açılmış alanları tutan ayrı bir dizi olmak üzere toplam iki adet 2D dizi tanımlanmalıdır.

2. Harita Oluşturma ve Mayın Yerleşimi
   Matrisin boyutu (satır ve sütun sayısı) oyun başlangıcında kullanıcı tarafından belirlenmelidir.

Minimum matris boyutu 2x2 olmalıdır.

Kullanıcı 2x2'den daha küçük bir değer girerse uyarı verilmeli ve geçerli bir değer girene kadar tekrar satır/sütun girmesi istenmelidir.

Eklenecek mayın sayısı dizinin toplam eleman sayısının çeyreği (satırSayısı * sütunSayısı) / 4 kadar olmalıdır.

Mayın sayısı, belirlenen formülden ne eksik ne de fazla olmalıdır (Örn: 4x3 boyutunda 12 elemanlı bir haritada tam olarak 3 mayın olmalıdır).

Mayınlar haritaya rastgele koordinatlarla yerleştirilmelidir.

Arka plandaki mayınlar sadece * sembolü ile ifade edilmelidir (Farklı sembol kullanılmamalıdır).

Oyuncuya gösterilen haritada, henüz açılmamış tüm kutucuklar başlangıçta - (tire) sembolü ile gösterilmelidir.

3. Kullanıcı Etkileşimi ve Girdi Kontrolleri
   Her turda kullanıcıdan bir nokta seçmesi için satır ve sütun değerleri istenmelidir.

Girilen koordinatların harita (dizi) sınırları içerisinde olup olmadığı mutlaka kontrol edilmelidir (Out of Bounds kontrolü).

Sınır dışı bir koordinat girilirse konsolda uyarı metni yazdırılmalı ve kullanıcıdan yeni bir koordinat istenmelidir.

Daha önce girilmiş (açılmış) bir koordinat tekrar girildiğinde kullanıcıya "Bu koordinat daha önce seçildi, başka bir koordinat girin" uyarısı gösterilmeli ve hak kaybettirmeden yeni giriş beklenmelidir.

4. Oyun İçi Mantık ve Bitiş Durumları
   Kullanıcının girdiği koordinatta mayın (*) var ise kullanıcı oyunu anında kaybetmeli ve konsolda uygun bir kaybetme mesajı gösterilmelidir.

Kullanıcının girdiği koordinatta mayın yok ise, o noktanın etrafındaki 8 komşu konuma (sağ, sol, yukarı, aşağı ve 4 çapraz) bakılmalıdır.

Komşu noktalardaki toplam mayın sayısı hesaplanıp, kullanıcının seçtiği koordinata (ekranda gösterilen haritaya) rakam olarak yazılmalıdır.

Eğer seçilen noktanın hiçbir komşusunda mayın yoksa, o koordinata 0 değeri yazılmalıdır (Farklı değer/boşluk kullanılmamalıdır).

Kullanıcı, haritadaki hiçbir mayına basmadan mayınsız tüm noktaları açmayı başarırsa oyunu kazanmalı ve uygun bir tebrik mesajı gösterilmelidir.

