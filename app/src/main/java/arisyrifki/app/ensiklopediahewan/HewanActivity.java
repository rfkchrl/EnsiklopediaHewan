package arisyrifki.app.ensiklopediahewan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.ensiklopediahewan.Adapter.AdapterHewan;
import arisyrifki.app.ensiklopediahewan.Holder.ModelHewan;

/**
 * Created by rfkchrl on 1/5/2019.
 */

public class HewanActivity extends AppCompatActivity {



    public List<ModelHewan> hewan = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerHewan);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        hewanColection();

        AdapterHewan adapterHewan = new AdapterHewan(hewan);
        recyclerView.setAdapter(adapterHewan);


    }

    private void hewanColection() {
        hewan.add(new ModelHewan(
                "Albatros",
                "Albatros adalah burung laut yang terbesar. Ia berdatahan hidup dibumi bagian selatan yang dingin" +
                "dengan memakan ikan laut dan air laut. Albatris dapat melayang sangat lama dengan sayapnya" +
                        "yang besar dan terbang sejauh 15.000 Km setiap kali menyembrang samudera" +
                        "Diantara semua jenis burung, albtaros memiliki sayap terpangjang, hampir 4meter dari" +
                        "ujung ke ujung. Albatros hanya kembali kedarat untuk bertelur dan membesarkan anaknya."
                ,
                R.drawable.albatros));

        hewan.add(new ModelHewan(
                "Alligator",
                "Alligator adalah reptil besar yang hidup disungai dan rawa-rawa daerah tropis, mereka mengapung dibawah permukaan air," +
                        " hanya memperlihatkan mata dan lubang hidung dipermukaan air, siap menerkam ikan, penyu," +
                        " dan bahkan mamalia besar dengan rahangnya yang kuat. Rahang aligator lebih lebar dan lebih pendek dibandingkan dengan rahang buaya." +
                        " terdapat 60-80 gigi untuk merobek mangsa. ",
                R.drawable.alligator));

        hewan.add(new ModelHewan(
                "Anaconda",
                "Anaconda adalah ular terbesar didunia. Beratnya bisa mencapai 100 kg, hampir sama dengan berat seekor babi besar." +
                        " Ia hidup di hutan Amerika Selatan, berburu mangsa di pepohonan dan sungai-sungai." +
                        " Anaconda disebut pembelit, karena ia membelit atau menjepit mangsanya sampai mati sebelum menelannya." +
                        " Anaconda juga dapat memangsa hewan yang lebih besar daripada tubuhnya. Sehingga setelah makan anaconda tidak" +
                        " perlu makan selama satu bulan",
                R.drawable.anaconda));

        hewan.add(new ModelHewan(
                "Anteater",
                "Anteater adalah mamalia di Amerika Selatan dan Amerika Tengah. Makanannya adalah semut, rayap, dan serangga lainnya." +
                        "Ia memang terlihat aneh dengan moncongnya yang meruncing, lidahnya yang lengket, dan cakarnya yang tajam." +
                        "Namun, itu dirancang khusus untuk membongkar sarang serangga dan menjilat mangsa lezat didalamanya.",
                R.drawable.anteater));

        hewan.add(new ModelHewan(
                "Antelope",
                "Antelop hidup merumput didataran luas Afrika dan Asia. Larinya juga sangat kencang. Banyak jenis antelop yang berbeda." +
                        " Antelope royal tingginya 25 cm sampai bahu, sedangkan si raksasa eland tingginya 1.75 m." +
                        " Antelop jantan tanduknya melengkung, Kadang antelope betina juga bertanduk.",
                R.drawable.antelope));

        hewan.add(new ModelHewan(
                "Arctic Tern",
                "Arctic Tern melakukan perjalan terjauh diantara semua perjalanan binatang. Setelah bersarang di pantai Kutub Utara pada musim gugur," +
                        " ia terbang ke Kutub Selatan untuk mencari ikan selama beberapa bulan. Pada musim semi," +
                        " ia kembali ke utara untuk berkembang biak. Arctic Tern bertelur 2 sampai 3 butir dalam sarangnya" +
                        " di padang salju yang bisa juga disebut Tundra. ",
                R.drawable.arctictern));

        hewan.add(new ModelHewan(
                "Armadillo",
                "Armadillo adalah mamalia dengan tubuh berpelindung seperti baju tempur. Ia berkerabat dengan pemakan semut dan kukang." +
                        " Ia hidup di Amerika Utara dan Amerika Selatan. Armadillo memakan tanaman, serangga, dan binatang kecil. Mereka menyukai semut dan rayap" +
                        " yang mereka gali dengan cakar kaki depan mereka yang kuat. Armadillo dapat hidup sendiri, berpasangan, atau berkelompok kecil di liang bawah tanah." +
                        " Mereka mencari makan dimalam hari. Mereka mudah takut dan akan langsung lari ke liang mereka jika terancam.",
                R.drawable.armadillo));

        hewan.add(new ModelHewan(
                "Baboon",
                "Baboon adalah monyet besar yang hidup dalam kelompok yang jumlahnya lebih dari 100 baboon. Makanan mereka berfariasi dari biji-bijian," +
                        " buah dan rumput, sampai hewan dan telur. Mereka hidup di selatan gurun Sahara di Afrika." +
                        " Baboon menghabiskan waktunnya untuk saling merawat. Karena itu hubungan ibu dan anak, juga antara anggota kelompok sangat dekat." +
                        " Kelompok mereka terdiri dari  baboon betina, jantan dan dipimpin oleh satu baboon jantan.",
                R.drawable.baboon));

        hewan.add(new ModelHewan(
                "Badger",
                "Badger (Luak) adalah binatang yang kuat tapi pemalu. Ia berkerabat dengan sigung, mukannya juga bertanda hitam dan putih seperti sigung" +
                        " Mereka hidup berkelompok di hutan. Badger adalah Omnivora, pemakan daging dan tumbuhan. ia memakan rumput, buah, kacang, telur, dan binatang kecil." +
                        " Ia juga mahir dalam menggali tanah dan sering menangkap cacing",
                R.drawable.badger));

        hewan.add(new ModelHewan(
                "Beruang",
                "Beruang adalah binatang pemakan daging terbesar di dunia, Beruang ada berbagai jenis, kebanyakan hidup di belahan bumi utara." +
                        " Bulu yang tebal melindungi mereka dari udara dingin. Berungan sangat kuat dan besar, kukunya kuat dan penciumannya tajam." +
                        " Beruang Kodiak Alaska adalah beruang terbesar. Beratnya dapat mencapai 800 kg dan jika berdiri tingginya bisa mencapai 4 meter",
                R.drawable.beruang));

        hewan.add(new ModelHewan(
                "Berang-berang",
                "Berang-berang hidup didekat sungai di Amerika Utara dan Eropa Utara. Ia adalah pembuat rumah yang hebat. Ia menebang pohon dengan " +
                        " gigi depannya yang kuat, untuk membangun rumahnya yang disebut pondokan. Berang-berang membendung sungai dengan ranting pohon untuk membuat kolam. " +
                        " Di kolam inilah ia membuat pondokannya. Ia berenang dengan kakinya yang besar dan berselapot serta ekornya yang tipis dan lebar.",
                R.drawable.berang));

        hewan.add(new ModelHewan(
                "Bison",
                "Bison adalah binatang terbesar di Amerika Utara. Walaupun besar, ia gesit dan cepat. " +
                        " Makanannya tumbuhan dan rumput. Bison hidup dalam kelompok kecil. Bison janta dan betina hidup terpisah kecuali pada musim kawin" +
                        " saat bisin jantan memperebutkan betina. Dulu ada 50 juta bison di Amerika Utara. Tetapi manusia memburu mereka hingga hampir punah.",
                R.drawable.bison));

        hewan.add(new ModelHewan(
                "Bebek",
                "Bebek adalah burung air. Mereka terdapat hampir di seluruh tempat di dunia. Bulu yang tebal membuat mereka tetap hangat dan kakinya yang berselaput" +
                        " dapat mengayuh seperti dayung. Bebek mempunyai sepasang kaki yang pendek sehingga membuatnya berjalan bergoyang-goyang." +
                        " Mereka mempunyai tiga jari yang berselaput menjadi satu dan satu jari yang terpisah dibelakang kakinya. Hampir semua jenis bebek " +
                        " hidup diair tawar. Makanannya serangga, cacing, dan sayuran.",
                R.drawable.bebek));

        hewan.add(new ModelHewan(
                "Belut",
                "Belut adalah ikan. walaupun tubuhnya panjang dan tipis belut bukanlah ular. Belut mempunyai sirip tipis dan bersisik disepanjang tubuhnya." +
                        " Belut Moray bisa tumbuh sampai sepanjang 3 meter.  ia bersembunyi dalam lubang di bebatuan pada siang hari dan keluar pada malam hari." +
                        " Makanannya kerang, namun ia akan menyerang manusia kalau diganggu.",
                R.drawable.belut));

        hewan.add(new ModelHewan(
                "Chameleon",
                "Chameleon adalah kadal yang dapat mengubah warna kulitnya. Mereka melakukannya ketika marah atau takut, Ketika ada perubahan" +
                        " cahaya dan suhu udara. juga untuk bersembunyi. Chameleon bertengger diam didahan pohon menunggu serangga untuk dimangsa. Ekornya yang kuat melingkar didahan pohon," +
                        " sementara matanya yang bisa berputar melihat mangsa dari dua arah pada saat yang bersamaan. Ketika" +
                        " saatnya tiba, lidahnya yang panjang melesat keluar menangkap mangsanya.",
                R.drawable.chameleon));

        hewan.add(new ModelHewan(
                "Cheetah",
                "Cheetah adalah kucing berbadan langsing tutul-tutul dan berkaki panjang. Mereka adalah binatang darat tercepat. Kecepatannya lebih dari 100 km/jam." +
                        " Cheetah hidup di padang luas Afrika, sebelah selatan gurun Sahara. Cheetah betina melahirkan 4 anak dalam sekali kelahiran." +
                        " Anak cheetah mempunyai bulu panjang abu-abu, sehingga mereka terlihat seperti luak madu. sehingga membuat cheetah kecil aman dari bahaya ",
                R.drawable.cheetah));

        hewan.add(new ModelHewan(
                "Cobra",
                "Cobra adalah ular berbisa di Afrika, India, dan Asia. Cobra yang paling mematikan adalah Cobra mamba Afrika. Orang yang digigit ular ini bisa" +
                        " mati kalau tidak segera diberi penawar bisa ular. Setiap tahun banyak orang yang mati digigit Ccobra." +
                        " King Cobra hidup didaerah yang terbentang dari Cina Selatan sampai Indonesia. Mereka adalah ular berbisa terpanjang didunia." +
                        " Panjangnnya 5,5 meter. ",
                R.drawable.cobra));

        hewan.add(new ModelHewan(
                "Gorilla",
                "Gorilla adalah monyet yang sangat besar dan kuat, Meskipun terlihat ganas, mereka sebenarnya binatang lembut pemakan tumbuhan." +
                        " Gorilla hidup dihutan dan gunung Afrika Tengah. Gorilla hidup berkelompok. mereka dipimpin oleh gorilla jantan yang bernama punggu perak." +
                        " Gorilla belajar berjalan saat berumur  10 tahun. Selama 2 tahun mereka disusui oleh induknya dan menghabiskan waktunya dengan bermain. Mereka tidur " +
                        " bersama induknya sampai berumur 3 tahun.",
                R.drawable.gorilla));

        hewan.add(new ModelHewan(
                "Hyena",
                "Hyena adalah mamalia yang hidup di Afrika dan Asia. Mereka memakan daging dan tulang sisa makanan singa. Rahangnya begitu kuat sampai bisa " +
                        " meremukan tulang yang bahkan terlalu keras bagi singa. Hyena tutul adalah hyena paling besar dan kuat. Panjangnya bisa mencapai 2 meter." +
                        " Mereka berburu secara berkelompok dan kadang-kadang menyerang badak",
                R.drawable.hyena));

        hewan.add(new ModelHewan(
                "Jerapah",
                "Jerapah adalah binatang tertinggi didunia. Tingginya bisa mencapai 6 meter. Kaki depannya sangat panjang sehingga mereka harus membuka" +
                        " kakinya lebar-lebar untuk minum dari mata air. Jerapah hidup dalam kelompok kecil di padang rumput Afrika. Sekitar 15 bulan setelah kawin" +
                        " jerapah betina melahirkananaknya. Satu atau dua jam setelah lahir. anak jeraph bisa langsung berdiri dan mengikuti induknya." +
                        " Jerapah memanfaatkan tingginya untuk memakan daun di puncak pohon Akasia. Mulutnya yang kuat dapat mematahkan ranting berduri.",
                R.drawable.jerapah));

        hewan.add(new ModelHewan(
                "Kambing",
                "Kambing pandai mendaki dan dapat bertahan hidup di pegunungan tinggi. Kambing liar hidup dibelahan bumi utara. Kambing dipelihara untuk diambil" +
                        " susu, daging dan kulitnya. Kambing dijinakkan pertama kali di 10.000 tahun yang lalu dan sudah menghasilkan banyak keturunan. Mereka suka makan rumput dan tumbuhan." +
                        " Namum mereka akan memakan pohon berduri dan semak belukar untuk bertahan hidup.",
                R.drawable.kambing));

        hewan.add(new ModelHewan(
                "Kuda",
                "Kuda  adalah hewan yang mempunyai kaki panjang serta jantung dan paru-paru yang besar membuat kuda sangat kuat dan cepat." +
                        " Manusia memanfaatkannya untuk ditunggangi dan menarik kereta selama 5000 tahun. Nenek moyang kuda adalah kuda liar " +
                        " yang hidup berkelompok dipadang rumput.",
                R.drawable.kuda));

        hewan.add(new ModelHewan(
                "Kuda Nil",
                "Kuda Nil mempunyai tubuh besar berbentuk tong dan kaki yang pendek. Mskipun tidak berkerabat dengan kuda, mereka memang hidup di dekat sungai Nil di Afrika." +
                        " Kuda Nil membpunyai mulut yang bersar dengan dua taring raksasa dirahan bawahnya. Pada musim kawin, kuda nil saling memamerkan mulur mereka dan melukai menggunakan taringnya." +
                        " Kuda Nil menginggalkan air dan mencari rumput untuk dimakan pada malam harinya. Ia memotong rumput dengan bibirnya yang keras.",
                R.drawable.kudanil));

        hewan.add(new ModelHewan(
                "Kangguru",
                "Kangguru adalah binatang marsupial yang hidup di Australia. Marsupial betina punya kantung di perutnya tempat pertumbuhan" +
                        " anaknya sampai anak itu cukup besar untuk hidup sendiri. Ketika baru lahir, bayi kangguru panjangnnya hanya 2cm. Ia merangkak kekantung" +
                        " induknya melalui jalur di bulu induknya yang telah disiapkan induknya dengan cara menjilati bulunya." +
                        " Bayi kangguru menyusu dan tinggal didalam kantung sampai ia cukup besar untuk menjaga dirinya sendiri",
                R.drawable.kangguru));

        hewan.add(new ModelHewan(
                "Lalat",
                "Lalat ada berbagai jenis da ada di mana mana. Mereka hanya mempunyai sepasang sayap untuk terbang. " +
                        " Sayap belakangnya yang kecil hanya berfungsi menjaga keseimbangan. Lalat membantu penyerbukan tumbuhan" +
                        " dengan cara membawa serbuk sari dari satu bungan kebunga lainnya. Namun ada juga lalat yang membawa penyakit.",
                R.drawable.lalat));

        hewan.add(new ModelHewan(
                "Landak Susu",
                "Landak Susu adalah mamalia yang bertahan hidup di hutan Eropa, Asia, dan Afrika. Punggungnya dilaposo ribuan duri tebal yang dapat melindunginya" +
                        " dari musuh. ADa juga landak susu berambut yang hidup di asia. Jika ada dalam bahaya, Landak susu mengglungkan tubuhnya menjadi bola duri. hal ini menakuti musuh" +
                        " namun banyak landak susu yang tergilas mobil saat menggulungkan diri ditengah jalan. " +
                        " Fungsi lain dari durinya adalah sebagai bantalan penahan jika landak susu terjatuh saat memanjat pohon",
                R.drawable.landaksusu));

        hewan.add(new ModelHewan(
                "Ubur-Ubur",
                "Ubur-Ubur adalah binatang laut yang bertubuh lunak dan kenyal karena hampir seluruhnya terbuat dari air. Ubur-ubur paling kecil " +
                        " lebarnya hanya beberapa centimeter, sedangkan yang besar lebarmua nisa lebih dari 2 meter." +
                        " Ada ubur-ubur yang hanya bisa bergerak dengan mengikuti arus. ada pula yang bergerak sendiri dengan cara memopa" +
                        " air keluar dari lipatan tubuhnya dengan cepat.",
               R.drawable.ubur));


    }
}
