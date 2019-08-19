package com.amingnurfalah.submissiondicoding;

import java.util.ArrayList;

public class HewanData {
public static String[][] data = new String[][]{

        {"Ayam peliharaan"," (Gallus gallus domesticus) adalah unggas yang biasa dipelihara orang untuk dimanfaatkan untuk keperluan hidup pemeliharanya. Ayam peliharaan (selanjutnya disingkat ayam saja) merupakan keturunan langsung dari salah satu subspesies ayam hutan yang dikenal sebagai ayam hutan merah (Gallus gallus) atau ayam bangkiwa (bankiva fowl).","https://upload.wikimedia.org/wikipedia/commons/5/50/Female_pair.jpg" },
        {"Kambing ternak ","(Capra aegagrus hircus) merupakan salah satu subspesies kambing yang dipelihara atau dijinakkan dari kambing liar Asia Barat Daya dan Eropa Timur. Kambing merupakan anggota dari keluarga Bovidae dan bersaudara dengan dengan biri-biri karena keduanya tergolong dalam sub famili Caprinae. Terdapat lebih 300 jenis kambing yang berbeda-beda.[1] Kambing adalah salah satu di antara spesies yang paling lama di ternakkan, yaitu untuk susu, daging, bulu, dan kulit di seluruh dunia.","https://upload.wikimedia.org/wikipedia/commons/7/73/African_Pygmy_Goat_002.jpg"},
        {"Sapi", "(Auerochse atau Urochse) adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan Lembu. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia.","https://upload.wikimedia.org/wikipedia/commons/0/0c/Cow_female_black_white.jpg"},
        {"Bebek","Bebek Atau Itik adalah nama umum untuk beberapa spesies burung dalam famili Anatidae. Bebek umumnya adalah burung akuatik yang sebagian besar berukuran lebih kecil dibandingkan kerabatnya, angsa dan angsa berleher pendek, dan dapat ditemukan pada perairan air tawar maupun air laut.","https://upload.wikimedia.org/wikipedia/commons/2/2a/Duck_pato_002eue.jpg"},
        {"Ikan","Ikan adalah anggota vertebrata poikilotermik (berdarah dingin)[1] yang hidup di air dan bernapas dengan insang. Ikan merupakan kelompok vertebrata yang paling beraneka ragam dengan jumlah spesies lebih dari 27,000 di seluruh dunia. Secara taksonomi, ikan tergolong kelompok paraphyletic yang hubungan kekerabatannya masih diperdebatkan.","https://tabloidsinartani.com/uploads/news/images/770x413/-_190308183842-912.jpg"},
        {"Belut sawah","Belut sawah, mua, atau lindung (Monopterus albus) adalah sejenis ikan anggota suku Synbranchidae (belut), ordo Synbranchiiformes, yang mempunyai nilai ekonomi dan ekologi. Ikan ini dapat dimakan, baik digoreng, dimasak dengan saus pedas asam, atau digoreng renyah sebagai makanan ringan. Secara ekologi, belut dapat dijadikan indikator pencemaran lingkungan karena hewan ini mudah beradaptasi. Lenyapnya belut menandakan kerusakan lingkungan yang sangat parah telah terjadi. ","https://upload.wikimedia.org/wikipedia/commons/8/89/Monopterus_albus_4.jpg"},
        {"Lele","Lele atau ikan keli, adalah sejenis ikan yang hidup di air tawar. Lele mudah dikenali karena tubuhnya yang licin, agak pipih memanjang, serta memiliki \"kumis\" yang panjang, yang mencuat dari sekitar bagian mulutnya. ","https://cdn2.tstatic.net/style/foto/bank/images/lele_20180303_132628.jpg"},
        {"Unta","Unta atau Onta adalah dua spesies hewan berkuku belah dari genus Camelus (satu berpunuk tunggal - Camelus dromedarius, satu lagi berpunuk ganda - Camelus bactrianus) yang hidup ditemukan di wilayah kering dan gurun di Asia dan Afrika Utara. Rata-rata umur harapan hidup unta adalah antara 30 sampai 50 tahun","https://upload.wikimedia.org/wikipedia/commons/8/8b/CamelFrankfurt.jpg"},
        {"Kuda"," (Equus caballus atau Equus ferus caballus) adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun. ","https://upload.wikimedia.org/wikipedia/commons/a/a0/Dunkelfuchsstute-Ciara16.jpg"},
        {"Dinosaurus","Dinosaurus adalah kelompok hewan purbakala dari klad Dinosauria. Dinosaurus pertama kali muncul pada periode Trias, sekitar 230 juta tahun yang lalu, dan merupakan vertebrata dominan selama 135 juta tahun, yang dimulai sejak periode Jura (sekitar 201 juta tahun yang lalu) hingga berakhirnya periode Kapur (65 juta tahun yang lalu), dan kemudian musnah akibat peristiwa kepunahan Kapur-Paleogen sebelum Era Mesozoikum.","https://upload.wikimedia.org/wikipedia/commons/4/45/Velociraptor_models.jpg"},
};

public static ArrayList<Animal> getListData(){
        ArrayList<Animal> list = new ArrayList<>();
        for (String[] aData : data) {
        Animal animal = new Animal();
        animal.setName(aData[0]);
        animal.setDetail(aData[1]);
        animal.setPhoto(aData[2]);
        list.add(animal);
        }
        return list;
}
}
