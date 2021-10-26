package com.example.recyclerview_reyner_29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firearmList = listOf<Firearm>(
            Firearm(
                R.drawable.ak_47,
                "AK-47",
                "The AK-47, officially known as the Avtomat Kalashnikova (Russian: Автома́т Кала́шникова, lit. 'Kalashnikov's automatic rifle'; also known as the Kalashnikov or just AK), is a gas-operated assault rifle that is chambered for the 7.62×39mm cartridge.",
                "The AK-47, officially known as the Avtomat Kalashnikova (Russian: Автома́т Кала́шникова, lit. 'Kalashnikov's automatic rifle'; also known as the Kalashnikov or just AK), is a gas-operated assault rifle that is chambered for the 7.62×39mm cartridge. Developed in the Soviet Union by Russian small-arms designer Mikhail Kalashnikov, it is the originating firearm of the Kalashnikov (or \"AK\") family of rifles. After more than seven decades, the AK-47 model and its variants remain the most popular and widely used rifles in the world.",
                "During World War II, the Sturmgewehr 44 rifle used by German forces made a deep impression on their Soviet counterparts.[10][11] The select-fire rifle was chambered for a new intermediate cartridge, the 7.92×33mm Kurz, and combined the firepower of a submachine gun with the range and accuracy of a rifle.[12][13] On 15 July 1943, an earlier model of the Sturmgewehr was demonstrated before the People's Commissariat of Arms of the USSR.[14] The Soviets were impressed with the weapon and immediately set about developing an intermediate caliber fully automatic rifle of their own,[10][11] to replace the PPSh-41 submachine guns and outdated Mosin–Nagant bolt-action rifles that armed most of the Soviet Army.[15]"
            ),
            Firearm(
                R.drawable.akm,
                "AKM",
                "The AKM (Russian: Автома́т Кала́шникова модернизи́рованный, tr. Avtomát Kalášnikova modernizírovannyj, lit. 'Kalashnikov's Automatic Rifle Modernised') is an assault rifle designed by Soviet small arms designer Mikhail Kalashnikov in 1959.",
                "The AKM (Russian: Автома́т Кала́шникова модернизи́рованный, tr. Avtomát Kalášnikova modernizírovannyj, lit. 'Kalashnikov's Automatic Rifle Modernised') is an assault rifle designed by Soviet small arms designer Mikhail Kalashnikov in 1959. It is the most ubiquitous rifle of the Kalashnikov rifles. It was developed as replacement to AK-47 introduced a decade prior.",
                "Introduced into service with the Soviet Army in 1959, the AKM is the most prevalent variant of the entire AK series of firearms and it has found widespread use with most member states of the former Warsaw Pact and its African and Asian allies as well as being widely exported and produced in many other countries. The production of these rifles was carried out at both the Tula Arms Plant and Izhmash. It was officially replaced in Soviet frontline service by the AK-74 in the late 1970s, but remains in use worldwide.\n" +
                        "\n" +
                        "The AKM maintains the AK-47's wood stock, but has simpler individual parts that are favorable for mass production. Like the AK-47, many variants of the AKM exist such as the AKMS, AKML, and AKMP."
            ),
            Firearm(
                R.drawable.ak_74,
                "AK-74",
                "The AK-74 (Russian: Автомат Калашникова образца 1974 года or \"Kalashnikov automatic rifle model 1974\") is an assault rifle designed by Soviet small arms designer Mikhail Kalashnikov in 1974.",
                "The AK-74 (Russian: Автомат Калашникова образца 1974 года or \"Kalashnikov automatic rifle model 1974\") is an assault rifle designed by Soviet small arms designer Mikhail Kalashnikov in 1974. It is chambered for the 5.45×39mm cartridge, which replaced the 7.62×39mm cartridge of Kalashnikov's earlier automatic weapons for the Soviet armed forces.",
                "The rifle first saw service with Soviet forces in the 1979 Afghanistan conflict.[10] The head of the Afghan bureau of the Pakistani Inter-Services Intelligence claimed that the CIA paid \$5,000 for the first AK-74 captured by the Afghan mujahideen during the Soviet–Afghan War.[11]\n" +
                        "\n" +
                        "As of 2021, most countries of the former Soviet Union use the rifle. Licensed copies were produced in Bulgaria (AK-74, AKS-74 and AKS-74U), and in the former East Germany (MPi-AK-74N, MPi-AKS-74N, MPi-AKS-74NK)."
            ),
            Firearm(
                R.drawable.ak_12,
                "AK-12",
                "The AK-12 is a Russian assault rifle chambered in 5.45×39mm designed and manufactured by the Kalashnikov Concern (formerly Izhmash), making it the fifth generation of Kalashnikov rifles.",
                "The AK-12 is a Russian assault rifle chambered in 5.45×39mm designed and manufactured by the Kalashnikov Concern (formerly Izhmash), making it the fifth generation of Kalashnikov rifles.[10]\n" +
                        "\n" +
                        "Kalashnikov Concern also offers a variant of the AK-12 chambered in 7.62×39mm, known as the AK-15 due to the request of the Russian military and a variant chambered in 5.56×45mm NATO, known as the AK-19 upon the request of international clients. Compact variants of the AK-12 and AK-15 are also under development, respectively the AK-12K and AK-15K which features a shorter barrel.",
                "The AK-12 project began in 2011 by the IZHMASH factory which became part of the Kalashnikov Concern as a private venture, in an attempt to participate in the \"Ratnik\" trials which were held by the Russian Army.[11] It was further developed by Kalashnikov Concern, throughout its development and evaluation stage it has received multiple modifications to meet the Russian military's standard and to address the Russian Army's concerns regarding the cost and issues in fully automatic fire of the earlier prototype models. It went through several revisions in order to improve upon the \"range of defects\" that were discovered on the earlier prototype models that were derived from the AK-200. These were later abandoned in favour for the proven and improved AK-400, which became the finalised model of the AK-12."
            ),
//            Firearm(
//                R.drawable.pkm,
//                "PKM",
//                "PK, adalah senapan mesin serba guna yang dilengkapi sabuk pengaman, dengan bilik untuk kartrid berbingkai 7,62x54mmR.",
//                "PK, adalah senapan mesin serba guna yang dilengkapi sabuk pengaman, dengan bilik untuk kartrid berbingkai 7,62x54mmR. Dirancang di Uni Soviet dan saat ini dalam produksi di Rusia, senapan mesin PK asli diperkenalkan pada tahun 1961 dan varian PKM yang ditingkatkan diperkenalkan pada tahun 1969."
//            ),
//            Firearm(
//                R.drawable.pkp,
//                "PKP",
//                "PKP Pecheneg adalah senapan mesin serba guna 7,62x54mmR Rusia.",
//                "PKP Pecheneg adalah senapan mesin serba guna 7,62x54mmR Rusia. Ini adalah pengembangan dan modifikasi lebih lanjut dari senapan mesin PK."
//            ),
//            Firearm(
//                R.drawable.rpk,
//                "RPK",
//                "RPK adalah senapan mesin ringan yang menggantikan RPD sebagai senjata otomatis regu Uni Soviet.",
//                "RPK (Ruchnoy pulemyot Kalashnikova, Bahasa Rusia: Ручной пулемёт Калашникова) adalah senapan mesin ringan yang menggantikan RPD sebagai senjata otomatis regu Uni Soviet."
//            ),
            Firearm(
                R.drawable.saiga_12,
                "Saiga-12",
                "The Saiga-12 (/ˈsaɪɡə/) is a shotgun available in a wide range of configurations, patterned after the Kalashnikov series of rifles and named after the Saiga antelope.",
                "The Saiga-12 (/ˈsaɪɡə/) is a shotgun available in a wide range of configurations, patterned after the Kalashnikov series of rifles and named after the Saiga antelope. Like the Kalashnikov rifle variants, it is a rotating bolt, gas-operated gun that feeds from a box magazine. All Saiga-12 configurations are recognizable as Kalashnikov-pattern guns by the large lever-safety on the right side of the receiver, the optic mounting rail on the left side of the receiver and the large top-mounted dust cover held in place by the rear of the recoil spring assembly.",
                "The Saiga-12 is manufactured by the arms division of Izhmash, in Russia. Izhmash also manufactures Saiga 20s and Saiga 410s in 20-gauge and .410 bore, as well as the Saiga semi-automatic hunting rifles in a number of centerfire calibers.[2] Russian armed forces use a combat shotgun variant called the KSK (Karabin Spetsialniy Kalahnikov, \"Kalashnikov Special Carbine\"), with the 12-gauge size expressed in its metric equivalent of 18.5 mm. The Picatinny rail layout is similar to the civilian 030 version."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_firearm)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FirearmAdapter(this, firearmList){
            val intent = Intent(this, DetailFirearmActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}