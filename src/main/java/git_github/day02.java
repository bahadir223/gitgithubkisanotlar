package git_github;
public class day02 {
    public static void main(String[] args) {
        /*
        ====> git restore --staged[dosya]       --->Stage Area'daki tek bir dosyayı iptal eder, bir onceki asamaya (Working Space'e) gonderir.
        ====> git restore --staged .            --->Stage Area'daki tüm dosyaları iptal eder
        ====> git reset --hard                  ---->Working space deki değişiklikleri iptal eder, staging area yı boşaltır.
        Önceki Versiyonlara Dönmek Icin
        1. Yol Checkout:
        =====>git checkout [hash] .             -----> Dosya, hashcode ile belirtilen versiyona döner.
        Eger bu islemi kalici hale getirmek istersek     git commit -m"buraya ne istersen yaz"      yapmaliyiz
        2. Yol Reset: (Bu yol sikintili kullanirken dikkatli olmak gerek)
        =====>git reset --hard [hash]           ------> Geri alınamayacak şekilde önceki versiyona dönmek icin kullaniriz

        Branch (Dal);
        **Projemizi git init komutuyla Git ile iliskilendirdigimizde Git otomatik olarak bir "Master Branch" olusturur ve orada calismamiza imkan tanir.
        **Yeni yapilacak update'lerde ana projeyi korumak ve daha saglikli calisma yapabilmemiz icin yeni bir branch uzerinde calismamiz gerekir.
        Bu branch, master branch'in kopyasi uzerinde calismamiza imkan tanir. Eger update'ler ana projeye zarar vermiyorsa branch'den master branch'e geri aktarabiliriz.

        Branch LERİN FAYDALARİ
        oriinal kodların güvenligi saglanir
        her developer kendi bölümünden sorumlu olur
        daha hızlı geliştirme yapilir
        daha az hata oluşur
        organize kod yapisi saglanir
        sorunlar daha hizli düzeltilir
        kaos olmaz

        git checkout bahadir    diyerek gecmek istedigimiz branch e geceriz.
        git checkout master

        BRANCH KOMUTLARI :
        ====>git branch [isim]          ---->Yeni branch oluşturur
        NOTE : Hangi branch 'in yaninda * varsa o aktif branch'tir.
        ====>git checkout [isim]        ---->Branch aktif hale gelir.
        ====>git branch -m development  ---->önce yukarıdaki ile branch e gidiyoruz sonra Branch isim degisikligi yapmak icin kullaniriz.
        ====>git merge [isim]           ---->İki branch i birleştirir.
        ====>git branch -d development  ---->bir branch ile isimiz bitince silmek icin kullaniriz
        NOTE:Kendi bindimigimiz dali kesemeyiz o yüzden  baska branch'te iken silmek istedigimiz branch'in ismini yazmaliyiz...


        Working space ve stagin area'daki -henüz commit haline gelmemiş- değişikliklerin geçici olarak geri
        alinmasi icin stashing işlemi yapilir.

        git stash      =========>
        git stash list =========>
        git stash pop  =========>


         */
    }
}